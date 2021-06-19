import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestCases extends BaseMethods {

    ChromeDriver driver = new ChromeDriver();

    public void btn_satilik_icon(){
        driver.findElement(By.cssSelector("div[class='link-sliding'] a[href='/satilik']")).click();
    }

    public void btn_select_city (){
        driver.findElement(By.cssSelector("div[class='city'] select")).click();
    }

    public void btn_city_search (){
        driver.findElement(By.cssSelector("option[value='izmir']")).click();
        driver.findElement(By.cssSelector("div[class='city'] select")).click();
    }

    public void btn_select_town (){
        driver.findElement(By.cssSelector("section[class='location'] section[class='select-content']")).click();
    }

    public void btn_town_search (){
        driver.findElement(By.xpath("//span[text()=\"Bornova\"]")).click();
    }

    public void input_town (){
        driver.findElement(By.cssSelector("#dropdown-lightbox-district > button")).click();
    }

    public void btn_kategori(){
        driver.findElement(By.cssSelector("label[for='category1']")).click();
    }

    public void input_priceMin (String cost) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement flag = driver.findElement(By.cssSelector("section[class='price'] > div > div:nth-child(1) >input"));

        js.executeScript("arguments[0].scrollIntoView();", flag);

        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.cssSelector(" section[class='price'] > div > div:nth-child(1) >input")).sendKeys(cost);
    }

    public void sendMaxCost(String cost){
        driver.findElement(By.cssSelector("section[class='price'] > div > div:nth-child(2) >input")).sendKeys(cost);
    }

    public void input_priceMax (){
        driver.findElement(By.cssSelector("section[class='building-age'] > section")).click();
    }

    public void btn_select_bina_yasi_1 (){

        driver.findElement(By.xpath("//span[text()=\"Sıfır Bina\"]")).click();
    }

    public void btn_select_bina_yasi_2 (){
        driver.findElement(By.cssSelector("section[class='building-age']  ul :nth-child(3)")).click();
    }

    public void btn_select_bina_yasi_3 (){
        driver.findElement(By.cssSelector("section[class='building-age']  ul :nth-child(4)")).click();
    }

    public void btn_uygula(){
        driver.findElement(By.cssSelector("section[class='room-size'] ~ section >section button[class='btn btn-red filter-close']")).click();
    }

    public void btn_list(){
        driver.findElement(By.cssSelector("button[class='btn btn-red cardShadow3 get-result']")).click();
    }

    public void clickFiltreleButton2(){
        driver.findElement(By.cssSelector("div[class='wrapper basetap'] :nth-child(1)~button")).click();
    }



}





