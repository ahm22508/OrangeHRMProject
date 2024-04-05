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


    public static By GetValidLogin(){
        return By.xpath("//h6[text()='Dashboard']");
    }

   public void LogoutThePage(){
        driver.findElement(HomePage.GetValidLogin()).click();
        driver.findElement(LogoutButton).click();
   }
   public void ClickOnAdminButton(){
        driver.findElement(AdminButton).click();
   }
}