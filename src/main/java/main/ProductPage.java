package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage {
    WebDriver driver;
    @FindBy(xpath = "//h2[text()='All Products']") WebElement productlisttitle;
    @FindBy(css ="[href='\\/product_details\\/1']") WebElement productclick;
    @FindBy(css =".features_items [class='col-sm-4']:nth-child(3) .text-center p") WebElement productname;
    @FindBy(id = "search_product") WebElement searchproduct;
    @FindBy(id = "submit_search") WebElement submitsearch;


    public ProductPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    public String ProductTitle(){return driver.getTitle();}
    public String ProductListTitle(){return productlisttitle.getText();}
    public void FirstProduct(){productclick.click();}
    public String getProductName(){return productname.getText();}
    public void searchField(String sendproduct){searchproduct.sendKeys(sendproduct);}
    public void searchBtnClick(){submitsearch.click();}

}
