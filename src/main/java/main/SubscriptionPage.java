package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscriptionPage {
    WebDriver driver;
    @FindBy (id = "susbscribe_email") WebElement subemail;
    @FindBy(xpath = "//div[@class='single-widget']/h2") WebElement submsg;
    @FindBy (id = "subscribe") WebElement subbutton;
    @FindBy (id = "success-subscribe") WebElement successmsg;
    public SubscriptionPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public String subsciptionTitle(){return submsg.getText();}
    public void userEmail(String emailid){subemail.sendKeys(emailid);}
    public void subscribebtn(){subbutton.click();}
    public String successMessage(){return successmsg.getText();}
}
