package Pages;

import CommonMethods.Common;
import Utilities.ReadingPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {



    // ---------- Elements ------------
    @FindBy(how = How.CLASS_NAME, using = "_3704LK")
    WebElement searchField;
    @FindBy(how = How.CLASS_NAME, using = "L0Z3Pu")
    WebElement searchBtn;

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // ----------- method to search an item --------------------
    public void search() {
        Common.sendKeysToElement(searchField,ReadingPropertiesFile.getProperty("item_name"));
        Common.clickOnElement(searchBtn);
    }
}