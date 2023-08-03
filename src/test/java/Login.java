import core.BasePage;
import main.HomePage;
import main.LoginPage;
import org.testng.annotations.Test;

public class Login extends BasePage{

    @Test
       public void successlogin(){
        HomePage homepage = new HomePage(driver);
        homepage.signupButton();
        LoginPage loginpage = new LoginPage(driver);
        loginpage.EnterEmail("test@test7726751.com");
        loginpage.EnterPassword("ThisIsPassword");
        loginpage.ClickSubmit();
        homepage.signupButton();
    }@Test
       public void unsuccesslogin(){
        HomePage homepage = new HomePage(driver);
        homepage.signupButton();
        LoginPage loginpage = new LoginPage(driver);
        loginpage.EnterEmail("test@test77sdf26751.com");
        loginpage.EnterPassword("ThisIsdfsPassword");
        loginpage.ClickSubmit();
    }
}
