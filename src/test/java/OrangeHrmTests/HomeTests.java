package OrangeHrmTests;

import OrangeHRMPages.HomePage;
import OrangeHRMPages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTests extends Base {

    @Test
    public void LogoutTestCase(){
     Base.WaitMethodOfLogin(LoginPage.ReturnUserName()).Login(LoginTests.UserName, LoginTests.Password);
     Base.WaitMethodOfHome(HomePage.GetValidLogin()).LogoutThePage();
     Base.WaitMethodOfLogin(LoginPage.ReturnUserName());
     boolean AssertLogout = driver.findElement(LoginPage.ReturnUserName()).isDisplayed();
     Assert.assertTrue(AssertLogout);
    }
}
