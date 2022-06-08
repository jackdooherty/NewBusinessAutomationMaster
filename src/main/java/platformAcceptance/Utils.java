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

}
