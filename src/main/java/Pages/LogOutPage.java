package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static Base.SetupPage.driver;

public class LogOutPage {

    // ------ Element ------------
    @FindBy(how = How.XPATH,using = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]")
    WebElement profile;
    @FindBy(how = How.XPATH,using = "//div[contains(text(),'Logout')]")
    WebElement logOut;

    public LogOutPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // ------------ method to log out to your profile -------------
    public void logOut() throws InterruptedException {
        Actions actions = new Actions(driver);
        TimeUnit.SECONDS.sleep(2);
        actions.moveToElement(profile).build().perform();
        actions.moveToElement(logOut).click().build().perform();
    }
}
