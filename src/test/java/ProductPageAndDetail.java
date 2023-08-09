import core.BasePage;
import main.HomePage;
import main.ProductDetailPage;
import main.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.util.Strings;

public class ProductPageAndDetail extends BasePage {
    @Test
        public void ProductPage(){
        HomePage home = new HomePage(driver);
        String title = "Automation Exercise";
        Assert.assertEquals(home.TitleName(),title);
        home.Product();
        ProductPage productpage = new ProductPage(driver);
        String producttitle = "Automation Exercise - All Products";
        Assert.assertEquals(productpage.ProductTitle(),producttitle);
        String allproducttitle = "ALL PRODUCTS";
        Assert.assertEquals(productpage.ProductListTitle(),allproducttitle);
        productpage.FirstProduct();
        ProductDetailPage productdetail = new ProductDetailPage(driver);
        String productname = productdetail.productName();
        Assert.assertTrue(Strings.isNotNullAndNotEmpty(productname));
        String productcategory = productdetail.productCategory();
        Assert.assertTrue(Strings.isNotNullAndNotEmpty(productcategory));
        String productprice = productdetail.productPrice();
        Assert.assertTrue(Strings.isNotNullAndNotEmpty(productprice));
        String productavailability = productdetail.productAvailability();
        Assert.assertTrue(Strings.isNotNullAndNotEmpty(productavailability));
        String productcondition = productdetail.productCondition();
        Assert.assertTrue(Strings.isNotNullAndNotEmpty(productcondition));
        String productbrand = productdetail.productBrand();
        Assert.assertTrue(Strings.isNotNullAndNotEmpty(productbrand));
    }
}
