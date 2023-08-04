package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SignuploginPage {
    public static WebElement element = null;
    @FindBy(xpath = "//input[@name='form_type']") WebElement validation;

    public static WebElement name (WebDriver driver){
        element =  driver.findElement(By.xpath("//input[@placeholder='Name']"));
        return element;
    }
    public static WebElement email(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        return element;
    }
    public static WebElement button(WebDriver driver){
        element = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
        return element;
    }
    public String ValidationMessage(){
      validation.getText();
        System.out.println(validation);
        return null;
    }
}
