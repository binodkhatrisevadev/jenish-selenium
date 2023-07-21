import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterUser {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/test_cases");
        driver.findElement(By.xpath("(//ul[@class='nav navbar-nav']/li)[4]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("jenish");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("test@test7721.com");
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("password")).sendKeys("123testing");
        Select select = new Select(driver.findElement(By.id("days")));
        select.selectByValue("1");
        Select month = new Select(driver.findElement(By.id("months")));
        month.selectByValue("12");
        Select year = new Select(driver.findElement(By.id("years")));
        year.selectByValue("1988");
        driver.findElement(By.id("first_name")).sendKeys("Jenish");
        driver.findElement(By.id("last_name")).sendKeys("Maharjan");
        driver.findElement(By.id("company")).sendKeys("Subu");
        driver.findElement(By.id("address1")).sendKeys("Kirtipur");
        driver.findElement(By.id("state")).sendKeys("Kathmandu");
        driver.findElement(By.id("city")).sendKeys("Kirtipur");
        driver.findElement(By.id("zipcode")).sendKeys("+977");
        driver.findElement(By.id("mobile_number")).sendKeys("9083112222");
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();




    }
}
