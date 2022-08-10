package Gun07_22_08_10;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertVsHardAssert {
    @Test
    void hardAssert(){
        String s1="Merhaba";
        System.out.println("Hard assert öncesi");
        Assert.assertEquals(s1, "Merhaba 123", "HardAssert Sonucu");
        System.out.println("Hard assert sonrası"); // hard assert hata verdiğinde sonrası çalışmaz
    }

    @Test
    void softAssert(){
        String strHomePage="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/cartpage";
        String strEditAccount="www.facebook.com/editaccountpage";

        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals("www.facebook.com/homepage",strHomePage); //true
        System.out.println("assert 1");
        softAssert.assertEquals("www.facebook.com/profile",strCartPage); //false
        System.out.println("assert 2");
        softAssert.assertEquals("www.facebook.com/settings",strEditAccount); //false
        System.out.println("assert 3");

        softAssert.assertAll(); // bütün assert sonuçlarının işleme koyuyor
        System.out.println("Aktiflik sonrası");//bu bölüm assertAll sonrası olduğu için ve öncesinde hata oluştuğu için yazdırmadı.
    }

    @Test
    void softAssert1(){
        String strHomePage="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/cartpage";
        String strEditAccount="www.facebook.com/editaccountpage";

        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals("www.facebook.com/homepage",strHomePage); //true
        System.out.println("assert 1");
        softAssert.assertEquals("www.facebook.com/cartpage",strCartPage); //false
        System.out.println("assert 2");
        softAssert.assertEquals("www.facebook.com/editaccountpage",strEditAccount); //false
        System.out.println("assert 3");

        softAssert.assertAll(); // bütün assert sonuçlarının işleme koyuyor
        System.out.println("Aktiflik sonrası");//bu bölüm assertAll sonrası olduğu için ve öncesinde hata oluştuğu için yazdırmadı.
    }
}
