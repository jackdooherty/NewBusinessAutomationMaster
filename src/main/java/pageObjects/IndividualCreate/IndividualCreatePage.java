package pageObjects.IndividualCreate;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import platformAcceptance.BaseClass;

import java.util.Random;
import java.util.concurrent.TimeUnit;


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


    public void selectClientAdviser()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.id("mat-select-value-1")).click();
        last.findElement(By.id("mat-option-114")).click();
    }

    public void selectPersonalDetailsSection() throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.cssSelector("[data-testid='menu-personal-li']")).click();
    }

    public void provideGenericPersonalDetails()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.id("mat-select-value-3")).click();
        last.findElement(By.id("mat-option-5")).click();

        last.findElement(By.id("mat-input-0")).sendKeys("Test");
        last.findElement(By.id("mat-input-2")).sendKeys("Junior");

        last.findElement(By.id("mat-radio-4")).click();

        last.findElement(By.id("mat-select-4")).click();

        last.findElement(By.id("mat-option-35")).click();

        last.findElement(By.id("date-input-0_day")).sendKeys("05");
        last.findElement(By.id("date-input-0_month")).sendKeys("05");
        last.findElement(By.id("date-input-0_year")).sendKeys("1990");
    }

    public void personalDetailsOverSeventyFive()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.id("mat-select-value-3")).click();
        last.findElement(By.id("mat-option-5")).click();

        last.findElement(By.id("mat-input-0")).sendKeys("Test");
        last.findElement(By.id("mat-input-2")).sendKeys("Junior");

        last.findElement(By.id("mat-radio-4")).click();

        last.findElement(By.id("mat-select-4")).click();

        last.findElement(By.id("mat-option-35")).click();

        last.findElement(By.id("date-input-0_day")).sendKeys("05");
        last.findElement(By.id("date-input-0_month")).sendKeys("04");
        last.findElement(By.id("date-input-0_year")).sendKeys("1946");
    }

    public void selectNationalityResidencySection()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.cssSelector("[data-testid='menu-nationality-li']")).click();
    }

    public void provideNationalityAndResidencyDetailsOutwithUK()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.id("mat-input-19")).click();

        //National Insurance Number
        Random objGenerator = new Random();
        int int1 = objGenerator.nextInt(9);
        int int2 = objGenerator.nextInt(9);
        int int3 = objGenerator.nextInt(9);
        int int4 = objGenerator.nextInt(9);
        int int5 = objGenerator.nextInt(9);
        int int6 = objGenerator.nextInt(9);

        String nn1 = String.valueOf(int1);
        String nn2 = String.valueOf(int2);
        String nn3 = String.valueOf(int3);
        String nn4 = String.valueOf(int4);
        String nn5 = String.valueOf(int5);
        String nn6 = String.valueOf(int6);

        last.findElement(By.id("mat-input-19")).sendKeys("AC" + nn1 + nn2 + nn3 + nn4 + nn5 + nn6 + "C");

        last.findElement(By.id("mat-select-value-13")).click();
        last.findElement(By.id("mat-option-81")).click();

        //Tax ID Number
        int int7 = objGenerator.nextInt(11111111);
        String idNumber = String.valueOf(int7);
        last.findElement(By.id("mat-input-24")).sendKeys(idNumber);

        last.findElement(By.id("mat-radio-9")).click();
        last.findElement(By.id("mat-checkbox-19")).click();
    }

    public void provideNationalityDetailsWithinUk()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.id("mat-input-19")).click();

        //National Insurance Number
        Random objGenerator = new Random();
        int int1 = objGenerator.nextInt(9);
        int int2 = objGenerator.nextInt(9);
        int int3 = objGenerator.nextInt(9);
        int int4 = objGenerator.nextInt(9);
        int int5 = objGenerator.nextInt(9);
        int int6 = objGenerator.nextInt(9);

        String nn1 = String.valueOf(int1);
        String nn2 = String.valueOf(int2);
        String nn3 = String.valueOf(int3);
        String nn4 = String.valueOf(int4);
        String nn5 = String.valueOf(int5);
        String nn6 = String.valueOf(int6);

        last.findElement(By.id("mat-input-19")).sendKeys("AC" + nn1 + nn2 + nn3 + nn4 + nn5 + nn6 + "C");

        WebElement taxResidency = last.findElement(By.cssSelector("[data-testid='tax-residency-select']"));
        String expectedTaxResidency = "United Kingdom";
        Assert.assertEquals(taxResidency.getText(), expectedTaxResidency);

        WebElement countryOfResidence = last.findElement(By.cssSelector("[data-testid='nationality-country-of-residence-form-select']"));
        String expectedCountryResidency = "United Kingdom";
        Assert.assertEquals(countryOfResidence.getText(), expectedCountryResidency);
    }

    public void selectContactDetailsSection()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.cssSelector("[data-testid='menu-contact-li']")).click();
    }

    public void provideContactDetails() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.id("mat-input-9")).sendKeys("G78 2PN");
        last.findElement(By.cssSelector("[data-testid='find-address-button']")).click();
        Thread.sleep(2000);

        last.findElement(By.id("mat-select-14")).click();
        Thread.sleep(2000);
        last.findElement(By.id("mat-option-4451")).click();
        Thread.sleep(1000);

        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.elementToBeClickable(addressOptions));
        //addressOptions.click();

        last.findElement(By.id("mat-select-value-9")).click();
        Thread.sleep(1000);
        last.findElement(By.id("mat-option-1")).click();

        //House Phone Number
        Random objGenerator = new Random();
        int int2 = objGenerator.nextInt(1111111111);
        String phoneNumber = String.valueOf(int2);
        last.findElement(By.id("mat-input-8")).sendKeys(phoneNumber);

        last.findElement(By.id("mat-input-10")).sendKeys("test1@gmail.com");
        last.findElement(By.id("mat-input-11")).sendKeys("test1@gmail.com");
    }

    public void selectBankAccountDetailsSection()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.cssSelector("[data-testid='menu-bankAccount-li']"));
    }

    public void provideBankAccountDetails()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.id("mat-input-12")).sendKeys("Test Senior");

        last.findElement(By.id("mat-input-16")).sendKeys("09");
        last.findElement(By.id("mat-input-17")).sendKeys("00");
        last.findElement(By.id("mat-input-18")).sendKeys("00");

        last.findElement(By.id("mat-input-13")).sendKeys("09090909");
    }

    public void selectNucleusGoSection()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.cssSelector("[data-testid='menu-bankAccount-li']"));
    }

    public void selectNucleusGoAccess()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.id("mat-checkbox-2")).isSelected();
        last.findElement(By.id("mat-checkbox-3")).isSelected();
        last.findElement(By.id("mat-checkbox-4")).click();
    }

    public void selectCorrespondencePreferencesSection()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.cssSelector("[data-testid='menu-correspondence-li']")).click();
    }

    public void selectAllCorrespondence()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.id("mat-checkbox-6")).click();
    }

    public void selectNext()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.cssSelector("[data-testid='next-button']")).click();
    }

    public void applyApplication()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.cssSelector("[data-testid='menu-summary-button']")).click();
    }

    public void waitForSuccessMessage() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.cssSelector("[data-testid='menu-start-app-button']")).isDisplayed();
        Thread.sleep(3000);

        //last.findElement(By.xpath("//SPAN[@class='alert-message-text-wrap-ng-tns-c150-0']")).isDisplayed();

        //last.findElement(By.xpath("//div[@class='d-flex align-items-center ng-tns-c150-0 ng-star-inserted']/span[@class='alert-message text-wrap ng-tns-c150-0']")).isDisplayed();

        //last.findElement(By.xpath("//div[@class='d-flex align-items-center ng-tns-c150-0 ng-star-inserted']")).isDisplayed();

        //
        // last.findElement(By.xpath("//sc-alert-area[@class='ng-tns-c150-0 ng-star-inserted sc-alert-visible']")).isDisplayed();

        //String clientReferenceAlert = driver.switchTo().alert().getText();
        //System.out.println(clientReferenceAlert);
    }

}
