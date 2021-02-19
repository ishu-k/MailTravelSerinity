package appTest;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.HomepageSteps;

@RunWith(SerenityRunner.class)

public class SearchTest extends PageObject {
    @Steps
    HomepageSteps homepageSteps;
    @Managed(driver ="Chrome")
    WebDriver driver;

    @Test
    public void searchTest()
    {
        homepageSteps.openBrowser();
        homepageSteps.searchPlace();
        homepageSteps.titleVerification();

    }

}