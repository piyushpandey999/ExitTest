package TestCases;

import Base.SetupPage;
import Pages.DownloadAppPage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class DownloadApp extends SetupPage {
    public static Logger log = Logger.getLogger(DownloadApp.class);

    @Test
    public void download() throws InterruptedException {
        log.info("Generating the extent report");
        test.log(LogStatus.INFO,"Test Passed");

        // ----- creating the object of DownlaodAppPage class ----------
        DownloadAppPage downloadAppPage = new DownloadAppPage(driver);

        // ------ calling the method of DownlaodAppPage class ---------------
        downloadAppPage.clickDownload();
    }
}

