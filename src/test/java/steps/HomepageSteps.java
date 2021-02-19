package steps;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import uiPages.HomePage;


public class HomepageSteps extends PageObject {

    private HomePage homePage;
    @Step
    public void openBrowser()
    {
        homePage.open();
    }
    public void searchPlace()
    {
        homePage.search();
    }
    public void titleVerification()
    {
        // Assert.assertTrue(homePage.verifyHomePageTitle().equals("Home Page | Mail Travel"));
        // homePage.verifyHomePageTitle();
    }

}