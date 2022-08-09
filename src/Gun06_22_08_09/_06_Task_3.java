package Gun06_22_08_09;

/*
   Senaryo
   1- Siteye gidiniz
   2- Specials tiklayiniz
   3- Cikan urun sayisi ile indirimli urun sayisi ayni mi dogrulayiniz
   4- Yukarıdaki işlemden sonra her ürünün önceki fiyatının şu andaki fiyattan
      yüksek olduğunu doğrulayınız.
*/

import Utilts.GenelWebDriver;
import Utilts.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _06_Task_3 extends GenelWebDriver {

    @Test
    void Specials() {

        driver.findElement(By.linkText("Specials")).click();

        List<WebElement> new1 = driver.findElements(By.className("price-new"));
        List<WebElement> product = driver.findElements(By.className("product-thumb"));
        List<WebElement> old1 = driver.findElements(By.className("price-old"));

        System.out.println("product=" + product.size() + ",old1=" + old1.size());
        Assert.assertEquals(product.size(), old1.size());

        for (int i = 0; i < new1.size(); i++) {
            System.out.println("new1.get(i)=" + new1.get(i).getText() + ",old1.get(i)" + old1.get(i).getText());
            Assert.assertTrue(Tools.WebElementToDouble(new1.get(i)) < Tools.WebElementToDouble(old1.get(i)));
        }
    }
}
