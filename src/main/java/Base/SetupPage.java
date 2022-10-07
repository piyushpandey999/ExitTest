package Base;

import Utilities.ExtentManager;
import Utilities.ReadExeclData;
import Utilities.ReadingPropertiesFile;
import Utilities.ScreenShots;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SetupPage {

    public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest test;
    public static Logger log = Logger.getLogger(SetupPage.class);
    public String username;
    public String password;


    @BeforeTest
    public void ExcelData() {
        ReadExeclData excel = new ReadExeclData(System.getProperty("user.dir") + "\\src\\main\\resources\\Data.xlsx");
        Map<String, String> data = excel.getData();
        for (String k : data.keySet()) {
            username = k;
            password = data.get(k);
        }
    }

    @BeforeClass
    public void initializeBrowser() {

        String log4jPath = System.getProperty("user.dir") + "\\log4j.properties";
        PropertyConfigurator.configure(log4jPath);

        log.info("reading browser name from properties file");
        String browser = ReadingPropertiesFile.getProperty("browser");
        log.info("reading mode from properties file");
        String mode = ReadingPropertiesFile.getProperty("mode");


        // Initializing the browser

        if (mode.equals("non-headless")) {
            log.info("run tests in non-headless mode");
            switch (browser) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ReadingPropertiesFile.getProperty("chrome_path"));
                    log.info("opening  chrome browser");
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + ReadingPropertiesFile.getProperty("firefox_path"));
                    log.info("opening firefox browser");
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + ReadingPropertiesFile.getProperty("edge_path"));
                    log.info("loading edge browser");
                    driver = new EdgeDriver();
                    break;
                default:
                    System.out.println("browser name is invalid");
                    break;
            }
        } else if (mode.equals("headless")) {
            log.info("run tests in headless mode");
            switch (browser) {
                case "chrome": {
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ReadingPropertiesFile.getProperty("chrome_path"));
                    ChromeOptions options = new ChromeOptions();

                    // Add the headless argument
                    options.addArguments("headless");

                    //pass the options parameter in the Chrome driver declaration
                    log.info("opening  chrome driver");
                    driver = new ChromeDriver(options);
                    break;
                }
                case "firefox": {
                    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + ReadingPropertiesFile.getProperty("firefox_path"));
                    FirefoxOptions options = new FirefoxOptions();
                    options.addArguments("headless");

                    log.info("opening firefox browser");
                    driver = new FirefoxDriver(options);
                    break;
                }
                case "edge": {
                    System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + ReadingPropertiesFile.getProperty("edge_path"));
                    EdgeOptions options = new EdgeOptions();
                    options.addArguments("headless");
                    driver = new EdgeDriver(options);
                    break;
                }
                default:
                    log.info("browser name is invalid. Please enter a valid browser name");
                    System.out.println("browser name is invalid");
                    break;
            }
        }
        Dimension d = new Dimension(1250, 1000);

        // Maximizing the window
        log.info("maximizing the window");
        driver.manage().window().setSize(d);

        // Deleting the cookies
        log.info("deleting the cookies");
        driver.manage().deleteAllCookies();

        extent = ExtentManager.getInstance("reports//ExtentReport.html");
        // Open the url
        log.info("open the base url");
        driver.get(ReadingPropertiesFile.getProperty("baseurl"));
    }

    @BeforeMethod
    public void OpenUrl(Method method) {
        test = extent.startTest(method.getName());
    }


    @AfterMethod
    public void afterMethod(ITestResult result) throws IOException {


        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        if (result.getStatus() == ITestResult.SUCCESS)
            test.log(LogStatus.PASS, "Test case got passed");
        else if (result.getStatus() == ITestResult.FAILURE) {
            test.log(LogStatus.FAIL, result.getThrowable());

            // Taking the screenshot of the error
            ScreenShots.takeScreenShots(driver, "element_not_found");

        } else if (result.getStatus() == ITestResult.SKIP)
            test.log(LogStatus.SKIP, result.getThrowable());

        extent.flush();
    }

    @AfterClass
    public void tearDown() throws InterruptedException {

        // Quitting The Browser
        Thread.sleep(3000);
        log.info("----------- quitting the browser ---------------");
        driver.quit();
    }
}

