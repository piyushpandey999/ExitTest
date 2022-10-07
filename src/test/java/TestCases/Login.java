package TestCases;

import Pages.LoginPage;
import Base.SetupPage;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class Login extends SetupPage {


    @Test
    public void login() {
        log.info("Generating the extent report");
        test.log(LogStatus.INFO,"Test Passed");

        // ----- creating the object of LoginPage class ---------
        LoginPage loginPage = new LoginPage(driver);

        // ------ calling the method of loginpage class ------------
        log.info("user enter username and password to login");
        loginPage.validlogin(username,password);
        log.info("user is logged in ");
    }
}
