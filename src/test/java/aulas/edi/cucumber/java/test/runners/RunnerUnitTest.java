package aulas.edi.cucumber.java.test.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/locadoraCucumber.feature",
        glue = {"aulas.edi.cucumber.java.test.steps"},
        tags= {"@unitarios"},
        plugin = {"pretty","html:target/report-html","json:target/report-json"},
        monochrome= true,
        snippets = SnippetType.CAMELCASE,
        dryRun = false,
        strict = true
        )
public class RunnerUnitTest {
    


}
