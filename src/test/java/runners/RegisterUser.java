package runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith (CucumberWithSerenity.class)
@CucumberOptions(
        snippets = SnippetType.CAMELCASE,
        features ="src/test/resources/features/register_user.feature",
        tags = "@Registeruser",
        glue= "stepdefinitions"
)
public class RegisterUser {
}
