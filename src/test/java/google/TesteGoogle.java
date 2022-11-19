package google;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.time.Duration;

public class TesteGoogle {

    WebDriver driver;

    @Before
    public void abrirBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test

    public void testGoogle() throws InterruptedException {
        driver.get("https://www.google.com/");
        BuscaGooglePage buscaGooglePage = new BuscaGooglePage();
        buscaGooglePage.preencherCampoBusca(driver);
        RetornoGooglePage retornoGooglePage = new RetornoGooglePage();
        retornoGooglePage.validarRetornoBusca(driver);

//        buscaGooglePage.clicarResultadoBusca(driver);
//        driver.findElement(By.name("q")).sendKeys("data final da copa do mundo 2022");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]/div/div[2]/div[1]/span")).click();
//        String texto = driver.findElement(By.xpath("//*[@id=\"EtGB6d\"]/div/div/span/div/div[2]/div/div[2]")).getText();
//        Assert.assertEquals("Texto inválido", "20 de novembro", texto);
//        driver.quit();
    }

    @After
    public void fecharBrowser() throws InterruptedException {
//        Thread.sleep(5000);
//        driver.quit();
    }
}
