import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BaseMethods {
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
}
