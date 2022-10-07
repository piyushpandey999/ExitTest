package TestCases;

import Base.SetupPage;
import Pages.LoginPage;
import Pages.MyProfilePage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class MyProfile extends SetupPage {
    public static Logger log = Logger.getLogger(MyProfile.class);


    @Test(priority = 0,enabled = true)
    public void login(){
        LoginPage loginPage = new LoginPage(driver);
        log.info("user enter username and password to login");
        loginPage.validlogin(username,password);
        log.info("user is logged in");
    }

    @Test(priority = 1,dependsOnMethods = {"login"})
    public void goToMyProfile() throws InterruptedException {
        log.info("Generating the extent report");
        test.log(LogStatus.INFO,"Test Passed");

        MyProfilePage mp = new MyProfilePage(driver);
        log.info("click on my profile to go to the my profile section");
        mp.clickMyProfile();
        log.info("user is on my profile page");
    }
}
