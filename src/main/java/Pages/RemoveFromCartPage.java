package Pages;

import CommonMethods.Common;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

import static Base.SetupPage.driver;

public class RemoveFromCartPage {

    public static Logger log = Logger.getLogger(RemoveFromCartPage.class);

        // --------- Web Elements -----------
        @FindBy(how = How.XPATH,using = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]")
        WebElement cart;
        @FindBy(how = How.XPATH,using = "//div[contains(text(),'Remove')]")
        WebElement removeBtn;
        @FindBy(how = How.XPATH,using = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]")
        WebElement btn;

    public RemoveFromCartPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // ------------ Method to remove item from the cart -----------------
    public void removeFromCart() throws InterruptedException {
        log.info("click on the cart button");
        Common.clickOnElement(cart);
        TimeUnit.SECONDS.sleep(3);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        log.info("scroll the page by 1000 pixels");
        js.executeScript("window.scrollBy(0,1000)");

        log.info("click on the remove button");
        Common.clickOnElement(removeBtn);
        log.info("confirm remove");
        Common.clickOnElement(btn);
        log.info("item removed");
    }
}
