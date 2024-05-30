package org.week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    public static WebDriver driver;
    public static Properties prop = new Properties();
    public static FileReader fr;

    @BeforeMethod
    public void setUp() throws IOException {
        if (driver == null) {
            fr = new FileReader(System.getProperty("user.dir") + "\\src\\main\\java\\org\\week3\\configFiles\\config.property");
            prop.load(fr);
        }

        String browser = prop.getProperty("browser");
        String url = prop.getProperty("url");

        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "safari":
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                break;
            default:
                throw new IllegalArgumentException("Browser \"" + browser + "\" is not supported.");
        }

        driver.get(url);
        driver.manage().window().maximize();
    }

//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//        System.out.println("Teardown Successful..");
//    }

}
