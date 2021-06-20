import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BaseMethods {
    Logger logger = Logger.getLogger(BaseMethods.class);
    public static String device;

    public void setUp() {

        device = "mobile";

        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "iPhone 7");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("mobileEmulation", mobileEmulation);

        options.addArguments("start-maximized");
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiemlak.com/");
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

    }

    WebElement findElement(By by){
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    void clickToElement (By by){
        findElement(by).click();
    }

    String getUrl(){
        return driver.getCurrentUrl();
    }
}
