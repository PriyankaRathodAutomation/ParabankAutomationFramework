package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    public static WebDriver driver;

    public static Logger log =
    LogManager.getLogger(BaseTest.class);

    @BeforeMethod
    public void setup() {

        log.info("Execution started");

        WebDriverManager.chromedriver().setup();

        ChromeOptions options =
        new ChromeOptions();

        options.addArguments("--headless=new");

        driver = new ChromeDriver(options);

        log.info("Chrome browser launched");

        driver.manage().window().maximize();

        driver.manage().timeouts()
        .implicitlyWait(Duration.ofSeconds(10));

        driver.get(
        "https://parabank.parasoft.com/parabank/index.htm");

        log.info("Parabank website opened");
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();

        log.info("Browser closed");
    }
}