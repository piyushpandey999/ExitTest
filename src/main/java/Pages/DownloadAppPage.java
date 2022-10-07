package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static Base.SetupPage.driver;

public class DownloadAppPage {

    // ---------- Elements -----------
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'✕')]")
    WebElement cross;
    @FindBy(how = How.XPATH,using = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]")
    WebElement menu;
    @FindBy(how = How.XPATH,using = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[4]")
    WebElement download;

    public DownloadAppPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // ----------- method to go to the download page to download the app ------------------
    public void clickDownload() throws InterruptedException {
        cross.click();
        // ------- Instantiating Actions class -------------
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).build().perform();
        TimeUnit.SECONDS.sleep(2);
        // ------- To mouseover on sub menu -------------------
        actions.moveToElement(download).click().build().perform();
    }
}

