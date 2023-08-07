import core.BasePage;
import main.ContactUsPage;
import main.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsForm extends BasePage {
    @Test
    public void ContactUs(){
        HomePage home = new HomePage(driver);
        home.ContactUs();
        ContactUsPage contact = new ContactUsPage(driver);
        String headline = "GET IN TOUCH";
        Assert.assertEquals(contact.HeadLine(),headline);
        contact.ContactName("Jenish");
        contact.ContactEmail("jenish@test.com");
        contact.ContactSubject("This is a subject");
        contact.Message("This is a message");
        contact.Fileuploads("C:\\Users\\seva\\Desktop\\IMG_4591.jpg");
        contact.Submitbutton();
        driver.switchTo().alert().accept();
        String message = "Success! Your details have been submitted successfully.";
        Assert.assertEquals(contact.SuccessMessage(),message);
    }
}
