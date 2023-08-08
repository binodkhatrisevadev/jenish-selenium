package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    WebDriver driver;
    @FindBy(xpath = "//h2[text()='All Products']") WebElement productlisttitle;
    @FindBy(css ="[href='\\/product_details\\/1']") WebElement productclick;
    public ProductPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    public String ProductListTitle(){return productlisttitle.getText();}
    public void FirstProduct(){productclick.click();}
}
