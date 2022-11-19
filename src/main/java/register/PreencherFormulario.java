package register;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PreencherFormulario {
    private String url = "https://demo.automationtesting.in/Register.html";
    private String nome = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input";
    private String sobrenome = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input";
    private String endereco = "//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea";
    private String email = "//*[@id=\"eid\"]/input";
    private String telefone = "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input";
    private String sexo = "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input";
    private String hobie1 = "checkbox1";
    private String hobie2 = "checkbox2";
    private String habilidade = "Skills";
    private String habSelecionada = "XML";

    public void preencherFormulario(WebDriver driver) {
        driver.get(url);
        driver.findElement(By.xpath(nome)).sendKeys("Eneas");
        driver.findElement(By.xpath(sobrenome)).sendKeys("Carneiro");
        driver.findElement(By.xpath(endereco)).sendKeys("Av. Celso Garcia 1907");
        driver.findElement(By.xpath(email)).sendKeys("teste@teste.com");
        driver.findElement(By.xpath(telefone)).sendKeys("9999-9998");
        driver.findElement(By.xpath(sexo)).click();
        driver.findElement(By.id(hobie1)).click();
        driver.findElement(By.id(hobie2)).click();
        Select lstSkills = new Select(driver.findElement(By.id(habilidade)));
        lstSkills.selectByVisibleText(habSelecionada);
    }


}
