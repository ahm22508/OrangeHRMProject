package OrangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
   private final WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    private static final By UserNameField = By.xpath("//input[@name='username']");
    private static final By PasswordField = By.xpath("//input[@name='password']");
    private static final By LoginButton = By.xpath("//button[@type='submit']");

    public static By ReturnUserName(){
        return UserNameField;
    }
    public static By GetErrorLoginButton(){
      return By.xpath("//p[text()='Invalid credentials']");
    }

    public void Login(String UserName, String Password){
        driver.findElement(UserNameField).sendKeys(UserName);
        driver.findElement(PasswordField).sendKeys(Password);
        driver.findElement(LoginButton).click();
    }
}
