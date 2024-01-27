package bdd_final_project.framework.pages;

import org.openqa.selenium.By;




public class CreateAccountPage  {
    public static final By PRIMARY_ACCOUNT_TITTLE = By.xpath("//div[@id='root']/div/div[2]//div[contains(@class,'chakra-stack')]/h2");
    public static final By EMAIL_INPUT = By.id("email");
    public static final By CLICK_ON_TITLE_DROPDOWN = By.id("title");
    public static final By FIRST_NAME_INPUT = By.id("firstName");
    public static final By LAST_NAME_INPUT = By.id("lastName");
    public static final By GENDER_DROP_DOWN = By.id("gender");
    public static final By MARITAL_STATUS_DROPDOWN = By.id("maritalStatus");

    public static final By EMPLOYMENT_STATUS_INPUT = By.id("employmentStatus");
    public static final By DATE_OF_BIRTH_INPUT = By.id("dateOfBirth");

   public static final By SUBMIT_CREATE_ACCOUNT = By.xpath("//button[@type='submit']");
   public static final By SIGN_UP_TITLE = By.xpath("//h2[text()='Sign up your account']");

    public static final By EMAIL_OF_CREATE_ACCOUNT_AS_EXPECTED = By.xpath("//div[contains(@class,chakra-stack)]//h2");
    public static final By EXIST_EMAIL_ERROR = By.xpath("//div[@class='chakra-alert banner-error css-1ykemat']");




}
