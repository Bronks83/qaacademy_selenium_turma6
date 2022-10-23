package register;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest {
    WebDriver driver;
    @Test

    public void testRegister() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Eneas");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Carneiro");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Av. Celso Garcia 1907");
        driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("teste@teste.com");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("9999-9998");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
        driver.findElement(By.id("checkbox1")).click();
        driver.findElement(By.id("checkbox2")).click();
        Select lstSkills = new Select(driver.findElement(By.id("Skills")));
        lstSkills.selectByVisibleText("XML");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span/span[2]/b")).click();
        driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[5]")).click();


        Select ano = new Select(driver.findElement(By.id("yearbox")));
        ano.selectByVisibleText("1983");


//        driver.quit();




    }

}
