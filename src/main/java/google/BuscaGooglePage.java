package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscaGooglePage {
    private String campoBusca = "q";
    private String botaoPesquisar = "btnK";

    public void preencherCampoBusca(WebDriver driver) {
        driver.findElement(By.name(campoBusca)).sendKeys("forum hardmob promocoes");
        driver.findElement(By.name(botaoPesquisar)).click();

    }

//    public void clicarResultadoBusca(WebDriver driver) {
//        driver.findElement(By.xpath(resultadoBusca)).click();
//    }

}
