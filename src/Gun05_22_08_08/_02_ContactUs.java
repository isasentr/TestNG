package Gun05_22_08_08;
/*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra Contact US yazısını doğrulayınız.
 */

import Utilts.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _02_ContactUs extends GenelWebDriver {
    @Test
    @Parameters("mesaj") // xml deki adı
    void contactUs(String gelenMesaj){// metod da ki adı
        driver.findElement(By.linkText("Contact Us")).click();
        driver.findElement(By.id("input-enquiry")).sendKeys(gelenMesaj);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='Submit']")));

        driver.findElement(By.cssSelector("input[value='Submit']")).click();
        Assert.assertTrue(driver.findElement(By.id("content")).getText().contains("Contact Us"));
    }
}
