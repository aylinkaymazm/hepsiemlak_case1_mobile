import org.openqa.selenium.By;

public class MobileElementsConstants {

    public static By btn_satilik_icon = By.cssSelector("div[class='link-sliding'] a[href='/satilik']");
    public static By btn_select_city = By.cssSelector("[class=he-select-base__value]");
    public static By btn_city_search = By.cssSelector("option[value='izmir']");
    public static By btn_select_city_option= By.cssSelector("div[class='city'] select");

    public static By input_town = By.cssSelector("section[class='location'] section[class='select-content']");
    public static By btn_town_search = By.xpath("//span[text()=\"Bornova\"]");
    public static By btn_select_town_option= By.cssSelector("#dropdown-lightbox-district > button");

    public static By btn_kategori=By.cssSelector("label[for='category1']");

    public static By input_priceMin = By.cssSelector(" section[class='price'] > div > div:nth-child(1) >input");
    public static By input_priceMax =By.cssSelector("section[class='price'] > div > div:nth-child(2) >input");

    public static By btn_select_bina_yasi_1 = By.xpath("//span[text()=\"Sıfır Bina\"]");
    public static By btn_select_bina_yasi_2 = By.cssSelector("section[class='building-age']  ul :nth-child(3)");
    public static By btn_select_bina_yasi_3 = By.cssSelector("section[class='building-age']  ul :nth-child(4)");

    public static By btn_search = By.cssSelector("section[class='room-size'] ~ section >section button[class='btn btn-red filter-close']");

    public static By listed = By.cssSelector("button[class='btn btn-red cardShadow3 get-result']");
    public static By filtrele_2 = By.cssSelector("div[class='wrapper basetap'] :nth-child(1)~button");

}



