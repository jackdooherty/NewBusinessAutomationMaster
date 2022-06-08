package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TrustCreate.TrustCreatePage;
import platformAcceptance.BaseClass;
import platformAcceptance.PageNavigation;

public class TrustCreateSteps extends BaseClass {

        PageNavigation pageNavigation = new PageNavigation();
        TrustCreatePage trustCreatePage = new TrustCreatePage();

        @And("arrives on the Trust create page")
        public void arrivesOnTrustCreatePage() throws InterruptedException {
                pageNavigation.navigateToTrustCreate();
                Thread.sleep(2000);
        }

        @When("the user provides valid Trust client details")
        public void theUserProvidesValidTrustClientDetails() throws InterruptedException {
                trustCreatePage.selectClientAdviser();
        }

        @And("valid trust details")
        public void validTrustDetails() throws InterruptedException {
                trustCreatePage.selectTrustDetailsSection();
                trustCreatePage.discountedTrustDetailsWithinUk();
        }

        @And("searches for an existing Individual Trustee")
        public void searchesForAnExistingIndividualTrustee() throws InterruptedException {
                trustCreatePage.selectTrusteeSection();
                trustCreatePage.searchForIndividualTrustee();
        }

        @And("searches for an existing Individual Settlor")
        public void searchesForAnExistingIndividualSettlor() throws InterruptedException {
                trustCreatePage.selectSettlorSection();
                trustCreatePage.searchForIndividualSettlor();
        }

        @And("searches for an existing Individual Beneficial owner")
        public void searchesForAnExistingIndividualBeneficialOwner() throws InterruptedException {
                trustCreatePage.selectBeneficialOwnerSection();
                trustCreatePage.searchForIndividualBeneficialOwner();
        }

        @And("provides valid Trust contact details")
        public void providesValidTrustContactDetails() throws InterruptedException {
                trustCreatePage.selectContactDetails();
                trustCreatePage.contactDetails();
        }

        @And("provides valid Trust bank account details")
        public void providesValidTrustBankAccountDetails() throws InterruptedException {
                trustCreatePage.selectBankDetailsSection();
                trustCreatePage.provideBankDetails();
        }

        @And("selects valid Nucleus go access")
        public void selectsValidNucleusGoAccess() throws InterruptedException {
                trustCreatePage.selectNucleusGoSection();
                trustCreatePage.selectNucleusGoOptions();
        }

        @And("selects to have post correspondence")
        public void selectsToHavePostCorrespondence() throws InterruptedException
        {
                trustCreatePage.selectCorrespondenceSection();
                trustCreatePage.selectCorrespondenceSection();
                trustCreatePage.confirmEmailCorrespondenceSelected();
        }

        @Then("they should be able to select next")
        public void theyShouldBeAbleToSelectNext() throws InterruptedException
        {
                trustCreatePage.selectNextForTrustApp();
        }

        @And("submit the Trust application")
        public void submitTheTrustApplication() throws InterruptedException {
                trustCreatePage.submitTrustApplication();
        }

}


