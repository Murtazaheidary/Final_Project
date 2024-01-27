package bdd_final_project.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseSetup {
    private static WebDriver driver;

    public void setupBrowser() {
        Properties configs = readProperties();

        String browserType = configs.getProperty("browser");
        switch (browserType.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox" :
                driver = new FirefoxDriver();
                break;
            case "edge" :
                driver = new EdgeDriver();
                break;
            default:
                throw new RuntimeException("Wrong browser type failing test");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String url = configs.getProperty("tekInsuranceApp.url");
        driver.get(url);

    }
    private Properties readProperties(){

        String propertyFilePath = System.getProperty("user.dir")
                + "/src/test/resources/configs/dev-env.properties"
                ;

        Properties properties = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream(propertyFilePath);
            properties.load(inputStream);
        }catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Can not read property file");
        }
        return properties;
    }
    public WebDriver getDriver() {
        return driver;
    }

    public void quitBrowser() {
        if (driver != null)
            driver.quit();
    }
}
