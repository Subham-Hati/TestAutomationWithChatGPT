package utils;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class ConstantData {

    public static HashMap<String,HashMap<String,String>> testCaseDetails=
            new HashMap<String,HashMap<String,String>>();

    public static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }

    public static void setDriver(WebDriver newDriver){
        driver=newDriver;
    }


}
