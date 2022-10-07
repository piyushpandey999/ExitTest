package TestCases;

import Base.SetupPage;
import Pages.CouponPage;
import Pages.LoginPage;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Coupons extends SetupPage {
    public static Logger log = Logger.getLogger(Coupons.class);

    @Test(priority = 0)
    public void logIn(){
        LoginPage loginPage = new LoginPage(driver);
        log.info("entering username and password to login");
        loginPage.validlogin(username,password);
        log.info("logged in");
    }
    @Test(priority = 1)
    public void goToCoupons() throws InterruptedException {
        CouponPage cp = new CouponPage(driver);
        log.info("click on coupons to go to the coupons page");
        cp.clickCoupon();
        log.info("coupon page open");
    }
}
