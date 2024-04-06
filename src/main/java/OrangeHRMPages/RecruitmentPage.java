package OrangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentPage {
    private  final WebDriver driver;
    public RecruitmentPage(WebDriver driver){
        this.driver = driver;
    }



    public static By GetEyeButton(){
        return By.xpath("(//i[@class='oxd-icon bi-eye-fill'])[1]");
    }


    public void NavigateToRecrutimentEditPage(){
        driver.findElement(RecruitmentPage.GetEyeButton()).click();
    }
}
