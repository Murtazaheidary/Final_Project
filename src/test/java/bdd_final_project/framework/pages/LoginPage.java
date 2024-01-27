package bdd_final_project.framework.pages;

import org.openqa.selenium.By;

public class LoginPage {
    public static final By LOGIN_BUTTON = By.xpath("//a[contains(text(),'Login')]");
    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By SIGN_IN_BUTTON = By.xpath("//button[@type='submit']");
    public static final By CUSTOMER_SERVICE_PORTAL_PAGE = By.xpath("//h2[contains(text(),'Customer Service Portal')]");
    public static final By USER_ERROR_MESSAGE = By.xpath("//div[@class='chakra-alert banner-error css-1ykemat']");


}
