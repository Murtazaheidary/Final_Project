package bdd_final_project.framework.pages;

import org.openqa.selenium.By;

public class AccountsPage{
    public static final By ROWS_DROPDOWN = By.xpath("//div/div/div[3]/select");
    public static final By DATA_ROWS = By.xpath("//table[contains(@class,'chakra-table')]//tbody/tr");
    public static final By ACCOUNTS_BUTTON = By.linkText("Accounts");
}
