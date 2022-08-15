package Gun07_22_08_10.data_provider;
/*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/

import Utilts.GenelWebDriver;
import Utilts.ParametreliWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _04_PlaceOrderPOM extends GenelWebDriver {


    @Test(dataProvider="dataget")
    void deneme(String test1) {

        _03_PlaceOrderElements klm = new _03_PlaceOrderElements(driver);

        klm.searchBox.sendKeys(test1);

        klm.searchButton.click();

        klm.addToCart.click();

        klm.shoppingCart.click();

        klm.checkOut.click();

        wait.until(ExpectedConditions.elementToBeClickable(klm.continue1));
        klm.continue1.click();

        wait.until(ExpectedConditions.elementToBeClickable(klm.continue2));
        klm.continue2.click();

        wait.until(ExpectedConditions.elementToBeClickable(klm.continue3));
        klm.continue3.click();

        wait.until(ExpectedConditions.elementToBeClickable(klm.agree));
        klm.agree.click();

        wait.until(ExpectedConditions.elementToBeClickable(klm.continue4));
        klm.continue4.click();

        wait.until(ExpectedConditions.elementToBeClickable(klm.confirm));
        klm.confirm.click();

        wait.until(ExpectedConditions.urlContains("success"));

        wait.until(ExpectedConditions.elementToBeClickable( klm.h1));

        Assert.assertEquals(klm.h1.getText(), "Your order has been placed!", "Karşılaştırma Sonucu : ");
    }

@DataProvider
    public Object[] dataget(){

        Object test[]={"ipod","samsung"};

        return test;
    }
}
