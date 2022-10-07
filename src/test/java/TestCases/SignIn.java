package TestCases;

import Base.SetupPage;
import Pages.SignInPage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class SignIn extends SetupPage {
    public static Logger log = Logger.getLogger(SignIn.class);
    SignInPage signInPage;

    @Test
    public void signIn(){
        log.info("Generating the extent report");
        test.log(LogStatus.INFO,"Test Passed");

        // ------- creating the object of SignInPage class ----------
        signInPage = new SignInPage(driver);

        // ------ calling the method of SignInPage class -------------------
        log.info("creating a new account");
        signInPage.clickOnSignIn();
    }
}
