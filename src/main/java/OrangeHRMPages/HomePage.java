package OrangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
   private final WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    private final By LogoutButton = By.xpath("//a[text()='Logout']");
    private final By AdminButton = By.xpath("(//span[text()='Admin'])[1]");
    private final By DropDownMenu =By.xpath("//i[@class ='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");



    public static By GetValidLogin(){
        return By.xpath("//h6[text()='Dashboard']");
    }


    public static By GetRecruitmentButton(){
        return By.xpath("//span[text()='Recruitment']");
    }

   public void LogoutThePage(){
        driver.findElement(DropDownMenu).click();
        driver.findElement(LogoutButton).click();
   }
   public void ClickOnAdminButton(){
        driver.findElement(AdminButton).click();
   }

    public void NavigateToRecrutimentPage(){
        driver.findElement(HomePage.GetRecruitmentButton()).click();
    }
}
