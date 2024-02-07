package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConstantData;

public class DynamicLoginPage extends GenericPage {

    private WebDriver driver;

    public void goToLoginPage(String url){
        this.goTo(url);
    }

    public String getHTMLDOM(){
        String htmlDetails ="";

        driver=ConstantData.getDriver();
        htmlDetails=driver.findElement(By.xpath("//form[@name='login']")).getAttribute("innerHTML");
        //htmlDetails=driver.findElement(By.xpath("//body")).getAttribute("innerHTML");
        return htmlDetails;
    }


}
