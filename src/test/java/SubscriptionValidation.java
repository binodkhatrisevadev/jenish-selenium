import core.BasePage;
import main.HomePage;
import main.SubscriptionPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubscriptionValidation extends BasePage {
    @Test (priority = 1)
    public void subscriptionMessageVerificationFromFooter(){
        HomePage home = new HomePage(driver);
        String title = "Automation Exercise";
        Assert.assertEquals(home.TitleName(),title);
        SubscriptionPage subpage = new SubscriptionPage(driver);
        String subscriptiontext = "SUBSCRIPTION";
        Assert.assertEquals(subpage.subsciptionTitle(),subscriptiontext);
        subpage.userEmail("Test@test.com");
        subpage.subscribebtn();
        String successmsg = "You have been successfully subscribed!";
        Assert.assertEquals(subpage.successMessage(),successmsg);
    }
    @Test (priority = 2)
    public void subscriptionMessageVerificationFromCart(){
        HomePage home = new HomePage(driver);
        String title = "Automation Exercise";
        Assert.assertEquals(home.TitleName(),title);
        home.cart();
        SubscriptionPage subpage = new SubscriptionPage(driver);
        String subscriptiontext = "SUBSCRIPTION";
        Assert.assertEquals(subpage.subsciptionTitle(),subscriptiontext);
        subpage.userEmail("Test@test.com");
        subpage.subscribebtn();
        String successmsg = "You have been successfully subscribed!";
        Assert.assertEquals(subpage.successMessage(),successmsg);
    }

}
