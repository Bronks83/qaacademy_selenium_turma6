package register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PreencherAlertOK {
    private String url = "https://demo.automationtesting.in/Alerts.html";
    private String alertBtn = "//*[@id=\"OKTab\"]/button";
    private String textoAlert = "alert.getText()";
    private String okBtn = "alert.accept()";

    public void preencherAlertOK(WebDriver driver){
        driver.get(url);
        driver.findElement(By.xpath(alertBtn)).click();
    }




}
