package pageObjects.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.BaseClass;
import pageObjects.Utils;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class LoginPage extends BaseClass {

    public static void provideValidDetails()
    {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement usernameField = wait.until(presenceOfElementLocated(By.name("username")));
        usernameField.sendKeys("LC");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Nucnew123");
    }

    public static void SubmitDetails() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(("//span[contains(text(),'Login')]"))).click();
    }

    public void WaitForIndividualPageLoad() throws InterruptedException {
        //Thread.sleep(20000);
        //driver.switchTo().frame("lpSS_32791885408");
        //utils.waitForCondition(presenceOfElementLocated(ByAngular.buttonText(" Client category and adviser ")),20);
        Utils utils = new Utils();
        utils.waitForCondition(presenceOfElementLocated(By.id("mat-select-value-1")),30);
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

    public void waitForLoginError()
    {
        Utils utils = new Utils();
        utils.waitForCondition(presenceOfElementLocated(By.xpath("//span[contains(text(),'The login details supplied were incorrect. If you're a client trying to access Nucleus Go, please use the link on the left.')]")), 30);
    }

}
