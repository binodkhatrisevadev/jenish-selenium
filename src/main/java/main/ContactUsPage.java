package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
    WebDriver driver;
@FindBy(xpath = "//h2[text()='Get In Touch']") WebElement headlinetext;
@FindBy(xpath = "//input[@data-qa=\"name\"]") WebElement name;
@FindBy(xpath = "//input[@data-qa=\"email\"]") WebElement email;
@FindBy(xpath = "//input[@data-qa=\"subject\"]")WebElement subject;
@FindBy(xpath = "//textarea[@data-qa=\"message\"]") WebElement message;
@FindBy(xpath = "//input[@type=\"file\"]")WebElement fileupload;
@FindBy(xpath = "//input[@type=\"submit\"]")WebElement submitbtn;
@FindBy(xpath = "/html//div[@id='contact-page']//div[.='Success! Your details have been submitted successfully.']")WebElement success;
    public ContactUsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
public String HeadLine(){
    return headlinetext.getText();
}
public void ContactName(String inputname){name.sendKeys(inputname);}
public void ContactEmail(String emailid){email.sendKeys(emailid);}
public void ContactSubject(String subjects){subject.sendKeys(subjects);}
public void Message(String messages){message.sendKeys(messages);}
public void Fileuploads(String upload){fileupload.sendKeys(upload);}
public void Submitbutton(){submitbtn.click();}
public String SuccessMessage(){return success.getText();}
}
