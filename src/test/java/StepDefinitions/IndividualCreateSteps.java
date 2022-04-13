package StepDefinitions;

import io.cucumber.java.bs.I;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import platformAcceptance.BaseClass;
import pageObjects.IndividualCreate.IndividualCreatePage;
import pageObjects.Login.LoginPage;
import platformAcceptance.PageNavigation;

public class IndividualCreateSteps extends BaseClass{


    @Given("a user logs in successfully")
    public void aUserLogsInSuccessfully() throws InterruptedException {
        PageNavigation pageNavigation = new PageNavigation();
        pageNavigation.NavigateToIndividualCreate();

        LoginPage loginPage = new LoginPage();
        loginPage.provideValidDetails();
        loginPage.SubmitDetails();
    }

    @And("arrives on the Individual create page")
    public void arrivesOnTheIndividualCreatePage() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.WaitForIndividualPageLoad();
    }

    @When("the user provides valid client details")
    public void theUserProvidesValidClientDetails() throws InterruptedException {
        IndividualCreatePage individualCreatePage = new IndividualCreatePage();
        individualCreatePage.selectClientAdviser();
    }

    @And("personal details")
    public void personalDetails() throws InterruptedException {
        IndividualCreatePage individualCreatePage = new IndividualCreatePage();
        individualCreatePage.selectPersonalDetailsSection();
        individualCreatePage.providePersonalDetails();
    }

    @And("nationality details")
    public void nationalityDetails() throws InterruptedException {
        IndividualCreatePage individualCreatePage = new IndividualCreatePage();
        individualCreatePage.selectNationalityResidencySection();
        individualCreatePage.provideNationalityAndResidencyDetailsOutwithUK();
    }

    @And("contact details")
    public void contactDetails() throws InterruptedException {
        IndividualCreatePage individualCreatePage = new IndividualCreatePage();
        individualCreatePage.selectContactDetailsSection();
        individualCreatePage.provideContactDetails();
    }

    @And("bank account details")
    public void bankAccountDetails() throws InterruptedException {
        IndividualCreatePage individualCreatePage = new IndividualCreatePage();
        individualCreatePage.selectBankAccountDetailsSection();
        individualCreatePage.provideBankAccountDetails();
    }

    @And("Nucleus Go details")
    public void nucleusGoDetails() throws InterruptedException {
        IndividualCreatePage individualCreatePage = new IndividualCreatePage();
        individualCreatePage.selectNucleusGoSection();
        individualCreatePage.selectNucleusGoAccess();
    }

    @And("correspondence details")
    public void correspondenceDetails() throws InterruptedException {
        IndividualCreatePage individualCreatePage = new IndividualCreatePage();
        individualCreatePage.selectCorrespondencePreferencesSection();
        individualCreatePage.selectAllCorrespondence();
    }

    @Then("they should be able to successfully submit the application")
    public void theyShouldBeAbleToSuccessfullySubmitTheApplication() throws InterruptedException {
        IndividualCreatePage individualCreatePage = new IndividualCreatePage();
        individualCreatePage.selectNext();
        individualCreatePage.applyApplication();
        individualCreatePage.waitForSuccessMessage();
    }


    @And("nationality details within the UK")
    public void nationalityDetailsWithinTheUK() throws InterruptedException {
        IndividualCreatePage individualCreatePage = new IndividualCreatePage();
        individualCreatePage.provideNationalityDetailsWithinUk();
    }
}
