package OrangeHrmTests;

import OrangeHRMPages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import org.openqa.selenium.By;

public  class Base {
    public static WebDriver driver;

    public static void AssertMethod(boolean AssertValue){
        Assert.assertTrue(AssertValue);
    }
    public static LoginPage WaitMethodOfLogin(By ElementToWait){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ElementToWait));
        return new LoginPage(driver);
    }
    public static HomePage WaitMethodOfHome(By ElementToWait){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ElementToWait));
        return new HomePage(driver);
    }
    public static UserManagementPage WaitMethodOfUserManagement(By ElementToWait){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ElementToWait));
        return new UserManagementPage(driver);
    }

    public static AdminPage WaitMethodOfAdmin(By ElementToWait){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ElementToWait));
        return new AdminPage(driver);
    }
    public static RecruitmentPage WaitMethodOfRecruitmente(By ElementToWait) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ElementToWait));
        return new RecruitmentPage(driver);
    }
        public static EditRecruitmentPage WaitMethodOfRecruitmenteEditPage(By ElementToWait){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            wait.until(ExpectedConditions.visibilityOfElementLocated(ElementToWait));
            return new EditRecruitmentPage(driver);
        }

    @BeforeMethod
    public void StartTest(){
        driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
@AfterMethod
    public void EndTest(){
        driver.quit();
    }
}
