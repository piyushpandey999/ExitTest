package TestCases;

import Base.SetupPage;
import Pages.FlipkartPlusPage;
import Pages.SearchPage;
import Utilities.Generic;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class FlipkartPlus extends SetupPage {
    public static Logger log = Logger.getLogger(FlipkartPlus.class);

    @Test
    public void goToFlipkartPlus(){

        log.info("cross button clicked");
        Generic.clickCross();

        // --------- creating the object of FlipkartPlusPage class --------
        FlipkartPlusPage fp =  new FlipkartPlusPage(driver);
        log.info("click on the flipkart plus");
        // ------ calling the method of FlipkartPlusPage class -----------------
        fp.clickPlus();
    }

}
