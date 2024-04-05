package OrangeHrmTests;

import OrangeHRMPages.HomePage;
import OrangeHRMPages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends Base{
   static String UserName = "Admin";
    static String Password ="admin123";
    static String InvalidUserName = "adm";
    static String InvalidPassword = "adm11";


    @Test
    public void ValidLogin(){
        Base.WaitMethodOfLogin((LoginPage.ReturnUserName())).Login(UserName, Password);
        Base.WaitMethodOfHome(HomePage.GetValidLogin());
        boolean AssertValidLogin = driver.findElement(HomePage.GetValidLogin()).isDisplayed();
        Assert.assertTrue(AssertValidLogin);
    }
    @Test
    public void InValidLogin(){
        Base.WaitMethodOfLogin(LoginPage.ReturnUserName()).Login(InvalidUserName,InvalidPassword);
        Base.WaitMethodOfHome(LoginPage.GetErrorLoginButton());
        boolean AssertInvalidLogin = driver.findElement(LoginPage.GetErrorLoginButton()).isDisplayed();
        Assert.assertTrue(AssertInvalidLogin);
    }
}
