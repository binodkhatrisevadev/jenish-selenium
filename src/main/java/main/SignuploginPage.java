package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SignuploginPage {
    public static WebElement element = null;
    @FindBy(xpath = "//p[text()=\"Email Address already exist!\"]") WebElement validation;

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
    public String ValidationMessage(WebDriver driver){
        return driver.findElement(By.xpath("//p[text()=\"Email Address already exist!\"]")).getText();
    }
//    public String ValidationMessage(WebDriver driver){
//        return driver.findElement
//    }
}
