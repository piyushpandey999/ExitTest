package Pages;

import CommonMethods.Common;
import Utilities.ReadingPropertiesFile;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    // Elements and flow to log in to application
    @FindBy(how = How.XPATH, using = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
    WebElement email;

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
    WebElement Password;
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")
    WebElement submtBtn;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    // ----------- method to do a valid login -----------
    public void validlogin(String username, String password) {
        Common.sendKeysToElement(email,username);
        Common.sendKeysToElement(Password,password);
        Common.clickOnElement(submtBtn);
    }

    // ----------- method to do a invalid login ---------------
    public void invalidlogin() {
        Common.sendKeysToElement(email, ReadingPropertiesFile.getProperty("username"));
        Common.sendKeysToElement(Password,ReadingPropertiesFile.getProperty("invalid_password"));
        Common.clickOnElement(submtBtn);
    }
}