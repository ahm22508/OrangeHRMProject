package OrangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserManagementPage {
    private final WebDriver driver;
    public UserManagementPage(WebDriver driver){
        this.driver = driver;
    }

    private final By DeleteButton = By.xpath("(//i[@class='oxd-icon bi-trash'])[1]");
    private final By AlertDelete = By.xpath("//button[text()=' Yes, Delete ']");
    private final By UserNameField = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By SearchButton= By.xpath("//button[text()=' Search ']");

    public static By AddButton(){
        return By.xpath("//button[text()=' Add ']");
    }
    public static By AssertAddAdmin(){
        return By.xpath("//p[text()='Successfully Saved']");
    }
    public static By AssertSelectAdmin (String AssertElement){
        return By.xpath("(//div[text()=\""+AssertElement+"\"])[1]");
    }

    public void ClickOnAddButton(){
        driver.findElement(UserManagementPage.AddButton()).click();
    }
    public static By DeleteMassage(){
        return By.xpath("//p[text()='Successfully Deleted']");
    }
    public void DeleteAdmin(){
        driver.findElement(DeleteButton).click();
        driver.findElement(AlertDelete).click();
    }
    public void SearchAdmin(String UserName){
        driver.findElement(UserNameField).sendKeys(UserName);
        driver.findElement(SearchButton).click();
    }

}
