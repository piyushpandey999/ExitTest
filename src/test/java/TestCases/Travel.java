package TestCases;

import Base.SetupPage;
import Pages.SearchPage;
import Pages.TravelPage;
import Utilities.Generic;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Travel extends SetupPage {
    public static Logger log = Logger.getLogger(Travel.class);

    @Test
    public void travel(){

        log.info("Generating the extent report");
        test.log(LogStatus.INFO,"Test Passed");

        // ----- creating the object of TravelPage class ---------
        TravelPage tp = new TravelPage(driver);

        log.info("click on cross button");
        Generic.clickCross();

        // ------ calling the method of TravelPage class ---------------

        log.info("click on the travels to go to the travel page");
        tp.clickTravels();
        log.info("travel page open");
    }
}
