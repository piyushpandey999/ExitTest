package TestCases;

import Base.SetupPage;
import Pages.MobilesPage;
import Utilities.Generic;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Mobiles extends SetupPage {
    public static Logger log = Logger.getLogger(Mobiles.class);

    @Test
    public void clickMobiles(){
        log.info("Generating the extent report");
        test.log(LogStatus.INFO,"Test Passed");

        log.info("cross clicked");
        Generic.clickCross();

        // ----- creating the object of MobilesPage class ----------
        MobilesPage mobilesPage = new MobilesPage(driver);

        // ------ calling the method of MobilesPage class ----------------
        log.info("click on the mobies to go to mobiles section");
        mobilesPage.clickonMobiles();
    }
}
