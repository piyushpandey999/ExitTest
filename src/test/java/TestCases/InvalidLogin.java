package TestCases;

import Base.SetupPage;
import Pages.LoginPage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class InvalidLogin extends SetupPage {
    public static Logger log = Logger.getLogger(InvalidLogin.class);

    @Test
    public void invalidLogin(){
        log.info("Generating the extent report");
        test.log(LogStatus.INFO,"Test Failed");

        // ----- creating the object of LoginPage class ---------
        LoginPage loginPage = new LoginPage(driver);

        // ------ calling the method of loginpage class ------------
        log.info("entering username and invalid password to login");
        loginPage.invalidlogin();
        log.info("user is not logged in");
    }

}
