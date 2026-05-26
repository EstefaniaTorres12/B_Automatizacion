package co.com.AutomatizacionAlmaSoft.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Cliente/Registrarse.feature",
        glue = {"co.com.AutomatizacionAlmasoft.stepdefinitions", "co.com.AutomatizacionAlmaSoft.utils.hooks"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        snippets = SnippetType.CAMELCASE
)

public class RegistroRunner {
}
