import core.BasePage;
import main.HomePage;
import main.SignUpPage;
import main.SignuploginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterUser extends BasePage {
    @Test
    public void NewRegistration(){
        SignUpPage signuppage = new SignUpPage(driver);
        HomePage homepage = new HomePage(driver);
        homepage.signupButton();
        SignuploginPage.name(driver).sendKeys("jenish");
        SignuploginPage.email(driver).sendKeys("test@test77267151.com");
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
    }
    @Test
    public void ExistingUserRegistration (){
        HomePage homepage = new HomePage(driver);
        homepage.signupButton();
        SignuploginPage.name(driver).sendKeys("jenish");
        SignuploginPage.email(driver).sendKeys("test@test77267151.com");
        SignuploginPage.button(driver).click();
        SignuploginPage signuplogin = new SignuploginPage();
        String actualmessage = "Email Address already exist!";
        Assert.assertEquals(signuplogin.ValidationMessage(driver),actualmessage);
    }
}
