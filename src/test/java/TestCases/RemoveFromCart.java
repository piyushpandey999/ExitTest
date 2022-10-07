package TestCases;

import Base.SetupPage;
import Pages.LoginPage;
import Pages.RemoveFromCartPage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RemoveFromCart extends SetupPage {
    public static Logger log = Logger.getLogger(RemoveFromCart.class);


    @Test(priority = 0)
    public void login() throws InterruptedException {

        // ----- creating the object of LoginPage ----------

        LoginPage loginPage = new LoginPage(driver);
        log.info("user enter username and password to login");
        loginPage.validlogin(username,password);
        log.info("user is logged in");
        TimeUnit.SECONDS.sleep(2);
    }


    @Test(priority = 1)
    public void removeItemFromCart() throws InterruptedException {

        log.info("Generating the extent report");
        test.log(LogStatus.INFO,"Test Passed");

        // ----- creating the object of RemoveCartPage clas -------

        RemoveFromCartPage remove = new RemoveFromCartPage(driver);

        // ------ calling the methods of RemoveCartPage class ----------
        log.info("removing item from the cart");
        remove.removeFromCart();
        log.info("item removed");
    }
}
