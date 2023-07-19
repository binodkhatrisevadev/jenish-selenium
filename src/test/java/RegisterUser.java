import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterUser {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/test_cases");
        driver.findElement(By.xpath("(//ul[@class='nav navbar-nav']/li)[4]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("jenish");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("test@test1.com");
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();

    }
}
