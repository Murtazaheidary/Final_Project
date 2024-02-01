package bdd_final_project.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.Browser;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseSetup {
    private static WebDriver driver;

    public void setupBrowser() {
        Properties configs = readProperties();
        String browserType = configs.getProperty("browser");
        Boolean headless = Boolean.valueOf(configs.getProperty("headless"));
        switch (browserType.toLowerCase()) {
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                if(headless){
                    options.addArguments("--headless");
                }
                driver = new ChromeDriver(options);
                break;
            case "firefox" :
                FirefoxOptions options1 = new FirefoxOptions();
                if(headless){
                    options1.addArguments("--headless");
                }
                driver = new FirefoxDriver(options1);
                break;
            case "edge" :
                EdgeOptions options2 = new EdgeOptions();
                if(headless){
                    options2.addArguments("--headless");
                }
                driver = new EdgeDriver(options2);
                break;
            default:
                throw new RuntimeException("Wrong browser type, failing test");
        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String url = configs.getProperty("tekInsuranceApp.url");
        driver.get(url);

    }
    private Properties readProperties(){

        String propertyFilePath = System.getProperty("user.dir")
                + "/src/test/resources/configs/dev-env.properties";

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
