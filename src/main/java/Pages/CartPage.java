package Pages;

import CommonMethods.Common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    // ---------- Elements -------------
    @FindBy(how = How.XPATH,using = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/a[1]")
    WebElement cart;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // ----------- Method to click on the cart --------------------
    public void clickOnCart(){
        Common.clickOnElement(cart);
    }
}
