package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.mortbay.log.Log;
import org.openqa.selenium.devtools.v85.page.Page;
import pageObjects.BaseClass;
import pageObjects.IndividualCreate.IndividualCreatePage;
import pageObjects.Login.LoginPage;
import pageObjects.PageNavigation;

public class IndividualCreateSteps extends BaseClass{

    @Before
    public void SetUp()
    {
        //BaseClass.setFireFoxDriver();
        BaseClass.setChromeDriver();
    }

    @After
    public void TearDown(){
        BaseClass.closeDriver();
    }

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
        individualCreatePage.provideNationalityAndResidencyDetails();
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



}
