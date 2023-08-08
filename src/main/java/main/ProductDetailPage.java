package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@class='product-information']/h2") WebElement productname;
    @FindBy(xpath = "//div[@class='product-information']/p[contains(text(),'Category')]") WebElement category;
    @FindBy(xpath = "//div[@class='product-information']/span/span[contains(text(),'Rs')]") WebElement price;
    @FindBy(xpath = "//div[@class='product-information']/p/b[contains(text(),'Availability')]") WebElement availability;
    @FindBy(xpath = "//div[@class='product-information']/p/b[contains(text(),'Condition')]") WebElement condition;
    @FindBy(xpath = "//div[@class='product-information']/p/b[contains(text(),'Brand')]") WebElement brand;
        public ProductDetailPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public String productName(){return productname.getText();}
    public String productCategory(){return category.getText();}
    public String productPrice(){return price.getText();}
    public String productAvailability(){return availability.getText();}
    public String productCondition(){return condition.getText();}
    public String productBrand(){return brand.getText();}
    }

