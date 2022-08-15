package Gun07_22_08_10.data_provider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03_PlaceOrderElements {
    public _03_PlaceOrderElements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "search")
    public WebElement searchBox;

    @FindBy(className = "input-group-btn")
    public WebElement searchButton;

    @FindBy(xpath = "//span[text()='Add to Cart']")
    public WebElement addToCart;
    @FindBy(linkText = "Shopping Cart")
    public WebElement shoppingCart;

    @FindBy(linkText = "Checkout")
    public WebElement checkOut;

    @FindBy(id = "button-payment-address")
    public WebElement continue1;

    @FindBy(id = "button-shipping-address")
    public WebElement continue2;

    @FindBy(id = "button-shipping-method")
    public WebElement continue3;

    @FindBy(name = "agree")
    public WebElement agree;

    @FindBy(id = "button-payment-method")
    public WebElement continue4;

    @FindBy(id = "button-confirm")
    public WebElement confirm;

    @FindBy(css = "[id='content']>h1")
    public WebElement h1;
}
