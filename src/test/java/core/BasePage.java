package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class BasePage {
   public WebDriver driver;
@BeforeMethod
public void driver(){
  WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        PageFactory.initElements(driver,this);

    }


}
