package OrangeHrmTests;

import OrangeHRMPages.HomePage;
import OrangeHRMPages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends Base{
   static String UserName = "Admin";
    static String Password ="admin123";
    static String InvalidUserName = "adm";
    static String InvalidPassword = "adm11";

    @Test
    public void ValidLogin(){
       new LoginPage(driver).Login(UserName, Password);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.GetValidLogin()));
        Assert.assertTrue(driver.findElement(HomePage.GetValidLogin()).isDisplayed());

    }
    @Test
    public void InValidLogin(){
        new LoginPage(driver).Login(InvalidUserName, InvalidPassword);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.GetErrorLoginButton()));
        Assert.assertTrue(driver.findElement(LoginPage.GetErrorLoginButton()).isDisplayed());
    }
}
