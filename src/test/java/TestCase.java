import core.BasePage;
import main.HomePage;
import main.TestCasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase extends BasePage {
    @Test
    public void TestCaseVerification(){
        HomePage home = new HomePage(driver);
        home.Testcase();
        TestCasePage testpage = new TestCasePage(driver);
        String pageheader = "TEST CASES";
        Assert.assertEquals(testpage.TestCaseHeader(),pageheader);
    }
}
