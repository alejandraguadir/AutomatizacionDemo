package co.com.choucair.ejemplo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
       snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/demo.feature"},
        glue = {"co.com.choucair.ejemplo.stepdefinitions"},
        tags = "@ProgramarReunion"
)
public class DemoTest {

}
