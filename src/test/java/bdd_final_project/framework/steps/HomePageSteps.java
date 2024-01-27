package bdd_final_project.framework.steps;

import bdd_final_project.framework.pages.HomePage;
import bdd_final_project.framework.utility.SeleniumUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSteps extends SeleniumUtilities {
    @Given("open browser and navigate to TEK Insurance UI")
    public void openBrowserAndNavigate() {
        setupBrowser();
    }
    @Then("Validate title on top left corner")
    public void validateLeftCornerTitle() {
        String actualTitle = getElementText(HomePage.HOME_PAGE_TITLE);
        System.out.println(actualTitle);
        Assert.assertEquals("TEK Insurance App" , actualTitle);
    }

    @Then("quit the browser")
    public void closeBrowserAtEnd() {
        getDriver().quit();
    }


    @Then("Validate Create Primary Account is enable")
    public void createPrimaryAccountIsEnabled(){
        boolean createAccountButtonIsEnabled = isElementEnabled(HomePage.CREATE_PRIMARY_ACCOUNT_BUTTON_IS_ENABLE);
        Assert.assertTrue("Is Enabled ",createAccountButtonIsEnabled);
        System.out.println(true);

    }
    @When("Click on Create Primary Account button")
    public void clickOnPrimaryAccountButton(){
    clickOnElement(HomePage.CLICK_ON_CREATE_PRIMARY_BUTTON);
    }


}
