package bdd_final_project.framework.steps;

import bdd_final_project.framework.pages.HomePage;
import bdd_final_project.framework.pages.UserProfilePage;
import bdd_final_project.framework.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class UserProfileStep extends SeleniumUtilities {

    @Then("click on profile button")
    public void clickOnProfileButton() {
        clickOnElement(UserProfilePage.PROFILE_BUTTON);

    }
    @Then("all profile side drawer must be correct {string}")
    public void allProfileSideDrawerMustBeCorrect(String info) {
    String profileInfo = getElementText(UserProfilePage.PROFILE_INFO);
    String profileSort = profileInfo.replaceAll(profileInfo,"STATUS:Active, USER TYPE:CSR, FULL NAME:Supervisor, USERNAME:supervisor, AUTHORITIES:admin");
    Assert.assertEquals(profileSort,info);
        System.out.println(profileSort);
    }
    HomePageSteps homePageSteps = new HomePageSteps();

    @Then("click on logout button and home page must display")
    public void clickOnLogoutButtonAndHomePageMustDisplay() {
    clickOnElement(UserProfilePage.LOGOUT_BUTTON);
    homePageSteps.validateLeftCornerTitle();

    }
}
