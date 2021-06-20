import org.junit.Test;

public class TestCases extends TestSteps{

    @Test
    public void desktopTests() throws InterruptedException {
        anasayfa();
        satilik();
        konum();
        kategori();
        fiyat();
        bina_yasi();
        listed();
        filtrele_2();
        exit();
    }
    public void exit(){
        driver.quit();

    }
}
