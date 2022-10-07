package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShots {

    public static void takeScreenShots(WebDriver driver, String fileName) throws IOException {
        String screenshotFileName = System.getProperty("user.dir")+ "\\" + fileName+".jpg";
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{

            FileUtils.copyFile(srcFile,new File(screenshotFileName));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
