package Gun08_22_08_11;

import Gun07_22_08_10._03_PlaceOrderElements;
import Utilts.GenelWebDriver;
import Utilts.Tools;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Random;

/*
    Senaryo ;
    1- Siteye gidiniz..
   2- "ipod" ürününü aratınız."ipod" u xml den gönderiniz
   3- çıkan elamnlardan random bir elelamnı Add Wish butonuna tıklayınız.
   4- Daha sonra WishList e tıklatınız
   5- Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.
 */

public class _01_WishList extends GenelWebDriver {

@Test
@Parameters("aranankelime") // xml deki adı
    void ProceedToCheckout(String text) {

        _03_PlaceOrderElements poe = new _03_PlaceOrderElements(driver);

        poe.searchBox.sendKeys(text);
        poe.searchButton.click();

        _01_WishListElements wle = new _01_WishListElements(driver);

        int rndNumber= Tools.RandomGenerator(wle.searchresult.size());
        String rndUrunAd=wle.searchresult.get(rndNumber).getText();
        wle.wishaddlist.get(rndNumber).click();

        wle.wishlist.click();

        boolean bulundu=false;
        for (WebElement e : wle.name){
            if (e.getText().equals(rndUrunAd)){
                bulundu=true;
                break;
            }
        }
        System.out.println("bulundu =" + bulundu);
        Assert.assertTrue(bulundu);

    }
}