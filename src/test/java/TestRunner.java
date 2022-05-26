import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        //features = "src/test/resources/IndividualCreate.feature",
        //features = "src/test/resources/Login.feature",
        //features = "src/test/resources/TrustCreate.feature",
        glue = "StepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html",
        "json:target/cucumber-reports/cucumber.json"}
)

public class TestRunner {

}
