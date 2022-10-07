package Pages;

import CommonMethods.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Base.SetupPage.driver;

public class CareerPage {

    // ----------- Element ------------
    @FindBy(how = How.XPATH,using = "//a[contains(text(),'Careers')]")
    WebElement career;
    @FindBy(how = How.XPATH,using = "//body/div[1]/div[4]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/span[1]/button[1]/img[1]")
    WebElement jobs;
    public CareerPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // ------------ method to go to the career page --------------
    public void clickOnCareer(){
        Common.clickOnElement(career);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(jobs)).click();
    }
}
