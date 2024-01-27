package bdd_final_project.framework.steps;

import bdd_final_project.framework.utility.SeleniumUtilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends SeleniumUtilities {
    @Before
    public void beforeScenarios() {
        setupBrowser();
    }

    @After
    public void afterScenarios(Scenario scenario) {
        if (scenario.isFailed()) {

            TakesScreenshot takesScreenshot = (TakesScreenshot) getDriver();
            byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        quitBrowser();
    }
}
