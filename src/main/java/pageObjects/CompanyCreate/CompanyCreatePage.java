package pageObjects.CompanyCreate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import platformAcceptance.BaseClass;

import java.util.concurrent.TimeUnit;

public class CompanyCreatePage extends BaseClass {

    public void selectClientAdviser() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        //Client adviser field
        last.findElement(By.id("mat-select-value-1")).click();
        Thread.sleep(1000);
        //Client adviser dropdown option
        last.findElement(By.id("mat-option-131")).click();
    }

    public void selectCompanyDetailsSection()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.cssSelector("[data-testid='menu-company-li']")).click();

    }

    public void companyDetailsWithinUK()
    {

    }

}
