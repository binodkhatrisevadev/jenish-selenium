package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    public static WebElement element = null;

    public static WebElement signupButton(WebDriver driver) {
        element =  driver.findElement(By.xpath("(//ul[@class='nav navbar-nav']/li)[4]"));
        return element;
    }
}
