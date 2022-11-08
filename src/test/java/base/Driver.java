package base;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigReader;
import utils.ElementReader;

import java.io.File;
import java.util.logging.Level;

public class Driver {
    public static WebDriverWait wait;
    public static WebDriver driver;
    public String expectedText;
    protected ConfigReader configReader = new ConfigReader("config");
    protected ElementReader elementReader = new ElementReader("element");


    public void initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        //Chrome Info Close
        System.setProperty("webdriver.chrome.silentOutput", "true");
        //W3S Info Close
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        ChromeOptions options = new ChromeOptions();
        //Notifications Close
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-notifications");
        options.addArguments("--acceptInsecureCerts");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("chrome.switches","--disable-extensions");
        options.merge(desiredCapabilities);
        driver = new ChromeDriver(options);
        driver.get("https://www.trendyol.com/");
    }

    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void testFailed() {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotFile, new File("target/" + System.currentTimeMillis() + ".png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
