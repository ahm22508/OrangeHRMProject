package OrangeHrmTests;

import OrangeHRMPages.EditRecruitmentPage;
import OrangeHRMPages.HomePage;
import OrangeHRMPages.LoginPage;
import OrangeHRMPages.RecruitmentPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RecruitmentTests extends Base{
    String FirstName = "Juan";
    String MiddleName = "Raul";
    String LastName = "Antonio";

    @Test
    public void EditRecruitmentFunction(){
        Base.WaitMethodOfLogin(LoginPage.ReturnUserName()).
                Login(LoginTests.UserName,LoginTests.Password);
        Base.WaitMethodOfHome(HomePage.GetRecruitmentButton()).
                NavigateToRecrutimentPage();
        Base.WaitMethodOfRecruitmente(RecruitmentPage.GetEyeButton()).
                NavigateToRecrutimentEditPage();
        Base.WaitMethodOfRecruitmenteEditPage(EditRecruitmentPage.GetFirstNameField()).
                EditRecruitment(FirstName,MiddleName,LastName);
        Base.WaitMethodOfRecruitmenteEditPage(EditRecruitmentPage.GetNotificacionMassage());
        Assert.assertTrue(driver.findElement(EditRecruitmentPage.GetNotificacionMassage()).isDisplayed());
    }
}
