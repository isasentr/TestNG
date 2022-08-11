package Gun08_22_08_11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _01_WishListElements {

    public _01_WishListElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "input-group-btn")
    public
    WebElement searchButton;

    @FindBy(css = "div[class='caption'] a")
    public
    List<WebElement> searchresult;

    @FindBy(css = "button[data-original-title='Add to Wish List']")
    public
    List<WebElement> wishaddlist;

    @FindBy(id = "wishlist-total")
    public
    WebElement wishlist;

    @FindBy(css = "td[class='text-left'] a")
    public List<WebElement> name;

}
