package TestCases;

import Base.SetupPage;
import Pages.LogOutPage;
import Pages.LoginPage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LogOut extends SetupPage {
    public static Logger log = Logger.getLogger(LogOut.class);

    @Test(priority = 0,enabled = true)
    public void logIn(){
        LoginPage loginPage = new LoginPage(driver);
        log.info("entering username and password to login");
        loginPage.validlogin(username,password);
        log.info("logged in");
    }
    @Test(priority = 1,dependsOnMethods = {"logIn"})
    public void logOut() throws InterruptedException {
        log.info("Generating the extent report");
        test.log(LogStatus.INFO,"Test Passed");

        LogOutPage lp = new LogOutPage(driver);
        log.info("log out button clicked");
        lp.logOut();
        log.info("user is logged out");
    }
}
