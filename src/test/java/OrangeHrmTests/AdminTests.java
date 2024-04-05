package OrangeHrmTests;

import OrangeHRMPages.AdminPage;
import OrangeHRMPages.HomePage;
import OrangeHRMPages.LoginPage;
import OrangeHRMPages.UserManagementPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AdminTests extends Base{

    String UserName = "aamrfou";
    String UserNameField = "Admin";
    String Password = "aamrfou55";
    String ConfirmPassword = "aamrfou55";
    String EmployeeHint = "e";
    String Element ="Admin";

    @Test
    public void AddAdminToThePage(){
        Base.WaitMethodOfLogin(LoginPage.ReturnUserName()).Login(LoginTests.UserName, LoginTests.Password);
        Base.WaitMethodOfHome(HomePage.GetValidLogin()).
                ClickOnAdminButton();
        Base.WaitMethodOfUserManagement(UserManagementPage.AddButton()).
                ClickOnAddButton();
        Base.WaitMethodOfAdmin(AdminPage.GetUserRoleDropDownMenu()).
                AddAdmin(EmployeeHint,UserName, Password, ConfirmPassword);
        Base.WaitMethodOfUserManagement(UserManagementPage.AssertAddAdmin());
        Base.AssertMethod(driver.findElement(UserManagementPage.AssertAddAdmin()).isDisplayed());
    }
@Test
    public void DeleteAdminFunction(){
        Base.WaitMethodOfLogin(LoginPage.ReturnUserName()).
                Login(LoginTests.UserName, LoginTests.Password);
        Base.WaitMethodOfHome(HomePage.GetValidLogin()).
                ClickOnAdminButton();
        Base.WaitMethodOfUserManagement(UserManagementPage.AddButton()).
                DeleteAdmin();
        Base.WaitMethodOfUserManagement(UserManagementPage.DeleteMassage());
        Assert.assertTrue(driver.findElement(UserManagementPage.DeleteMassage()).isDisplayed());
    }
    @Test
    public void SearchAdminName(){
        Base.WaitMethodOfLogin(LoginPage.ReturnUserName()).
                Login(LoginTests.UserName, LoginTests.Password);
        Base.WaitMethodOfHome(HomePage.GetValidLogin()).
                ClickOnAdminButton();
        Base.WaitMethodOfUserManagement(UserManagementPage.AddButton()).SearchAdmin(UserNameField);
        Base.WaitMethodOfUserManagement(UserManagementPage.AssertSelectAdmin(Element));
        Assert.assertTrue(driver.findElement(UserManagementPage.AssertSelectAdmin(Element)).isDisplayed());

    }


}
