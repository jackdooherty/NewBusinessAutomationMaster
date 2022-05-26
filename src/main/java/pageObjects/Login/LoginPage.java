package pageObjects.Login;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import platformAcceptance.BaseClass;
import platformAcceptance.Utils;

import java.util.concurrent.TimeUnit;

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

    public static void SubmitDetails()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(("//span[contains(text(),'Login')]"))).click();
    }

    public void WaitForIndividualPageLoad() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector(".webcomponent"));
        SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);
        Thread.sleep(5000);
    }

    public void provideInvalidDetails()
    {
        Utils utils = new Utils();
        utils.waitForCondition(presenceOfElementLocated(By.name("username")),10);
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("TestyTester");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("123123");
    }

    public void checkLoginPageUrl()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://nucsondev1.nuc.bslcloud.com/remoh/ria/client/j_security_check" );
    }

}
