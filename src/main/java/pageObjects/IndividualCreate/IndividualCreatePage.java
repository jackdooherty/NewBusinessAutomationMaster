package pageObjects.IndividualCreate;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import platformAcceptance.BaseClass;

import java.util.Random;



public class IndividualCreatePage extends BaseClass {


    @FindBy(id = "mat-select-value-1")
    private WebElement clientAdviserField;

    @FindBy(id = "mat-option-114")
    private WebElement clientAdviserOption;

    @FindBy(css =  "[data-testid='menu-personal-li']")
    private WebElement personalDetailsSelect;

    @FindBy(id =  "mat-select-value-3")
    private WebElement personalTitleField;

    @FindBy(id = "mat-option-5")
    private WebElement personalTitleOption;

    @FindBy(id = "mat-input-0")
    private WebElement personalFirstName;

    @FindBy(id = "mat-input-2")
    private WebElement personalLastName;

    @FindBy(id = "mat-input-3")
    private WebElement personalSalutation;

    @FindBy(id = "mat-radio-5")
    private WebElement personalGender;

    @FindBy(id = "mat-select-value-5")
    private WebElement personaMaritalStatusField;

    @FindBy(id = "mat-option-35")
    private WebElement personalMaritalStatusOption;

    @FindBy(id = "date-input-0_day")
    private WebElement personalBirthdayDay;

    @FindBy(id = "date-input-0_month")
    private WebElement personalBirthdayMonth;

    @FindBy(id = "date-input-0_year")
    private WebElement personalBirthdayYear;

    @FindBy(css = "[data-testid='menu-nationality-li']")
    private WebElement nationalityAndResidencySelect;

    @FindBy(id = "mat-select-10")
    private WebElement nationalityField;

    @FindBy(id = "mat-option-4758")
    private WebElement nationalityOption;

    @FindBy(id = "mat-input-19")
    private WebElement nationalInsuranceNumber;

    @FindBy(id = "mat-input-24")
    private WebElement nationalityIDNumber;

    @FindBy(css = "[data-testid='nationality-add-a']")
    private WebElement addAnotherNationality;

    @FindBy(id = "mat-select-14")
    private WebElement otherNationalityField;

    @FindBy(xpath = "//span[contains(text(),' Remove ')]")
    private WebElement removeNationality;

    @FindBy(id = "mat-select-12")
    private WebElement taxResidency;

    @FindBy(id = "mat-option-86")
    private WebElement taxResidencyOption;

    @FindBy(id = "mat-input-30")
    private WebElement taxIDNumber;

    @FindBy(id = "mat-radio-10")
    private WebElement selfCertificationEvidenceButton;

    @FindBy(id = "mat-checkbox-19")
    private WebElement taxResidencyCheckBox;

    @FindBy(css = "[data-testid='menu-contact-li']")
    private WebElement contactDetails;

    @FindBy(css = "[data-testid='postcode-form-field']")
    private WebElement postCodeField;

    @FindBy(css = "[data-testid='find-address-button']")
    private WebElement findAddress;

    @FindBy(id = "mat-select-14-panel")
    private WebElement selectAddress;

    @FindBy(id = "mat-option-4641")
    private WebElement selectAddressOption;

    @FindBy(id = "mat-select-8")
    private WebElement phoneNumberType;

    @FindBy(id = "mat-option-1")
    private WebElement phoneNumberTypeSelect;

    @FindBy(id = "mat-input-9")
    private WebElement phoneNumberField;

    @FindBy(id = "mat-input-10")
    private WebElement emailField;

    @FindBy(id = "mat-input-11")
    private WebElement emailFieldConfirm;

    @FindBy(css = "[data-testid='menu-bankAccount-li']")
    private WebElement bankAccountDetails;

    @FindBy(id = "mat-input-12")
    private WebElement accountHolderName;

    @FindBy(id = "mat-input-16")
    private WebElement sortCode1;

    @FindBy(id = "mat-input-17")
    private WebElement sortCode2;

    @FindBy(id = "mat-input-18")
    private WebElement sortCode3;

    @FindBy(id = "mat-input-13")
    private WebElement accountNumber;

    @FindBy(css = "[data-testid='menu-bankAccount-li']")
    private WebElement nucleusGoAccess;

    @FindBy(id = "mat-checkbox-2")
    private WebElement nucleusGoCheckBox;

    @FindBy(id = "mat-checkbox-3")
    private WebElement transactionHistoryCheckBox;

    @FindBy(css = "[data-testid='menu-correspondence-li']")
    private WebElement correspondencePreferencesSection;

    @FindBy(id = "mat-checkbox-4")
    private WebElement memoAssetsCheckBox;

    @FindBy(id = "mat-checkbox-6")
    private WebElement allCorrespondenceCheckBox;

    @FindBy(id = "mat-checkbox-8")
    private WebElement contractNotesCheckBox;

    @FindBy(id = "mat-checkbox-10")
    private WebElement statementsCostDisclosureCheckBox;

    @FindBy(css = "[data-testid='next-button']")
    private WebElement nextButton;

    @FindBy(css = "[data-testid='menu-summary-button']")
    private WebElement applyButton;


    public void selectClientAdviser() throws InterruptedException
    {
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        Thread.sleep(2000);
        last.findElement(By.id("mat-select-value-1")).click();
        Thread.sleep(1000);
        last.findElement(By.id("mat-option-114")).click();
    }

    public void selectPersonalDetailsSection() throws InterruptedException
    {
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        Thread.sleep(1000);
        last.findElement(By.cssSelector("[data-testid='menu-personal-li']")).click();
        Thread.sleep(1000);
    }

    public void providePersonalDetails() throws InterruptedException
    {
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        Thread.sleep(1000);
        last.findElement(By.id("mat-select-value-3")).click();
        Thread.sleep(1000);
        last.findElement(By.id("mat-option-5")).click();
        Thread.sleep(1000);

        last.findElement(By.id("mat-input-0")).sendKeys("Test");
        last.findElement(By.id("mat-input-2")).sendKeys("Junior");

        Thread.sleep(1000);

        last.findElement(By.id("mat-radio-4")).click();

        last.findElement(By.id("mat-select-4")).click();
        Thread.sleep(1000);

        last.findElement(By.id("mat-option-35")).click();
        Thread.sleep(1000);

        last.findElement(By.id("date-input-0_day")).sendKeys("05");
        last.findElement(By.id("date-input-0_month")).sendKeys("05");
        last.findElement(By.id("date-input-0_year")).sendKeys("1990");
    }

    public void selectNationalityResidencySection() throws InterruptedException {
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        Thread.sleep(1000);
        last.findElement(By.cssSelector("[data-testid='menu-nationality-li']")).click();
        Thread.sleep(1000);
    }

    public void provideNationalityAndResidencyDetailsOutwithUK() throws InterruptedException {
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.id("mat-input-19")).click();

        //National Insurance Number
        Random objGenerator = new Random();
        int int1 = objGenerator.nextInt(999999);
        String nationalNumber = String.valueOf(int1);
        last.findElement(By.id("mat-input-19")).sendKeys("AC" + nationalNumber + "C");
        Thread.sleep(1000);

        last.findElement(By.id("mat-select-value-13")).click();
        Thread.sleep(1000);
        last.findElement(By.id("mat-option-81")).click();
        Thread.sleep(1000);

        //Tax ID Number
        int int2 = objGenerator.nextInt(11111111);
        String idNumber = String.valueOf(int2);
        last.findElement(By.id("mat-input-24")).sendKeys(idNumber);

        last.findElement(By.id("mat-radio-9")).click();
        last.findElement(By.id("mat-checkbox-19")).click();
    }

    public void provideNationalityDetailsWithinUk() throws InterruptedException {
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.id("mat-input-19")).click();

        //National Insurance Number
        Random objGenerator = new Random();
        int int1 = objGenerator.nextInt(999999);
        String nationalNumber = String.valueOf(int1);
        last.findElement(By.id("mat-input-19")).sendKeys("AC" + nationalNumber + "C");
        Thread.sleep(1000);

        WebElement taxResidency = last.findElement(By.cssSelector("[data-testid='tax-residency-select']"));
        String expectedTaxResidency = "United Kingdom";
        Assert.assertEquals(taxResidency.getText(), expectedTaxResidency);

        WebElement countryOfResidence = last.findElement(By.cssSelector("[data-testid='nationality-country-of-residence-form-select']"));
        String expectedCountryResidency = "United Kingdom";
        Assert.assertEquals(countryOfResidence.getText(), expectedCountryResidency);
    }

    public void selectContactDetailsSection() throws InterruptedException {
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        Thread.sleep(4000);
        last.findElement(By.cssSelector("[data-testid='menu-contact-li']")).click();
    }

    public void provideContactDetails() throws InterruptedException
    {
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        Thread.sleep(2000);
        last.findElement(By.id("mat-input-9")).sendKeys("G78 2PN");
        Thread.sleep(1000);
        last.findElement(By.cssSelector("[data-testid='find-address-button']")).click();
        Thread.sleep(1000);
        last.findElement(By.id("mat-select-14")).click();
        Thread.sleep(1000);
        last.findElement(By.id("mat-option-4451")).click();
        Thread.sleep(1000);

        last.findElement(By.id("mat-select-value-9")).click();
        Thread.sleep(1000);
        last.findElement(By.id("mat-option-1")).click();
        Thread.sleep(1000);

        //House Phone Number
        Random objGenerator = new Random();
        int int2 = objGenerator.nextInt(1111111111);
        String phoneNumber = String.valueOf(int2);
        last.findElement(By.id("mat-input-8")).sendKeys(phoneNumber);

        last.findElement(By.id("mat-input-10")).sendKeys("test1@gmail.com");
        last.findElement(By.id("mat-input-11")).sendKeys("test1@gmail.com");
    }

    public void selectBankAccountDetailsSection() throws InterruptedException {
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        Thread.sleep(1000);
        last.findElement(By.cssSelector("[data-testid='menu-bankAccount-li']"));
        Thread.sleep(1000);
    }

    public void provideBankAccountDetails()
    {
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.id("mat-input-12")).sendKeys("Test Senior");

        last.findElement(By.id("mat-input-16")).sendKeys("09");
        last.findElement(By.id("mat-input-17")).sendKeys("00");
        last.findElement(By.id("mat-input-18")).sendKeys("00");

        last.findElement(By.id("mat-input-13")).sendKeys("09090909");
    }

    public void selectNucleusGoSection() throws InterruptedException
    {
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        Thread.sleep(1000);
        last.findElement(By.cssSelector("[data-testid='menu-bankAccount-li']"));
    }

    public void selectNucleusGoAccess() throws InterruptedException
    {
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        Thread.sleep(1000);
        last.findElement(By.id("mat-checkbox-2")).isSelected();
        last.findElement(By.id("mat-checkbox-3")).isSelected();
        last.findElement(By.id("mat-checkbox-4")).click();
    }

    public void selectCorrespondencePreferencesSection() throws InterruptedException {
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        Thread.sleep(1000);
        last.findElement(By.cssSelector("[data-testid='menu-correspondence-li']")).click();
    }

    public void selectAllCorrespondence() throws InterruptedException {
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.id("mat-checkbox-6")).click();
        Thread.sleep(1000);
    }

    public void selectNext() throws InterruptedException {
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        Thread.sleep(5000);
        last.findElement(By.cssSelector("[data-testid='next-button']")).click();
    }

    public void applyApplication() throws InterruptedException {
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        Thread.sleep(5000);
        last.findElement(By.cssSelector("[data-testid='menu-summary-button']")).click();
    }

    public void waitForSuccessMessage() throws InterruptedException {
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        Thread.sleep(6000);
        last.findElement(By.cssSelector("[data-testid='menu-start-app-button']")).isDisplayed();
    }

}
