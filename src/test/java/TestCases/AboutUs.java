package TestCases;

import Base.SetupPage;
import Pages.AboutUsPage;
import Utilities.Generic;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutUs extends SetupPage {
    public static Logger log = Logger.getLogger(AboutUs.class);

    @Test(enabled = true)
    public void aboutUs(){
        log.info("Generating the extent report");
        test.log(LogStatus.INFO,"Test Passed");

        // ----- creating the object of AboutUsPage class ----------
        AboutUsPage ap = new AboutUsPage(driver);
        log.info("click on the cross button");
        Generic.clickCross();
        log.info("About us clicked");
        ap.clickAboutUs();
        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("About Us");
        Assert.assertTrue(verifyTitle);
    }
}
