package Gun02;

import Utilts.GenelWebDriver;
import Utilts.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utilts.GenelWebDriver.driver;
import static Utilts.GenelWebDriver.wait;

public class _03_EditAccount1 {


    /*
          1- Siteyi açınız.
          2- Edit Account a tıklatınız.
          3- Yeni isim ve soyisim göndererek Continue yapınız.
          4- İşlem sonucunu kontrol ediniz.
          5- Bu işlemi 2 kez çalıştırarak eski haline getiriniz.
         */

    By edit = By.linkText("Edit Account");

    By name = By.id("input-firstname");

    By surname = By.id("input-lastname");

    By contbutton = By.cssSelector("input[type='submit']");

    @Test
    void editAccount() {
        Editaccount("isa","sen");
        Tools.Bekle(2);
//        Editaccount("ali,"");
//
    }
//
    void Editaccount(String name,String surname){
//
//        driver.findElement(edit).click();
//        driver.findElement(name).clear();
//        driver.findElement(name).sendKeys("isa");
//        driver.findElement(surname).clear();
//        driver.findElement(surname).sendKeys("sen");
//        driver.findElement(contbutton).click();
//        Tools.successMessageValidation();

    }
}

