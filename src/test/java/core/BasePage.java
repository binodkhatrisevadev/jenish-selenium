package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BasePage {
   public WebDriver driver;
@BeforeSuite
public void initdriver(){
  WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        PageFactory.initElements(driver,this);
    }
    @AfterSuite
    public void closedriver(){
    driver.close();
    }



}
