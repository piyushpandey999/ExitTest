package TestCases;

import Base.SetupPage;
import Pages.CartPage;
import Utilities.Generic;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
public class Cart extends SetupPage {
    public static Logger log = Logger.getLogger(Cart.class);

    @Test(enabled = true)
    public void goToCart(){

        log.info("cross button clicked");
        Generic.clickCross();

        CartPage cp = new CartPage(driver);
        log.info("clicking the cart to go to cart section");
        cp.clickOnCart();
    }
}
