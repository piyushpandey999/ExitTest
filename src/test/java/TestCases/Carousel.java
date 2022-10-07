package TestCases;

import Base.SetupPage;
import Pages.CarouselPage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Carousel extends SetupPage {
    public static Logger log = Logger.getLogger(Carousel.class);

    @Test
    public void carousel() {
        log.info("Generating the extent report");
        test.log(LogStatus.INFO,"Test Passed");

        // ----------- creating the object of CarouselPage class ---------------
        CarouselPage carouselPage = new CarouselPage(driver);

        // ----------- calling the method of CarouselPage class -----------------------
        carouselPage.checkCarousel();
    }
}
