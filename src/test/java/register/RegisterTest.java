package register;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RegisterTest {
    WebDriver driver;

    @Before

    public void abrirBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testRegister() {
//        driver.get("https://demo.automationtesting.in/Register.html");
        RegisterPage registerPage = new RegisterPage();
        registerPage.preencherUrl(driver);
        registerPage.preencherNome(driver);
        registerPage.preencherSobrenome(driver);
        registerPage.preencherEndereco(driver);
        registerPage.preencherEmail(driver);
        registerPage.preencherTelefone(driver);
        registerPage.preencherGenero(driver);
        registerPage.preencherHobies(driver);
        registerPage.preencherHabilidade(driver);


//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demo.automationtesting.in/Register.html");
//        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Eneas");
//        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Carneiro");
//        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Av. Celso Garcia 1907");
//        driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("teste@teste.com");
//        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("9999-9998");
//        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
//        driver.findElement(By.id("checkbox1")).click();
//        driver.findElement(By.id("checkbox2")).click();
//        Select lstSkills = new Select(driver.findElement(By.id("Skills")));
//        lstSkills.selectByVisibleText("XML");
////        driver.findElement(By.id("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
////        driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[5]")).click();
//        Select ano = new Select(driver.findElement(By.id("yearbox")));
//        ano.selectByVisibleText("1983");
//        Select mes = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
//        mes.selectByVisibleText("September");
//        Select dia = new Select(driver.findElement(By.id("daybox")));
//        dia.selectByVisibleText("26");
    }

    @Test
    public void alertOK() {
        AlertOkPage alertOkPage = new AlertOkPage();
        alertOkPage.preencherUrl(driver);
        alertOkPage.clicarBotao(driver);
        alertOkPage.capturarAlert(driver);
//        alertOkPage.clicarBotaoOk(driver);
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://demo.automationtesting.in/Alerts.html");
//        driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
//        //capturar alert
//        Alert alert = driver.switchTo().alert();
//        String textoAlert = alert.getText();
//        Assert.assertEquals("Texto alert inválido", "I am an alert box!", textoAlert);

        // clicar no botão OK
//        alert.accept();
//        driver.quit();
    }

    @Test
    public void alertOKCancel() throws InterruptedException {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();

        Alert alert = driver.switchTo().alert();
        String textoAlert = alert.getText();
        Assert.assertEquals("Texto alert inválido", "Press a Button !", textoAlert);
        alert.dismiss();
        String textoAlert2 = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
        Assert.assertEquals("Texto alert inválido", "You Pressed Cancel", textoAlert2);
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void alertTextBox() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Bruno");
        alert.accept();

        String textoAlert3 = driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
        Assert.assertEquals("Texto alert inválido", "Hello Bruno How are you today", textoAlert3);
        Thread.sleep(5000);
        driver.quit();


    }

    @Test
    public void iframe() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Frames.html");

        //alterar o foco do driver para o Frame
        driver.switchTo().frame("singleframe");
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Teste teste");

        //voltar o foco para o html normal
//        driver.switchTo().defaultContent();

    }

    @Test
    public void window() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Windows.html");

        driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();


        Object[] janelas = driver.getWindowHandles().toArray();
        driver.switchTo().window(janelas[1].toString());
        String URLNovaAba = driver.getCurrentUrl();
        Assert.assertEquals("https://www.selenium.dev/", URLNovaAba);


    }

    @After
    public void fecharBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}

