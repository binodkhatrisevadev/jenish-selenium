package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCasePage {
    WebDriver driver;
    @FindBy(xpath = "//b[text()=\"Test Cases\"]") WebElement testcase;
    public TestCasePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    public String TestCaseHeader(){return testcase.getText();}
}
