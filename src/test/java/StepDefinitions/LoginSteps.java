package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pageObjects.BaseClass;
import pageObjects.Login.LoginPage;
import pageObjects.PageNavigation;

public class LoginSteps extends BaseClass {

    @Before
    public void SetUp()
    {
        //BaseClass.setFireFoxDriver();
        BaseClass.setChromeDriver();
    }


    @After
    public void TearDown(Scenario scenario){
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src,"image/png","screenshot");
        }

        BaseClass.closeDriver();
    }

    //Scenario 1

    @Given("a user navigates to the home page")
    public void a_user_navigates_to_the_home_page() {
        PageNavigation pageNavigation = new PageNavigation();
        pageNavigation.NavigateToIndividualCreate();
    }

    @When("they provide valid details")
    public void they_provide_valid_details() {
        LoginPage loginPage = new LoginPage();
        loginPage.provideValidDetails();
    }

    @When("submit the login button")
    public void submit_the_login_button() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.SubmitDetails();
    }

    @Then("they should be able to login successfully")
    public void they_should_be_able_to_login_successfully() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.WaitForIndividualPageLoad();
    }


    //Scenario 2

    @Given("a user navigates to the individual create page")
    public void a_user_navigates_to_the_individual_create_page() {
        PageNavigation pageNavigation = new PageNavigation();
        pageNavigation.NavigateToIndividualCreate();
    }

    @When("they provides invalid details")
    public void they_provides_invalid_details() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.provideInvalidDetails();
        loginPage.SubmitDetails();
    }

    @Then("they should see an error message displayed")
    public void they_should_see_an_error_message_displayed() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.waitForLoginError();
    }

}
