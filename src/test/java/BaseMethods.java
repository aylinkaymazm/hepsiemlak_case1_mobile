import org.apache.log4j.Logger;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BaseMethods {
    Logger logger = Logger.getLogger(BaseMethods.class);
    WebDriverWait wait;
    WebDriver driver ;
    @Before
    public void setUp() {

        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "iPhone 8");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("mobileEmulation", mobileEmulation);

        options.addArguments("start-maximized");
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        driver = new ChromeDriver(options);
        driver.get("https://www.hepsiemlak.com/");
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

    }

    WebElement findElement(By by){
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    void clickToElement (By by){
        findElement(by).click();
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }
}
