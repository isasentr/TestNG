package Gun06_22_08_09;

import Utilts.ParametreliWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Daha önceki derslerde yaptğımı Search fonksiyonunu
 * Mac,ipod ve samsung için Dataprovider ile yapınız.
 */
public class _05_Task_xml extends ParametreliWebDriver {
    @Test(dataProvider = "getData")
    void searchlist(String txtsearch) {
        driver.findElement(By.cssSelector("input[placeholder='Search']")).clear();
        driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys(txtsearch);

        driver.findElement(By.cssSelector("i[class='fa fa-search']")).click();
        List<WebElement> captions = driver.findElements(
                By.cssSelector("[class='product-thumb'] [class='caption'] a"));
        for (WebElement e : captions) {
            Assert.assertTrue(e.getText().toLowerCase().contains(txtsearch));
        }
    }
    @DataProvider
    public Object[] getData() {
        Object[] data = {"mac", "ipod", "samsung"};

        return data;
    }
}
