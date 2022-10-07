package TestCases;

import Base.SetupPage;
import Pages.AdvertisePage;
import Utilities.Generic;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Advertise extends SetupPage {
    public static Logger log = Logger.getLogger(Advertise.class);

    @Test(priority = 0)
    public void clickCross(){
        log.info("cross button clicked");
        Generic.clickCross();
    }

    @Test(priority = 1)
    public void goToAdvertise() throws InterruptedException {
        log.info("Generating the extent report");
        test.log(LogStatus.INFO,"Test Passed");

        AdvertisePage ap = new AdvertisePage(driver);
        SoftAssert softAssert = new SoftAssert();
        log.info("clicking the advertise to go to advertise page");
        ap.clickAdvertise();

        String title = driver.getTitle();
        String expectedTitle = ReadingPropertiesFile.getProperty("expected_advertiseTitle");
        softAssert.assertEquals(expectedTitle,title);

        log.info("checking the brand pulse of a brand");
        ap.checkBrandPulse();
    }
}
