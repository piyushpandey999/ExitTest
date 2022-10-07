package Pages;

import CommonMethods.Common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPlusPage {

    // ---------- Elements -------------
    @FindBy(how = How.XPATH,using = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]")
    WebElement plus;

    public FlipkartPlusPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // ----------- Method to click on the flipkart plus  --------------------

    public void clickPlus(){
        Common.clickOnElement(plus);
    }
}
