package stepsDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.GenericPage;
import utils.ConstantData;


public class CucumberHooks {
//    private GenericPage genericPage;
//    public CucumberHooks(GenericPage genericPage) {
//        this.genericPage = genericPage;
//   }

    public WebDriver driver;
    @Before
    public void initDriver() {

        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") +
                    "\\src\\main\\resources\\testDataandProperties\\config.properties");;
            Properties prop = new Properties();
            prop.load(fileInputStream);

            String browser = prop.getProperty("browser");
            if(browser.equalsIgnoreCase("Chrome")){
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            } else if (browser.equalsIgnoreCase("Edge")) {
                driver = new EdgeDriver();
                driver.manage().window().maximize();
            } else if (browser.equalsIgnoreCase("Firefox")) {
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            }

            ConstantData.setDriver(this.driver);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @After
    public void teardown() {
//        System.out.println("Close browser");
//        base.driver.quit();
    }

}
