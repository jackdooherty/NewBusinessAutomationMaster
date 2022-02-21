import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//jdoher//IdeaProjects//NewBusinessAutomationMaster//src//test//resources",
        glue = "StepDefinitions",
        plugin = {"pretty", "html:test-output",
                "rerun:target/rerun.txt"}
)

public class TestRunner {

}
