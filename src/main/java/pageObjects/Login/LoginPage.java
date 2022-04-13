package pageObjects.Login;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import platformAcceptance.BaseClass;
import platformAcceptance.Utils;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class LoginPage extends BaseClass {


    public static void provideValidDetails()
    {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement usernameField = wait.until(presenceOfElementLocated(By.name("username")));
        usernameField.sendKeys("LC");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Genpact2016");
    }

    public static void SubmitDetails() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(("//span[contains(text(),'Login')]"))).click();
    }

    public void WaitForIndividualPageLoad() throws InterruptedException {
        Thread.sleep(5000);

        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);

        last.findElement(By.id("mat-radio-6")).click();
        Thread.sleep(2000);
    }

    public void provideInvalidDetails()
    {
        Utils utils = new Utils();
        utils.waitForCondition(presenceOfElementLocated(By.name("username")),10);
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("LC");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("123123");
    }

    public void waitForLoginError() throws InterruptedException {
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);
        Thread.sleep(4000);
        last.findElement(By.xpath("//span[contains(text(),'The login details supplied were incorrect. If you're a client trying to access Nucleus Go, please use the link on the left.')]"));
    }

}
