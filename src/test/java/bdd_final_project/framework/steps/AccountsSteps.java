package bdd_final_project.framework.steps;

import bdd_final_project.framework.pages.AccountsPage;
import bdd_final_project.framework.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;


public class AccountsSteps extends SeleniumUtilities {
    @When("Clicking on Accounts")
    public void clickingOnAccounts() {
        clickOnElement(AccountsPage.ACCOUNTS_BUTTON);
    }

   @When("{string} data rows are default")
   public void fiveDataRowsAreDefault(String defaultRows) {
       selectDropDownByText(AccountsPage.ROWS_DROPDOWN,"Show " + defaultRows);
    }

   @Then("{int} data rows must display")
   public void dataShouldDisplayAsExpected(int expectedRows) {
       List<WebElement> tableRows = getElements(AccountsPage.DATA_ROWS);
       Assert.assertEquals("Available data rows ", tableRows.size(), expectedRows);
       System.out.println(tableRows.size());
   }

    @When("change Data to {string} rows per page")
    public void changeDataPerDisplay(String dataRows) {
        selectDropDownByText(AccountsPage.ROWS_DROPDOWN,"Show " + dataRows);
    }

    @When("Page row is {string} data should be same as rows")
    public void changePageRows(String PageRows) {
        selectDropDownByText(AccountsPage.ROWS_DROPDOWN,PageRows);
        waitTime(1000);
        printRows(AccountsPage.DATA_ROWS);
    }

}
