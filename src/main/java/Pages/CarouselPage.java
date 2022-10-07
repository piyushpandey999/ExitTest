package Pages;

import CommonMethods.Common;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CarouselPage {

    public static Logger log = Logger.getLogger(CarouselPage.class);

    // ---------- Elements ---------------
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'✕')]")
    WebElement cross;
    @FindBy(how = How.CLASS_NAME,using = "_2t2dSp")
    WebElement nextBtn;

    public CarouselPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // -------------- Method to click next button to change carousel -----------------
    public void checkCarousel(){
        log.info("click pn the cross button");
        cross.click();
        log.info("click on the carousel button multiple times");
        for (int i = 0; i <7; i++) {
            Common.clickOnElement(nextBtn);
        }
    }
}
