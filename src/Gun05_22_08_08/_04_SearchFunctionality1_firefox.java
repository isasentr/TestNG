package Gun05_22_08_08;

import Utilts.GenelWebDriver;
import Utilts.ParametreliWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/*
       Senaryo ;
       1- Siteyi açınız.
       2- mac kelimeini göndererek aratınız.
       3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
       4- aynı işlemi samsung için de yapınız
     */
public class _04_SearchFunctionality1_firefox extends ParametreliWebDriver {
    @Test
    @Parameters("aranankelime") // xml deki adı
    void researchmac(String txtsearch) {
        driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys(txtsearch);
        driver.findElement(By.cssSelector("i[class='fa fa-search']")).click();
        List<WebElement> captions = driver.findElements(
                By.cssSelector("[class='product-thumb'] [class='caption'] a"));
        for (WebElement e : captions) {
            Assert.assertTrue(e.getText().toLowerCase().contains(txtsearch));
        }
    }
}
