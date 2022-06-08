package pageObjects.AdviserTools;

import org.openqa.selenium.By;
import platformAcceptance.BaseClass;

public class AdviserHomePage extends BaseClass
{

    public boolean verifyTabs(String feature, String state) {

        boolean actualTabState;
        boolean expectedTabState;
        boolean tabState;
        boolean notPresent;
        String id;

        switch (state) {
            case "enabled":
                expectedTabState = true;
                break;
            case "disabled":
                expectedTabState = false;
                break;
            default: {
                throw new IllegalArgumentException("Invalid expected state:" + state);
            }
        }

        switch (feature) {
            case "Home":
                id = "DASHBOARD";
                break;
            case "Clients":
                id = "CLIENT_HUB";
                break;
            case "Tools":
                id = "TOOLS";
                break;
            case "MI":
                id = "MI";
                break;
            case "Reports":
                id = "BETA_REPORTS";
                break;
            case "Tax year start":
                id = "TYE_MENU";
                break;
            case "Conversion":
                id = "CONVERSIONS";
                break;
            case "Wrapstore":
                id = "WRAP_STORE";
                break;
            case "Library":
                id = "LIBRARY";
                break;
            case "Research":
                id = "RESEARCH";
                break;
            case "Admin":
                id = "WRAP_PREFERENCE";
                break;
            case "Contact us":
                id = "CONTACT_US";
                break;
            case "Live Support":
                id = "supportDiv";
                break;
            case "MiFID II":
                id = "MiFID II";
                break;
            default:
                throw new IllegalArgumentException("Invalid feature:" + feature);

        }

        try {
            actualTabState = driver.findElement(By.id(id)).isDisplayed();
            notPresent = false;
        } catch (Exception e) {
            actualTabState = false;
            notPresent = true;
        }

        tabState = notPresent || (actualTabState && expectedTabState);

        return tabState;
    }

}
