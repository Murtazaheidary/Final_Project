package bdd_final_project.framework.utility;

import bdd_final_project.framework.base.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class SeleniumUtilities extends BaseSetup {

    private WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    }
    protected WebElement waitForVisibility(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public WebElement findElement(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public List<WebElement> findElements(By locator){
        return this.getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }
    public String getElementText(By locator) {
        WebElement element= waitForVisibility(locator);
        return element.getText();
    }
    public void getElementText(WebElement element) {
        waitUntilPresent(element).getText();

    }
    public boolean isElementEnabled(By locator) {
        return waitForVisibility(locator).isEnabled();
    }
    public void clickOnElement(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void clickOnElement(WebElement element) {
        getWait().until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public void sendText(By locator, String text) {
        waitForVisibility(locator).sendKeys(text);
    }


    public void selectDropDownByValue(By locator, String value){
        WebElement element = getDriver().findElement(locator);
        Select select = new Select(element);
        select.selectByValue(value);
        }

        //Teacher
    public void selectFromDropDown(By locator, int index) {
        WebElement element = waitForVisibility(locator);
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void selectDropDownByIndex(By locator, int index){
        WebElement element = getDriver().findElement(locator);
        Select select = new Select(element);
        select.selectByIndex(index);

    }
    public void selectDropDownByText(By locator, String text){
        WebElement element = getDriver().findElement(locator);
        Select select = new Select(element);
        select.selectByVisibleText(text);

    }
    public WebElement waitUntilPresent(WebElement element){
        return getWait().until(ExpectedConditions.visibilityOf(element));
    }
    public static void waitTime(int wait){
        try{
            Thread.sleep(wait);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
    public boolean isElementDisplayed(By locator) {
        return waitForVisibility(locator).isDisplayed();
    }

    public void printRows(By locator){
        List <WebElement> availableRows = getDriver().findElements(locator);
        System.out.println("Available rows are: "+ availableRows.size());
    }
    public  List<WebElement> getElements(By locator){
        return  getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

    }
}
