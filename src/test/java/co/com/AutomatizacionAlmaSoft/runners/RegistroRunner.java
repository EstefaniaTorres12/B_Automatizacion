package co.com.AutomatizacionAlmaSoft.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Cliente/Registrarse.feature",
        glue = {
                "co.com.AutomatizacionAlmaSoft.stepsdefinitions",
                "co.com.AutomatizacionAlmaSoft.utils.hooks"
        },
        snippets = SnippetType.CAMELCASE
)
public class RegistroRunner {
}