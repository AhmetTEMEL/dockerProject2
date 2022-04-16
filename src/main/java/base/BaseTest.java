package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    WebDriver driver = null;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.LINUX);
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
//
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//
        driver.get("https://www.saucedemo.com/"); //prod
        PageDriver.getInstance().setDriver(driver);
    }

    @AfterClass
    public void tearDown(){
        PageDriver.getCurrentDriver().quit();
    }
}
