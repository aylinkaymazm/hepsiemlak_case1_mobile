import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.Keys.TAB;

public class TestSteps extends BaseMethods {


    JavascriptExecutor jse = (JavascriptExecutor)driver;

    public void anasayfa() {
        String mainPageUrl = getUrl();
        String mainPageUrlC = "https://www.hepsiemlak.com/";

        if (mainPageUrl.equals(mainPageUrlC)) {
            logger.info("Anasayfadasınız");
        }
    }

    public void satilik() throws InterruptedException {
        clickToElement(MobileElementsConstants.btn_satilik_icon);
        Thread.sleep(2000);
    }

    public void konum() throws InterruptedException{
        clickToElement(MobileElementsConstants.btn_select_city);
        findElement(MobileElementsConstants.btn_city_search).sendKeys("İzmir");
        clickToElement(MobileElementsConstants.btn_select_city_option);
        Thread.sleep(2000);
        clickToElement(MobileElementsConstants.input_town);
        findElement(MobileElementsConstants.btn_town_search).sendKeys("Bornova");
        clickToElement(MobileElementsConstants.btn_select_town_option);
        Thread.sleep(2000);


    }
    public void kategori(){
        clickToElement(MobileElementsConstants.btn_kategori);
    }


    public void fiyat()throws InterruptedException{
        jse.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        findElement(MobileElementsConstants.input_priceMin).sendKeys("100000");
        Thread.sleep(1000);
        findElement(MobileElementsConstants.input_priceMin).sendKeys(TAB);

        findElement(MobileElementsConstants.input_priceMax).sendKeys("2000000");
        //findElement(WebElementsConstants.input_priceMax).sendKeys(TAB);
        Thread.sleep(5000);
    }


    public void bina_yasi(){
        jse.executeScript("window.scrollBy(0,800)");
        clickToElement(MobileElementsConstants.btn_select_bina_yasi_1);
        clickToElement(MobileElementsConstants.btn_select_bina_yasi_2);
        clickToElement(MobileElementsConstants.btn_select_bina_yasi_3);
        jse.executeScript("window.scrollBy(0,300)");
        clickToElement(MobileElementsConstants.btn_search);
    }

    public void listed(){
        clickToElement(MobileElementsConstants.listed);
    }

    public void filtrele_2(){
        clickToElement(MobileElementsConstants.filtrele_2);
    }



}





