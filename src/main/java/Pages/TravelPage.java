package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Base.SetupPage.driver;

public class TravelPage {

    // -------- Elements -----------
    public static By travel = By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[8]/a[1]/div[1]/div[1]");

    public TravelPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // ---------- method to click on the travel --------------
    public void clickTravels(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(travel)).click();
    }
}
