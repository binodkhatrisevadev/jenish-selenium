import io.github.bonigarcia.wdm.WebDriverManager;
import main.HomePage;
import main.SignUpPage;
import main.SignuploginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterUser {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        SignUpPage signuppage = new SignUpPage(driver);
        HomePage homepage = new HomePage(driver);
        homepage.signupButton();
        SignuploginPage.name(driver).sendKeys("jenish");
        SignuploginPage.email(driver).sendKeys("test@test7726751.com");
        SignuploginPage.button(driver).click();
        signuppage.clicktitle("Mrs");
        signuppage.password("ThisIsPassword");
        signuppage.days("1");
        signuppage.month("12");
        signuppage.years("1988");
        signuppage.fname("jenish");
        signuppage.lname("mhr");
        signuppage.company("subu.inc");
        signuppage.address("kathmandu");
        signuppage.state("Bagmati");
        signuppage.city("kathmandu");
        signuppage.zipcode("+977");
        signuppage.mobile("1234567890");
        signuppage.company("subu.inc");
        signuppage.regbtn();




        driver.close();
    }
}
