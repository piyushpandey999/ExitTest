package Pages;

import CommonMethods.Common;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

import static Base.SetupPage.driver;

public class AddToCartPage {

    private static final Logger log = Logger.getLogger(AddToCartPage.class);

    // ---------- Elements ---------------
    @FindBy(how = How.XPATH, using = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
    WebElement firstItem;
    @FindBy(how = How.XPATH,using = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")
    WebElement add;

    public AddToCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // ------------ Method to add an item to the cart -------------
    public void AddToCart() {

        log.info("click on the product to go to the product page");
        Common.clickOnElement(firstItem);
        Set<String> window = driver.getWindowHandles();
        Iterator<String> iterate = window.iterator();
        iterate.next();
        String secondWindow = (String) iterate.next();
        driver.switchTo().window(secondWindow);
        log.info("click add to cart button to add the product in the cart");
        Common.clickOnElement(add);

    }

}
