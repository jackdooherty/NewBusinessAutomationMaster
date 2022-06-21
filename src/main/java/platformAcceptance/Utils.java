package platformAcceptance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils extends BaseClass {

    WebElement shadowDomHostElement;
    SearchContext last;
    private WebDriverWait wait;


    //Implicit wait, tells the WebDriver to wait for a certain period before failing the test
    public static boolean waitForCondition(ExpectedCondition condition, int timeout)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(condition);
        return true;
    }

    public void shadowVar()
    {
        shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);
    }


    public boolean printDocumentsButtonIsDisplayed()
    {
        shadowVar();
        WebElement printDocumentsButton = last.findElement(By.id("confirmSubmittedForm:printDocsButton"));
        new WebDriverWait(driver, Duration.ofSeconds(45)).until(ExpectedConditions.visibilityOf(printDocumentsButton));
        return printDocumentsButton.getText().toLowerCase().contains("print documents");
    }

    public void clickSelectISAFromAccountTypeDropdown()  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-testid='account-selection-add-new-application-button']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='selectProduct']/option[2]")));
    }


    /*
    Scenario: Add an Individual Client
    And is ready to add a individual client
    When a new client is added to the platform with the following details
      | Adviser            | Category     | Title | Forename | Surname | Salutation | Sex  | Martial Status | Date of Birth |
      | Fullerton - 109103 | Professional | Mr    | Bill     | Smith   | Dear       | Male | Single         | 01121988      |

-----------------------------------------------------------------------------------------------------------------------------------

    @When("^a new client is added to the platform with the following details$")
    public void aNewClientIsAddedToThePlatformWithTheFollowingDetails(List<Map<String, String>> newClientDetails) throws Throwable {
        String adviser = null;
        String category = null;
        String title = null;
        String forename = null;
        String surname = null;
        String martialStatus = null;
        String sex = null;
        String dob = null;

        for (Map<String, String> map : newClientDetails) {
            adviser = map.get("Adviser");
            category = map.get("Category");
            title = map.get("Title");
            forename = map.get("Forename");
            surname = map.get("Surname");
            //            salutation = map.get("Salutation");
            sex = map.get("Sex");
            martialStatus = map.get("Martial Status");
            dob = map.get("Date of Birth");

        }

        clientCreateIndividualPage.setAdviserDropDownListField(adviser);
        clientCreateIndividualPage.setClientCategoryDropDownListField(category);
        clientCreateIndividualPage.setTitleDropDownListField(title);
        clientCreateIndividualPage.setForenameTextField(forename);
        clientCreateIndividualPage.setSurnameTextField(surname);
        clientCreateIndividualPage.setSexDropDownListField(sex);
        clientCreateIndividualPage.setMaritalStatusDropDownListField(martialStatus);
        clientCreateIndividualPage.setDateOfBirthTextField(dob);
        clientCreateIndividualPage.clickOnDoBField();
        clientCreateIndividualPage.clickCloseDataPicker();

-----------------------------------------------------------------------------------------

        public void setDateOfBirthTextField(String dateOfBirthValue) {
        shadowVar();
        WebElement dateOfBirth = last.findElement(By.cssSelector("#date-input-0_day"));
        dateOfBirth.sendKeys(dateOfBirthValue);
    }


      */

}
