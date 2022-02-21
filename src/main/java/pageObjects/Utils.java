package pageObjects;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends BaseClass{

    //Implicit wait, tells the WebDriver to wait for a certain period before failing the test
    public static boolean waitForCondition(ExpectedCondition condition, int timeout)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(condition);
        return true;
    }

}
