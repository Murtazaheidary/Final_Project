package bdd_final_project.framework.pages;

import org.openqa.selenium.By;

public class HomePage {
    public static final By HOME_PAGE_TITLE = By.xpath("//h2[@class='chakra-heading css-1at26de']");
    public static final By CREATE_PRIMARY_ACCOUNT_BUTTON_IS_ENABLE = By.xpath("//a[@class='chakra-button css-1jp0m7c']");
    //public static final By CLICK_ON_CREATE_PRIMARY_BUTTON = By.xpath("//a[@class='chakra-button css-1jp0m7c']");
    public static final By CLICK_ON_CREATE_PRIMARY_BUTTON = By.linkText("Create Primary Account");




}
