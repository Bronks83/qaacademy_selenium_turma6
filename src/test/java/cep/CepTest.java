package cep;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CepTest {

    WebDriver driver;

    @Test
    public void testCep() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://buscacepinter.correios.com.br/app/endereco/index.php");
        driver.findElement(By.id("endereco")).sendKeys("03063-000");
        driver.findElement(By.id("btn_pesquisar")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String texto = driver.findElement(By.xpath("//*[@id=\"resultado-DNEC\"]/tbody/tr/td[1]")).getText();
        Assert.assertEquals("Texto inválido", "Avenida Celso Garcia - de 2483 ao fim - lado ímpar", texto);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("btn_nbusca")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("endereco")).sendKeys("av. celso garcia");
        Select optionSkills = new Select(driver.findElement(By.id("tipoCEP")));
        optionSkills.selectByVisibleText("Localidade/Logradouro");
        driver.findElement(By.id("btn_pesquisar")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String texto2 = driver.findElement(By.xpath("//*[@id=\"resultado-DNEC\"]/tbody/tr[3]/td[1]")).getText();
        Assert.assertEquals("Texto inválido 2", "Avenida Celso Garcia - de 2482 a 3028 - lado par",texto2);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.quit();
    }

}
