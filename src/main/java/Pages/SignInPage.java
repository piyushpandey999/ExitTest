package Pages;

import CommonMethods.Common;
import Utilities.ReadingPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    // ------ Elements ----------------

    @FindBy(how = How.XPATH,using = "//a[contains(text(),'New to Flipkart? Create an account')]")
    WebElement signIn;
    @FindBy(how = How.XPATH,using = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
    WebElement number;
    @FindBy(how = How.XPATH,using = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/button[1]")
    WebElement Continue;

    public SignInPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // ----------- method to create a new account --------------------
    public void clickOnSignIn(){
        Common.clickOnElement(signIn);
        Common.sendKeysToElement(number, ReadingPropertiesFile.getProperty("signIn"));
        Common.clickOnElement(Continue);
    }
}
