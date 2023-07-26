import io.github.bonigarcia.wdm.WebDriverManager;
import main.HomePage;
import main.SignUpPage;
import main.SignuploginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterUser {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        SignUpPage signuppage = new SignUpPage(driver);
        HomePage.signupButton(driver).click();
        SignuploginPage.name(driver).sendKeys("jenish");
        SignuploginPage.email(driver).sendKeys("test@test772651.com");
        SignuploginPage.button(driver).click();
        signuppage.clicktitle("mrs");

//        SignUpPage.password(driver).sendKeys("123testing");
//        SignUpPage.dob(driver).
//        Select select = new Select(driver.findElement(By.id("days")));
//        select.selectByValue("1");
//        Select month = new Select(driver.findElement(By.id("months")));
//        month.selectByValue("12");
//        Select year = new Select(driver.findElement(By.id("years")));
//        year.selectByValue("1988");
//        driver.findElement(By.id("first_name")).sendKeys("Jenish");
//        driver.findElement(By.id("last_name")).sendKeys("Maharjan");
//        driver.findElement(By.id("company")).sendKeys("Subu");
//        driver.findElement(By.id("address1")).sendKeys("Kirtipur");
//        driver.findElement(By.id("state")).sendKeys("Kathmandu");
//        driver.findElement(By.id("city")).sendKeys("Kirtipur");
//        driver.findElement(By.id("zipcode")).sendKeys("+977");
//        driver.findElement(By.id("mobile_number")).sendKeys("9083112222");
//        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
        driver.close();
    }
}
