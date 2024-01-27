package bdd_final_project.framework.pages;

import org.openqa.selenium.By;

public class PlansPage {
    public static final By PLANS_BUTTON = By.linkText("Plans");
    public static final By ROWS_INFO = By.xpath("//table/tbody");
    public static final By CREATE_DATE = By.xpath("//div/table/tbody/tr[1]/td[4]");
    public static final By DATE_EXPIRE = By.xpath("//div/table/tbody/tr[1]/td[5]");
}
