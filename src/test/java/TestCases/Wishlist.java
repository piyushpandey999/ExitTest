package TestCases;

import Base.SetupPage;
import Pages.LoginPage;
import Pages.WishlistPage;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Wishlist extends SetupPage {
    public static Logger log = Logger.getLogger(LogOut.class);

    @Test(priority = 0,enabled = true)
    public void logIn(){
        LoginPage loginPage = new LoginPage(driver);
        log.info("user enter username and password to login");
        loginPage.validlogin(username,password);
    }
    @Test(priority = 1,dependsOnMethods = {"logIn"})
    public void goTOWishlist() throws InterruptedException {
        WishlistPage wishlistPage = new WishlistPage(driver);
        log.info("click on wishlist to go to the wishlist section");
        wishlistPage.clickWishlist();
        String title = driver.getTitle();
        System.out.println(title);
    }
}
