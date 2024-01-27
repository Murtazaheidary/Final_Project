package bdd_final_project.framework.steps;

import bdd_final_project.framework.pages.CreateAccountPage;
import bdd_final_project.framework.utility.DataProvider;
import bdd_final_project.framework.utility.SeleniumUtilities;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


import java.util.List;
import java.util.Map;


public class CreateAccountStep extends SeleniumUtilities {
    private static String mainEmail;
    DataProvider dataProvider = new DataProvider();

    @Then("Create Primary Account Holder should be the title")
    public void primaryAccountTitle(){
    getElementText(CreateAccountPage.PRIMARY_ACCOUNT_TITTLE);
        String actualTitle = getElementText(CreateAccountPage.PRIMARY_ACCOUNT_TITTLE);
        System.out.println(actualTitle);
        Assert.assertEquals("Create Primary Account Holder",actualTitle);
    }
    @When("Fill Create Primary Account Holder form from DataTable")
    public void fillCreateAccountForm(DataTable dataTable)  {
    Map<String, String> data = dataTable.asMap();

        mainEmail = dataProvider.getRandomEmail();
        sendText(CreateAccountPage.EMAIL_INPUT,mainEmail);

        selectDropDownByText(CreateAccountPage.CLICK_ON_TITLE_DROPDOWN,data.get("title"));

        sendText(CreateAccountPage.FIRST_NAME_INPUT,data.get("firstName"));
        sendText(CreateAccountPage.LAST_NAME_INPUT,data.get("lastName"));

        selectDropDownByValue(CreateAccountPage.GENDER_DROP_DOWN,data.get("gender"));

        selectDropDownByText(CreateAccountPage.MARITAL_STATUS_DROPDOWN,data.get("maritalStatus"));

        sendText(CreateAccountPage.EMPLOYMENT_STATUS_INPUT,data.get("employmentStatus"));
        sendText(CreateAccountPage.DATE_OF_BIRTH_INPUT,data.get("dateOfBirth"));

    }
    @Then("Click on Create Account button")
    public void clickOnCreateAccountButton()  {
    clickOnElement(CreateAccountPage.SUBMIT_CREATE_ACCOUNT);

    }
    @Then("Validate user is on {string}")
    public void validateUserIsOn(String title) {
        waitForVisibility(CreateAccountPage.SIGN_UP_TITLE);
    Assert.assertEquals(title,getElementText(CreateAccountPage.SIGN_UP_TITLE));

    }
    @Then("Display email must be same as entry")
    public void displayEmailAsExpected()  {
      for (WebElement element: findElements(CreateAccountPage.EMAIL_OF_CREATE_ACCOUNT_AS_EXPECTED)){
          getElementText(element);
          if (element.getText().equals(mainEmail)){
          Assert.assertTrue(element.isDisplayed());
      }
          System.out.println(element.getText());
      }

    }


    @When("Re-registering from dataTable with existing email must gave error message")
    public void re_registering_with_existing_email_must_gave_error_message(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        sendText(CreateAccountPage.EMAIL_INPUT,data.get("Email"));

        selectDropDownByText(CreateAccountPage.CLICK_ON_TITLE_DROPDOWN,data.get("title"));

        sendText(CreateAccountPage.FIRST_NAME_INPUT,data.get("firstName"));
        sendText(CreateAccountPage.LAST_NAME_INPUT,data.get("lastName"));

        selectDropDownByValue(CreateAccountPage.GENDER_DROP_DOWN,data.get("gender"));

        selectDropDownByText(CreateAccountPage.MARITAL_STATUS_DROPDOWN,data.get("maritalStatus"));

        sendText(CreateAccountPage.EMPLOYMENT_STATUS_INPUT,data.get("employmentStatus"));
        sendText(CreateAccountPage.DATE_OF_BIRTH_INPUT,data.get("dateOfBirth"));

    }
    @Then("Error message should pup up {string}")
    public void errorMessageShouldPupUp(String existEmail) {
        String existEmailError = getElementText(CreateAccountPage.EXIST_EMAIL_ERROR);
        String actualError = existEmailError.replaceAll("ERROR\n","");
        System.out.println(actualError);
        Assert.assertEquals(actualError,existEmail);
    }


}



