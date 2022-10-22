package google;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TesteGoogle {

    WebDriver driver;
    @Test

    public void testGoogle() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Data copa do mundo 2022");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]/div/div[2]/div[1]/span")).click();
        String texto = driver.findElement(By.xpath("//*[@id=\"EtGB6d\"]/div/div/span/div/div[2]/div/div[2]")).getText();
        Assert.assertEquals("Texto inválido", "20 de novembro", texto);
//        driver.quit();
    }
    @After
    public void fecharBrowser(){
        driver.quit();
    }
}
