package OrangeHRMPages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class AdminPage {
    private  final WebDriver driver;
    public AdminPage(WebDriver driver){
        this.driver = driver;
    }
    private final By AdminSelectOption = By.xpath("(//span[text()='Admin'])[2]");
    private  final By AdminDropDownMenu = By.xpath("(//div[text()='-- Select --'])[1]");
    private final By StatusSelectOption = By.xpath("//span[text()='Enabled']");
    private final By StatusDropDownMenu= By.xpath("//div[text()='-- Select --']");
    private final By EmployeeNameField=By.xpath("//input[@placeholder= 'Type for hints...']");
    private final By UserNameField=  By.xpath("(//input[@class= 'oxd-input oxd-input--active'])[2]");
    private final By ConfirmPasswordField = By.xpath("(//input[@type='password'])[2]");
    private final By PasswordField = By.xpath("(//input[@type='password'])[1]");
    private final By SaveButton = By.xpath("//button[text()=' Save ']");
    private final By EmployeeElement = By.xpath("//span[text()='yedghjb1 ru84 90jsnd']");
    public static By GetUserRoleDropDownMenu(){
        return By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");
    }

   public  void AddAdmin(String EmployeeHint, String USerName, String Password, String ConfirmPassword){
       driver.findElement(AdminDropDownMenu).click();
       driver.findElement(AdminSelectOption).click();
       driver.findElement(EmployeeNameField).sendKeys(EmployeeHint);
       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
       wait.until(ExpectedConditions.visibilityOfElementLocated(EmployeeElement));
       driver.findElement(EmployeeElement).click();
       driver.findElement(UserNameField).sendKeys(USerName);
       driver.findElement(PasswordField).sendKeys(Password);
       driver.findElement(ConfirmPasswordField).sendKeys(ConfirmPassword);
       driver.findElement(StatusDropDownMenu).click();
       driver.findElement(StatusSelectOption).click();
       driver.findElement(SaveButton).click();
    }
}
