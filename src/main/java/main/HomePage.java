package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[4]") WebElement signupbtn;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[8]") WebElement contactus;
    @FindBy(xpath = "//a[text()=' Test Cases']") WebElement testcasepage;
    @FindBy(xpath = "//a[text()=' Products']") WebElement productlink;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }
    public String TitleName(){return driver.getTitle();}
    public void signupButton(){signupbtn.click();}
    public void ContactUs(){contactus.click();}
    public void Testcase(){testcasepage.click();}
    public void Product(){productlink.click();}
}
