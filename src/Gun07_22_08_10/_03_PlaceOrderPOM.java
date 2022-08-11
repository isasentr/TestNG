package Gun07_22_08_10;

import Utilts.GenelWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_PlaceOrderPOM extends GenelWebDriver {
    // TODO : maximize  olmdan sağlıklı çalışması araştırılacak

    @Test
    void ProceedToCheckout() {
        _03_PlaceOrderElements elements = new _03_PlaceOrderElements(driver);

        elements.searchBox.sendKeys("ipod");
        elements.searchButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.addToCart)).click();
        elements.addToCart.click();
        elements.shoppingCart.click();
        elements.checkOut.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.continue1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.continue2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.continue3)).click();
        elements.agree.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.continue4)).click();
        elements.confirm.click();

        wait.until(ExpectedConditions.urlContains("success"));
        Assert.assertEquals(elements.confirmTxT.getText(), "Your order has been placed!", "Karşılaştırma Sonucu : ");
    }
}
