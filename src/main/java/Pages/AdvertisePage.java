package Pages;

import CommonMethods.Common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AdvertisePage {
    @FindBy(how = How.XPATH,using = "//body/div[@id='container']/div[1]/footer[1]/div[1]/div[3]/div[2]/div[1]/div[2]/a[1]")
    WebElement advertise;
    @FindBy(how = How.XPATH,using = "//body/app-root[1]/flipscore-ext[1]/div[1]/div[1]/div[1]/div[3]/search[1]/div[1]/input[1]")
    WebElement input;
    @FindBy(how = How.XPATH,using = "//body/app-root[1]/flipscore-ext[1]/div[1]/div[1]/div[1]/div[3]/search[1]/div[1]/div[2]/infinite-scroll[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement select;


    public AdvertisePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickAdvertise() throws InterruptedException {
        Common.clickOnElement(advertise);
        TimeUnit.SECONDS.sleep(2);
    }
    public void checkBrandPulse() throws InterruptedException {
        Common.sendKeysToElement(input,"Apple");
        TimeUnit.SECONDS.sleep(2);
        Common.clickOnElement(select);
    }
}