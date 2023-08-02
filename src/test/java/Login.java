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
        loginpage.emailid("test@test7726751.com");
        loginpage.password("ThisIsPassword");
        loginpage.button();
        homepage.signupButton();
    }
}
