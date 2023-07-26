package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SignUpPage {
WebDriver driver;

@FindBy(id = "id_gender1") WebElement title;
@FindBy(xpath = "//input[@name='title']") List <WebElement> titles;


    public SignUpPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void clicktitle(String titletoclick){
        for (WebElement title: titles) {
            String Value = title.getAttribute("value");
            if(Value.equalsIgnoreCase(titletoclick))
                System.out.println(title.getText());
                title.click();
            break;

        }
    }
   public static WebElement element = null;
    public static WebElement title (WebDriver driver){
       element =  driver.findElement(By.id("id_gender1"));
       return element;
    }
    public static WebElement password (WebDriver driver){
        element = driver.findElement(By.id("password"));
        return element;
    }
//    public static WebElement dob (WebDriver driver){
//        element =
//        Select select = new Select(driver.findElement(By.id("days")));
//        return (WebElement) select;
//    }
     public static WebElement fname (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        return element;
    }
     public static WebElement lname (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        return element;
    }
     public static WebElement company (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        return element;
    }
     public static WebElement address (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        return element;
    }
     public static WebElement state (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        return element;
    }
     public static WebElement city (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        return element;
    }
     public static WebElement zipcode (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        return element;
    }
     public static WebElement mobilenum (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        return element;
    }
     public static WebElement createbutton (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        return element;
    }

}
