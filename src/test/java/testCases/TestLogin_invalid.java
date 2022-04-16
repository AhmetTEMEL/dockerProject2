package testCases;

import base.BaseTest;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestLogin_invalid extends BaseTest {
    WebDriverWait wait;

    @Test
    public void MavenParamTest() throws InterruptedException {
        //WebDriver driver = PageDriver.getDriver();

        //wait = new WebDriverWait(driver, Duration.ofSeconds(15));

            /*driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

            driver.findElement(By.id("user-name")).sendKeys("standard_user");

            driver.findElement(By.id("password")).sendKeys("secret_sauce1");

            driver.findElement(By.id("login-button")).click();*/

        LoginPage loginPage = new LoginPage();
        loginPage.login("App.validUserName","App.inValidpassword");
    }

}
