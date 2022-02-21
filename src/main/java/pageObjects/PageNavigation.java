package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageNavigation extends BaseClass{

    public void NavigateToIndividualCreate()
    {
        driver.get("https://nucsondev1.nuc.bslcloud.com/remoh/ria/client/create-component?type=individual");
    }

}
