package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    WebDriver driver;
    @FindBy(xpath = "//input[@data-qa='login-email']")WebElement emailadd;
    @FindBy(xpath = "//input[@data-qa='login-password']") WebElement password;
    @FindBy(xpath = "//button[@data-qa='login-button']") WebElement submit;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    public void emailid(String email){
        emailadd.sendKeys(email);
    }
    public void password(String pass){
        password.sendKeys(pass);
    }
    public void button(){
        submit.click();
    }
}
