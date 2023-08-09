package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchedList {
    WebDriver driver;
    @FindBy (xpath="//div[@class='product-image-wrapper']") List<WebElement> searched;
    public SearchedList(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

        public void searchlist(){
        List<WebElement> tabs = searched;
        for(WebElement j :tabs);
    }
}
