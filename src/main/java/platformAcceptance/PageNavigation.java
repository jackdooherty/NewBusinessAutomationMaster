package platformAcceptance;

import platformAcceptance.BaseClass;

public class PageNavigation extends BaseClass {

    public void NavigateToIndividualCreate()
    {
        driver.get("https://nucsondev1.nuc.bslcloud.com/remoh/ria/client/create-component?type=individual");
    }

}
