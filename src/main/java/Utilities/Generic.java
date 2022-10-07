package Utilities;

import Base.SetupPage;
import CommonMethods.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generic extends SetupPage{;
static By btn = By.xpath("//button[contains(text(),'✕')]");

    public Generic(WebDriver driver) {
        Generic.driver = driver;
    }
    public static void clickCross(){
        WebElement cross = driver.findElement(btn);
        Common.clickOnElement(cross);
    }

}
