package aulas.edi.cucumber.java.test.runners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/bancoCucumber.feature",
        glue = {"aulas.edi.cucumber.java.test.steps"},
        tags= {"@funcionais"},
        plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
        monochrome= true,
        snippets = SnippetType.CAMELCASE,
        dryRun = false,
        strict = true
        )
public class RunnerFuncionalTest
{
    @BeforeClass
    public static void reset() {
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\selenium\\version85\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://srbarriga.herokuapp.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("testes@cucumber.edi");
        driver.findElement(By.name("senha")).sendKeys("123456");
        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.linkText("reset")).click();
        driver.quit();
        
    }
    
    @AfterClass
    public static void afterScenario() {
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }

}