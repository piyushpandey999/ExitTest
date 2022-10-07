package Pages;

import CommonMethods.Common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FailedTestPage {

    @FindBy(how = How.XPATH,using = "//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[5]/a[1]/div[1]/div[0]")
    WebElement element;

    public FailedTestPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void clickElement(){
        Common.clickOnElement(element);
    }
}
