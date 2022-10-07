package TestCases;

import Base.SetupPage;
import Pages.FailedTestPage;
import Utilities.Generic;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class FailedTest extends SetupPage {
    public static Logger log = Logger.getLogger(FailedTest.class);

    @Test(enabled = true)
    public void failed(){
        log.info("Generating the extent report");
        test.log(LogStatus.INFO,"Test Failed");

        log.info("cross clicked");
        Generic.clickCross();

        FailedTestPage fail = new FailedTestPage(driver);
        fail.clickElement();
        log.info("element not found ");
        log.info("Taking screenshots");
    }
}
