package cep;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CepTest {

    WebDriver driver;

    @Before
    public void abrirBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testCep() {
        driver.get("https://buscacepinter.correios.com.br/app/endereco/index.php");
        BuscaCepPage buscaCepPage = new BuscaCepPage();
        buscaCepPage.preencherCampoBusca(driver);
//        driver.findElement(By.id("endereco")).sendKeys("03063-000");
//        driver.findElement(By.id("btn_pesquisar")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        RetornoCepPage retornoCepPage = new RetornoCepPage();
        retornoCepPage.validarRetornoBusca(driver);
//        String texto = driver.findElement(By.xpath("//*[@id=\"resultado-DNEC\"]/tbody/tr/td[1]")) .getText();
//        Assert.assertEquals("Texto inválido", "Avenida Celso Garcia - de 2483 ao fim - lado ímpar", texto);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(By.id("btn_nbusca")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(By.id("endereco")).sendKeys("av. celso garcia");
//        Select optionSkills = new Select(driver.findElement(By.id("tipoCEP")));
//        optionSkills.selectByVisibleText("Localidade/Logradouro");
//        driver.findElement(By.id("btn_pesquisar")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        String texto2 = driver.findElement(By.xpath("//*[@id=\"resultado-DNEC\"]/tbody/tr[3]/td[1]")).getText();
//        Assert.assertEquals("Texto inválido 2", "Avenida Celso Garcia - de 2482 a 3028 - lado par",texto2);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.quit();
    }

}
