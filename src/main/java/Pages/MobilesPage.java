package Pages;

import CommonMethods.Common;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MobilesPage {

    public static Logger log = Logger.getLogger(MobilesPage.class);

    // -------------- Elements ----------------
    @FindBy(xpath = "//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]")
    WebElement mobile;

    public MobilesPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // --------- method to go to the mobiles page ------------------
    public void clickonMobiles(){
        log.info("clicking on the mobiles link");
        Common.clickOnElement(mobile);
    }
}
