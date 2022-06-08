package pageObjects.TrustCreate;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import platformAcceptance.BaseClass;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TrustCreatePage extends BaseClass {

    public void selectClientAdviser() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        Thread.sleep(2000);

        //Client adviser field
        last.findElement(By.id("mat-select-value-1")).click();
        Thread.sleep(1000);
        //Client adviser dropdown option
        last.findElement(By.id("mat-option-131")).click();
    }

    public void selectTrustDetailsSection() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        Thread.sleep(1000);
        last.findElement(By.cssSelector("[data-testid='menu-trustDetails-li']"));
    }

    public static String generateTrustName(int len)
    {
            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String randomString = "";
            Random rnd = new Random();

            char[] text = new char[len];

            for(int i = 0; i < len; i++)
            {
                text[i] = chars.charAt(rnd.nextInt(chars.length()));
            }

        return randomString;
    }

    public void discountedTrustDetailsWithinUk() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        Thread.sleep(2000);

        //Trust Details Name
        last.findElement(By.id("mat-input-0")).sendKeys(generateTrustName(8) + "Ltd");

        //Classification
        last.findElement(By.id("mat-select-2")).click();
        Thread.sleep(1000);
        last.findElement(By.id("mat-option-0")).click();
        Thread.sleep(1000);

        //Tax Residency
        WebElement taxResidency = last.findElement(By.cssSelector("[data-testid='tax-residency-select']"));
        String expectedTaxResidency = "United Kingdom";
        Assert.assertEquals(taxResidency.getText(), expectedTaxResidency);

        //Country of establishment
        WebElement countryOfResidence = last.findElement(By.cssSelector("[data-testid='trust-country-of-establishment-form-select']"));
        String expectedCountryEstablishment = "United Kingdom";
        Assert.assertEquals(countryOfResidence.getText(), expectedCountryEstablishment);

        //Nature of trust
        last.findElement(By.id("mat-select-6")).click();
        Thread.sleep(1000);
        //Discretionary discounted gift trust
        last.findElement(By.id("mat-option-29")).click();

        //Purpose of Trust
        last.findElement(By.id("mat-input-1")).sendKeys("Trust Test");

        //Date of establishment
        last.findElement(By.id("date-input-0_day")).sendKeys("09");
        last.findElement(By.id("date-input-0_month")).sendKeys("09");
        last.findElement(By.id("date-input-0_year")).sendKeys("2000");
    }

    public void selectTrusteeSection() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.cssSelector("[data-testid='menu-trustee-li']")).click();
        Thread.sleep(1000);
    }

    public void searchForIndividualTrustee() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        //Trustee search
        last.findElement(By.id("mat-input-28")).sendKeys("John");
        Thread.sleep(1000);
        //Johns Jodi - 100000581 - Individual
        last.findElement(By.id("mat-option-4768")).click();

        Thread.sleep(1000);

        WebElement typeTrustee = last.findElement(By.cssSelector("[data-testid='beneficial-owners-client-type-0-sc-label']"));
        WebElement firstNameTrustee = last.findElement(By.cssSelector("[data-testid='beneficial-owners-first-name-0-sc-label']"));
        WebElement lastNameTrust = last.findElement(By.cssSelector("[data-testid='beneficial-owners-last-name-0-sc-label']"));
        WebElement trusteeNationality = last.findElement(By.cssSelector("[data-testid='nationality-group-nationality-sc-label']"));
        WebElement nationalInsuranceNumber = last.findElement(By.cssSelector("[data-testid='nationality-identifier-type-field']"));
        WebElement countryOfResidence = last.findElement(By.cssSelector("[data-testid='nationality-countryOfResidence-sc-label']"));

        Assert.assertTrue(typeTrustee.isDisplayed());
        Assert.assertTrue(firstNameTrustee.isDisplayed());
        Assert.assertTrue(lastNameTrust.isDisplayed());
        Assert.assertTrue(trusteeNationality.isDisplayed());
        Assert.assertTrue(nationalInsuranceNumber.isDisplayed());
        Assert.assertTrue(countryOfResidence.isDisplayed());
    }

    public void selectSettlorSection() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.cssSelector("[data-testid='menu-settlor-li']")).click();
        Thread.sleep(1000);
    }

    public void searchForIndividualSettlor() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        //Settlor search field
        last.findElement(By.id("mat-input-36")).sendKeys("John");
        Thread.sleep(1000);
        //Robbins John - 100000580 - Individual
        last.findElement(By.id("mat-option-4848")).click();

        Thread.sleep(1000);

        WebElement typeSettlor = last.findElement(By.cssSelector("[data-testid='beneficial-owners-client-type-0-form-field']"));
        WebElement firstNameSettlor = last.findElement(By.cssSelector("[data-testid='beneficial-owners-first-name-0-sc-label']"));
        WebElement lastNameSettlor = last.findElement(By.cssSelector("[data-testid='beneficial-owners-last-name-0-sc-label']"));
        WebElement settlorNationality = last.findElement(By.cssSelector("[data-testid='nationality-group-nationality-sc-label']"));
        WebElement nationalInsuranceNumber = last.findElement(By.cssSelector("[data-testid='nationality-group-nationality-sc-label']"));
        WebElement countryOfResidence = last.findElement(By.cssSelector("[data-testid='nationality-countryOfResidence-sc-label']"));

        Assert.assertTrue(typeSettlor.isDisplayed());
        Assert.assertTrue(firstNameSettlor.isDisplayed());
        Assert.assertTrue(lastNameSettlor.isDisplayed());
        Assert.assertTrue(settlorNationality.isDisplayed());
        Assert.assertTrue(nationalInsuranceNumber.isDisplayed());
        Assert.assertTrue(countryOfResidence.isDisplayed());
    }

    public void selectBeneficialOwnerSection() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.cssSelector("[data-testid='menu-beneficialOwners-li']")).click();
        Thread.sleep(1000);
    }

    public void searchForIndividualBeneficialOwner() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        //Beneficial owner search field
        last.findElement(By.id("mat-input-44")).sendKeys("John");
        Thread.sleep(1000);
        //Johns Jodi - 100000581 - Individual
        last.findElement(By.id("mat-option-4930")).click();

        WebElement typeBO = last.findElement(By.cssSelector("[data-testid='beneficial-owners-client-type-0-sc-label']"));
        WebElement firstNameBO = last.findElement(By.cssSelector("[data-testid='beneficial-owners-first-name-0-sc-label']"));
        WebElement lastNameBO = last.findElement(By.cssSelector("[data-testid='beneficial-owners-last-name-0-sc-label']"));
        WebElement bONationality = last.findElement(By.cssSelector("[data-testid='nationality-group-nationality-sc-label']"));
        WebElement nationalInsuranceNumber = last.findElement(By.cssSelector("[data-testid='nationality-identifier-type-field']"));
        WebElement countryOfResidence = last.findElement(By.cssSelector("[data-testid='nationality-countryOfResidence-sc-label']"));

        Assert.assertTrue(typeBO.isDisplayed());
        Assert.assertTrue(firstNameBO.isDisplayed());
        Assert.assertTrue(lastNameBO.isDisplayed());
        Assert.assertTrue(bONationality.isDisplayed());
        Assert.assertTrue(nationalInsuranceNumber.isDisplayed());
        Assert.assertTrue(countryOfResidence.isDisplayed());
    }

    public void selectContactDetails() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.cssSelector("[data-testid='menu-companyContact-li']")).click();
        Thread.sleep(1000);
    }

    public void contactDetails() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        //ContactName
        last.findElement(By.id("mat-input-6")).sendKeys("John Taylor");

        //Salutation
        WebElement salutationField = last.findElement(By.id("mat-input-7"));
        String expectedSalutation = "Dear John Taylor";
        Assert.assertEquals(salutationField.getText(), expectedSalutation);

        //Postcode
        last.findElement(By.id("mat-input-10")).sendKeys("G78 2PL");
        Thread.sleep(1000);
        last.findElement(By.cssSelector("data-testid='find-address-button'"));
        Thread.sleep(1000);
        last.findElement(By.id("mat-option-5009"));

        //Phone Number
        last.findElement(By.id("mat-input-9")).sendKeys("0141 121 1020");

        //Email Address
        last.findElement(By.id("mat-input-12")).sendKeys("johntaylor.com");

        //Email address confirm
        last.findElement(By.id("mat-input-13")).sendKeys("johntaylor.com");
    }

    public void selectBankDetailsSection() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.cssSelector("[data-testid='menu-bankAccount-li']")).click();
        Thread.sleep(1000);
    }

    public void provideBankDetails()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        //Account name
        last.findElement(By.id("mat-input-14")).sendKeys("John Taylor");

        //Sort Code
        last.findElement(By.id("mat-input-18")).sendKeys("090000");

        //Account Number
        last.findElement(By.id("mat-input-15")).sendKeys("09090909");
    }

    public void selectNucleusGoSection() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.cssSelector("[data-testid='menu-externalAccess-li']")).click();
        Thread.sleep(1000);
    }

    public void selectNucleusGoOptions() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        WebElement nucleusGo = last.findElement(By.id("mat-checkbox-1"));
        WebElement transactionHistory = last.findElement(By.id("mat-checkbox-2"));
        WebElement memoAssets = last.findElement(By.id("mat-checkbox-3"));

        last.findElement(By.id("mat-checkbox-3")).click();
        Thread.sleep(1000);

        Assert.assertTrue(nucleusGo.isSelected());
        Assert.assertTrue(transactionHistory.isSelected());
        Assert.assertTrue(memoAssets.isSelected());
    }

    public void selectCorrespondenceSection() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.cssSelector("[data-testid='menu-correspondence-li']"));
        Thread.sleep(1000);
    }

    public void selectPostCorrespondence()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.id("mat-checkbox-5")).click();
    }

    public void confirmEmailCorrespondenceSelected()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        WebElement emailCorrespondence1 = last.findElement(By.id("mat-checkbox-4"));
        Assert.assertTrue(emailCorrespondence1.isSelected());
    }

    public void selectNextForTrustApp() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        Thread.sleep(1000);
        last.findElement(By.cssSelector("[data-testid='next-button']")).click();
    }

    public void submitTrustApplication() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        Thread.sleep(2000);
        last.findElement(By.cssSelector("[data-testid='menu-summary-button']"));
        
    }

}
