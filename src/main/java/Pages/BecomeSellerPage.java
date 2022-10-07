package Pages;

import CommonMethods.Common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BecomeSellerPage {

    @FindBy(how = How.XPATH,using = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[4]/a[1]")
    WebElement seller;

    public BecomeSellerPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void becomeSeller(){
        Common.clickOnElement(seller);
    }
}
