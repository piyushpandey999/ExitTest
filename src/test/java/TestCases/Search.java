package TestCases;

import Base.SetupPage;
import Pages.SearchPage;
import Utilities.Generic;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Search extends SetupPage {
    public static Logger log = Logger.getLogger(Search.class);

    @Test
    public void search(){
        log.info("Generating the extent report");
        test.log(LogStatus.INFO,"Test Passed");

        // ------- creating the object of SearchPage class ----------
        SearchPage searchPage = new SearchPage(driver);

        Generic.clickCross();

        // ------ calling the method of SearchPage class ------------------

        log.info("user searches item in the search bar");
        searchPage.search();
        log.info("gets the result");

    }
}
