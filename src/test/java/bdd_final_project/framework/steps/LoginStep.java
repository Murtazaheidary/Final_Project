package bdd_final_project.framework.steps;

import bdd_final_project.framework.pages.LoginPage;
import bdd_final_project.framework.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStep extends SeleniumUtilities {

    @Then("Click on Login button")
    public void click_on_login_button() {
        clickOnElement(LoginPage.LOGIN_BUTTON);
    }

    @Then("Login with valid user {string} and password {string}")
    public void login_with_valid_user_and_password(String username, String password) {
        sendText(LoginPage.USERNAME_INPUT, username);
        sendText(LoginPage.PASSWORD_INPUT, password);
    }

    @Then("Click on Sign in button")
    public void click_on_sign_in_button() {
        clickOnElement(LoginPage.SIGN_IN_BUTTON);

    }
    @Then("validate user navigate to Customer Service Portal")
    public void validateUserNavigateToCustomerServicePortal() {
        String title = getElementText(LoginPage.CUSTOMER_SERVICE_PORTAL_PAGE);
        Assert.assertEquals("Customer Service Portal",title);
        System.out.println(title);
    }
    @Then("Login with invalid user credentials {string} and {string}")
    public void Login_with_invalid_user_credentials(String username, String password) {
        sendText(LoginPage.USERNAME_INPUT, username);
        sendText(LoginPage.PASSWORD_INPUT, password);

    }

    @Then("Validate error message as expected {string}")
    public void validateErrorMessageAsExpected(String errorMessage) {
    String actualErrorMessage = getElementText(LoginPage.USER_ERROR_MESSAGE);
    //Assert.assertEquals("",errorMessage);
        System.out.println(actualErrorMessage);

    }
    @Then("Login with valid user {string} and invalid password {string}")
    public void loginWithValidUserAndInvalidPassword(String username, String password) {
        sendText(LoginPage.USERNAME_INPUT, username);
        sendText(LoginPage.PASSWORD_INPUT, password);
    }

}
