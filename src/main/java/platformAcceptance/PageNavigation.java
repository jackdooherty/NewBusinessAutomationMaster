package platformAcceptance;

public class PageNavigation extends BaseClass {

    public void navigateToHomePage()
    {
        driver.get("https://nucsonuat2.nuc.bslcloud.com/remoh/ria/advisor/home");
    }

    public void navigateToIndividualCreate()
    {
        driver.get("https://nucsonuat2.nuc.bslcloud.com/remoh/ria/client/create-component?type=individual");
    }

    public void navigateToCompanyCreate()
    {
        driver.get("");
    }

    public void navigateToTrustCreate()
    {
        driver.get("https://nucsonuat2.nuc.bslcloud.com/remoh/ria/client/create-component?type=trust");
    }

    public void navigateToViewAndEdit()
    {
        driver.get("");
    }



}
