package bdd_final_project.framework.steps;

import bdd_final_project.framework.pages.PlansPage;
import bdd_final_project.framework.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class PlansStep extends SeleniumUtilities {
    @When("Clicking on Plans")
    public void clickingOnPlans() {
        clickOnElement(PlansPage.PLANS_BUTTON);
    }
    @Then("Four rows should be visible")
    public void fourRowsShouldBeVisible() {
   String actualText = getElementText(PlansPage.ROWS_INFO);
   String rows = actualText.replaceAll("","");
        System.out.println(rows);
       Assert.assertEquals(actualText,rows);
    }
    @Then("Validate Create Date")
    public void validateCreateDate() {
      String createDate = getElementText(PlansPage.CREATE_DATE);
      String date = createDate.replaceAll("","");
      Assert.assertEquals(date,createDate);
        System.out.println("Create Date is: " +createDate);
    }
    @Then("Validate Expire Date")
    public void validateExpireDate() {
     String expireDate = getElementText(PlansPage.DATE_EXPIRE);
     String dateOfExpire = expireDate.replaceAll("","");
     Assert.assertEquals(expireDate,dateOfExpire);
        System.out.println("Expire Date is: " + dateOfExpire);
    }
}
