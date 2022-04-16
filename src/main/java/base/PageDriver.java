package base;

import org.openqa.selenium.WebDriver;

public class PageDriver {
    ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();
    private static PageDriver instance = null;

    private PageDriver(){

    }

    public static PageDriver getInstance(){
        if(instance == null){
            instance = new PageDriver();
        }
        return instance;
    }

    public WebDriver getDriver(){
        return webDriver.get();
    }

    public void setDriver(WebDriver driver){
        webDriver.set(driver);
    }

    public static WebDriver getCurrentDriver(){
        return getInstance().getDriver();
    }
}
