package Gun09_22_08_12_Proje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class odev_element {

    public odev_element(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Log in")
    public WebElement Login;

    @FindBy(id = "Email")
    public WebElement Email;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(css = "input[value='Log in']")
    public WebElement loginbutton;

    @FindBy(linkText = "Log out")
    public WebElement logout;

    @FindBy(css = "div[class='validation-summary-errors'] span")
    public WebElement error;

    @FindBy(linkText = "14.1-inch Laptop")
    public WebElement laptop;

    @FindBy(css = "[id^='add-to-cart-button']")
    public WebElement addbutton;

    @FindBy(css = "[class='ico-cart']")
    public WebElement cartbutton;

    @FindBy(id = "termsofservice")
    public WebElement termsofservice;

    @FindBy(id = "checkout")
    public WebElement checkout;

    @FindBy(css = "input[value='Continue']")
    public WebElement Continue;

    @FindBy(id = "PickUpInStore")
    public WebElement PickUpInStore;

    @FindBy(css = "input[onclick='Shipping.save()']")
    public WebElement Shipping;
    @FindBy(css = "input[onclick='PaymentMethod.save()")
    public WebElement PaymentMethod;

    @FindBy(css = "input[onclick='PaymentInfo.save()")
    public WebElement PaymentInfo;

    @FindBy(css = "input[onclick='ConfirmOrder.save()")
    public WebElement ConfirmOrder;

    @FindBy(css = "div[class='title']")
    public WebElement successfully;
}
