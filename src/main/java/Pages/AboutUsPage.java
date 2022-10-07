package Pages;

import CommonMethods.Common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Base.SetupPage.driver;

public class AboutUsPage {

    // ---------- Elements -------------
    @FindBy(how = How.XPATH,using = "//a[contains(text(),'About Us')]")
    WebElement aboutUs;
    public AboutUsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // ----------- Method to click on the about us -----------------
    public void clickAboutUs(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(aboutUs)).click();
    }
}
