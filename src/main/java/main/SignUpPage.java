package main;

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
@FindBy(id = "password") WebElement password;
@FindBy(id = "days") WebElement days;
@FindBy(id = "months") WebElement months;
@FindBy(id = "years") WebElement year;
@FindBy(id = "first_name") WebElement fname;
@FindBy(id = "last_name") WebElement lname;
@FindBy(id = "company") WebElement company;
@FindBy(id = "address1") WebElement address;
@FindBy(id = "state") WebElement state;
@FindBy(id = "city") WebElement city;
@FindBy(id = "zipcode") WebElement zipcode;
@FindBy(id = "mobile_number") WebElement mobile;
@FindBy(xpath = "//button[@data-qa='create-account']") WebElement submitbtn;

    public SignUpPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void clicktitle(String titletoclick){
        for (WebElement title: titles) {
            String Value = title.getAttribute("value");
            if(Value.equalsIgnoreCase(titletoclick))
                title.click();
            break;

        }
    }
    public void password(String pass){

        password.sendKeys(pass);
    }
    public void days(String day){
        Select select = new Select(days);
        select.selectByValue(day);
    }
    public void month(String month){
        Select select = new Select(months);
        select.selectByValue(month);
    }
    public void years(String years){
        Select select = new Select(year);
        select.selectByValue(years);
    }
    public void fname(String firstname){
        fname.sendKeys(firstname);
    }
  public void lname(String lastname){
        lname.sendKeys(lastname);
    }
  public void company(String companyname){
        company.sendKeys(companyname);
    }
  public void address(String addressname){
        address.sendKeys(addressname);
    }
 public void state(String statename){
        state.sendKeys(statename);
    }
 public void city(String cityname){
        city.sendKeys(cityname);
    }
public void zipcode(String zip){
        zipcode.sendKeys(zip);
    }
public void mobile(String mobilenum){
        mobile.sendKeys(mobilenum);
    }
public void regbtn(){
        submitbtn.click();
    }



}
