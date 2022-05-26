package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Login.LoginPage;
import platformAcceptance.BaseClass;
import platformAcceptance.PageNavigation;

public class LoginSteps extends BaseClass {

    //Scenario 1

    @Given("a user navigates to the home page")
    public void a_user_navigates_to_the_home_page() {
        PageNavigation pageNavigation = new PageNavigation();
        pageNavigation.navigateToIndividualCreate();
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
        pageNavigation.navigateToIndividualCreate();
    }


    @When("they provide invalid details")
    public void theyProvideInvalidDetails() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.provideInvalidDetails();
        loginPage.SubmitDetails();
    }

    @Then("they should be presented with an error message")
    public void theyShouldBePresentedWithAnErrorMessage() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.checkLoginPageUrl();
    }
}
