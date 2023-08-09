import core.BasePage;
import main.HomePage;
import main.ProductPage;
import main.SearchedList;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductSearch extends BasePage {
    @Test
    public void searchProduct(){
        HomePage home = new HomePage(driver);
        String title = "Automation Exercise";
        Assert.assertEquals(home.TitleName(),title);
        home.Product();
        ProductPage productpage = new ProductPage(driver);
        String searchproduct = productpage.getProductName();
        productpage.searchField(searchproduct);
        productpage.searchBtnClick();
        SearchedList searchlist = new SearchedList(driver);
        searchlist.searchlist();
    }
}
