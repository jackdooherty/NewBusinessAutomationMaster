package StepDefinitions;

import io.cucumber.java.en.Then;
import pageObjects.AdviserTools.AdviserHomePage;
import platformAcceptance.BaseClass;

import static org.junit.Assert.assertTrue;

public class AdviserHomePageSteps extends BaseClass {


    @Then("the {string} is {string} for the user")
    public void theIsForTheUser(String availableFeature, String state)
    {
        AdviserHomePage adviserHomePage = new AdviserHomePage();
        assertTrue(adviserHomePage.verifyTabs(availableFeature, state));
    }
}
