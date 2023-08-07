package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignuploginPage {
    WebDriver driver;
    @FindBy(xpath = "//input[@placeholder='Name']") WebElement names;
    @FindBy(xpath = "//input[@data-qa='signup-email']") WebElement emailid;
    @FindBy(xpath = "//button[@data-qa='signup-button']") WebElement signupbtn;
    @FindBy(xpath = "//p[text()=\"Email Address already exist!\"]") WebElement validation;
    public SignuploginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void EnterName(String name) {names.sendKeys(name);}
    public void EnterEmail(String email) {emailid.sendKeys(email);}
    public void ButtonClick() {signupbtn.click();}
    public String ValidationMessage(){return validation.getText();}

}
