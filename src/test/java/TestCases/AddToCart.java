package TestCases;

import Base.SetupPage;
import Pages.AddToCartPage;
import Pages.LoginPage;
import Pages.SearchPage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddToCart extends SetupPage {
    public static Logger log = Logger.getLogger(AddToCart.class);


    @Test(priority = 0)
    public void Login() throws InterruptedException {

        // --------- creating the object of LoginPage ----------

        LoginPage loginPage = new LoginPage(driver);
        log.info("entering username and password to login");
        loginPage.validlogin(username,password);
        TimeUnit.SECONDS.sleep(3);
        log.info("logged in");
    }



    @Test(priority = 1)
    public void AddItemToCart() throws InterruptedException {

        log.info("Generating the extent report");
        test.log(LogStatus.INFO,"Test Passed");

        // --------- creating the object of LoginPage,SearchPage and AddToCartPage class ----------

        SearchPage searchPage = new SearchPage(driver);
        AddToCartPage ap = new AddToCartPage(driver);

        // ------ calling the methods of loginPage, SearchPage and AddToCartPage class ----------------
        log.info("search the item");
        searchPage.search();
        TimeUnit.SECONDS.sleep(3);

        log.info("add the searched item to cart");
        ap.AddToCart();
        log.info("item added to cart");


    }
}
