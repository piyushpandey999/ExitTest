package TestCases;

import Base.SetupPage;
import Pages.BecomeSellerPage;
import Pages.LoginPage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BecomeSeller extends SetupPage {
    public static Logger log = Logger.getLogger(BecomeSeller.class);

    @Test(priority = 0,enabled = true)
    public void login() throws InterruptedException {
        log.info("Generating the extent report");
        test.log(LogStatus.INFO,"Test Passed");

        // ----- creating the object of LoginPage class ---------
        LoginPage loginPage = new LoginPage(driver);

        // ------ calling the method of loginpage class ------------
        log.info("entering username and password to login");
        loginPage.validlogin(username,password);

        log.info("logged in ");
        TimeUnit.SECONDS.sleep(2);
    }

    @Test(priority = 1)
    public void becomeSeller(){
        // ----- creating the object of LoginPage class ---------
        BecomeSellerPage bs = new BecomeSellerPage(driver);

        log.info("user goes to the become seller page");
        bs.becomeSeller();

        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sell Online on Flipkart | Grow your business with the leader in Indian e-commerce");
        Assert.assertTrue(verifyTitle);
    }
}
