package cep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscaCepPage {
    private String campoBusca = "endereco";
    private String botaoBusca = "btn_pesquisar";

    public void preencherCampoBusca(WebDriver driver) {
        driver.findElement(By.id(campoBusca)).sendKeys("03063-000");
        driver.findElement(By.id(botaoBusca)).click();

    }

}
