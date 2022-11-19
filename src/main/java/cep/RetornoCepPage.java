package cep;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetornoCepPage {
    private String textoRetorno = "//*[@id=\"resultado-DNEC\"]/tbody/tr/td[1]";

    public void validarRetornoBusca(WebDriver driver) {
        String texto = driver.findElement(By.xpath(textoRetorno)).getText();
        Assert.assertEquals("Texto incorreto", "Avenida Celso Garcia - de 2483 ao fim - lado ímpar", texto);
    }
}

