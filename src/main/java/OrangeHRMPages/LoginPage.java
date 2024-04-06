package OrangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
   private final WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }


    private  final By PasswordField = By.xpath("//input[@name='password']");
    private  final By LoginButton = By.xpath("//button[@type='submit']");

    public static By ReturnUserName(){
        return By.xpath("//input[@name='username']");
    }
    public static By GetErrorLoginButton(){
      return By.xpath("//p[text()='Invalid credentials']");
    }

    public void Login(String UserName, String Password){
        driver.findElement(LoginPage.ReturnUserName()).sendKeys(UserName);
        driver.findElement(PasswordField).sendKeys(Password);
        driver.findElement(LoginButton).click();
    }
}
