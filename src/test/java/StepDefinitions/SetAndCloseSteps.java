package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import platformAcceptance.BaseClass;

public class SetAndCloseSteps extends BaseClass {

    @Before
    public void openDriver()
    {
        //BaseClass.setFireFoxDriver();
        BaseClass.setChromeDriver();
    }

    @After
    public void afterScenario(Scenario scenario)
    {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src,"image/png","Failure-Screenshot");
        } else {
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src,"image/png","Success-screenshot");
        }

        BaseClass.closeDriver();
    }

}
