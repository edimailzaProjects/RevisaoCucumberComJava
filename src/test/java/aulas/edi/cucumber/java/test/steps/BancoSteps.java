package aulas.edi.cucumber.java.test.steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class BancoSteps
{
    WebDriver driver;

    @Dado("que desejo adicionar uma conta")
    public void queDesejoAdicionarUmaConta()
    {
        driver = new ChromeDriver();
        driver.get("https://srbarriga.herokuapp.com");
        driver.findElement(By.id("email")).sendKeys("testes@cucumber.edi");
        driver.findElement(By.name("senha")).sendKeys("123456");
        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.linkText("Contas")).click();
        driver.findElement(By.linkText("Adicionar")).click();

    }

    @Quando("adiciono a conta {string}")
    public void adicionoAConta(String string)
    {
        driver.findElement(By.id("nome")).sendKeys(string);
        driver.findElement(By.tagName("button")).click();
    }

    @Entao("recebo a mensagem {string}")
    public void receboAMensagem(String string)
    {
        String texto = driver.findElement(By.xpath("//div[starts-with(@class, 'alert alert-')]")).getText();
        Assert.assertEquals(string, texto);

    }
    
    //Comentarios dos After's sao validos apenas para os After's.
    
    @After(order = 1, value = "@funcionais") //order 1, penultimo after
    public void screenshot(Scenario cenario) {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("target/screenshot/"+cenario.getId()+".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @After(order = 0, value = "@funcionais")//orfer 0, ultimo after
    public void fecharBrowser() {
        driver.quit();
        System.out.println("terminando");
    }
}
