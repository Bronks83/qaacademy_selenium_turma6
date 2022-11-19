package register;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    private String url = "https://demo.automationtesting.in/Register.html";
    private String firstName = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input";
    private String lastName = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input";
    private String address = "//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea";
    private String email = "//*[@id=\"eid\"]/input";
    private String phone = "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input";
    private String gender = "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input";
    private String hobie1 = "checkbox1";
    private String hobie2 = "checkbox2";
    private String skill = "Skills";
    private String slctSkill = "XML";

    public void preencherUrl(WebDriver driver) {
        driver.get(url);
    }
    public void preencherNome(WebDriver driver) {
        driver.findElement(By.xpath(firstName)).sendKeys("Eneas");
    }
    public void preencherSobrenome(WebDriver driver) {
        driver.findElement(By.xpath(lastName)).sendKeys("Carneiro");
    }
    public void preencherEndereco(WebDriver driver) {
        driver.findElement(By.xpath(address)).sendKeys("Av. Celso Garcia 1907");
    }
    public void preencherEmail(WebDriver driver) {
        driver.findElement(By.xpath(email)).sendKeys("teste@teste.com");
    }
    public void preencherTelefone(WebDriver driver) {
        driver.findElement(By.xpath(phone)).sendKeys("9999-9998");
    }
    public void preencherGenero(WebDriver driver) {
        driver.findElement(By.xpath(gender)).click();
    }
    public void preencherHobies(WebDriver driver) {
        driver.findElement(By.id(hobie1)).click();
        driver.findElement(By.id(hobie2)).click();
    }
    public void preencherHabilidade(WebDriver driver) {
        Select lstSkills = new Select(driver.findElement(By.id(skill)));
        lstSkills.selectByVisibleText(slctSkill);
    }




}
