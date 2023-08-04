package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignuploginPage {
    public static WebElement element = null;

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
}
