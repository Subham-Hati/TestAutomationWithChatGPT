package pages;

import org.openqa.selenium.WebDriver;
import utils.ConstantData;

import java.util.concurrent.TimeUnit;

public class GenericPage {

    public static WebDriver driver;

    public void goTo(String url){
        driver= ConstantData.getDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ConstantData.setDriver(driver);

    }
}
