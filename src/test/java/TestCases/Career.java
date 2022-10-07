package TestCases;

import Base.SetupPage;
import Pages.CareerPage;
import Utilities.Generic;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Career extends SetupPage {
    public static Logger log = Logger.getLogger(Career.class);

    @Test(priority = 0)
    public void clickCross(){
        log.info("clicking cross button");
        Generic.clickCross();
    }

    @Test(priority = 1)
    public void career(){
        log.info("Generating the extent report");
        test.log(LogStatus.INFO,"Test Passed");

        // ----- creating the object of CareerPage class ----------
        CareerPage cp = new CareerPage(driver);
        SoftAssert softAssert = new SoftAssert();

        log.info("click on the career to go to the job page");
        cp.clickOnCareer();
        log.info("career page open");
        String title = driver.getTitle();
        String Expected_Title = ReadingPropertiesFile.getProperty("expected_CareerTitle");
        softAssert.assertEquals(Expected_Title,title);
    }
}
