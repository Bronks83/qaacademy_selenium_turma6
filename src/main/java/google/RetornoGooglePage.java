package google;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetornoGooglePage {
    String textoRetorno = "//*[@id=\"rso\"]/div[1]/div/div/div[3]/div/a[2]";

    public void validarRetornoBusca(WebDriver driver){
        String texto = driver.findElement(By.xpath(textoRetorno)).getText();
        Assert.assertEquals("Texto inválido","Cultura hardMOB",texto);

    }
}
