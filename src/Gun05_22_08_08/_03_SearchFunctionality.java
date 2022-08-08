package Gun05_22_08_08;

import Utilts.GenelWebDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

/*
       Senaryo ;
       1- Siteyi açınız.
       2- mac kelimeini göndererek aratınız.
       3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
       4- aynı işlemi samsung için de yapınız
     */
public class _03_SearchFunctionality extends GenelWebDriver {
    @Test
    void researchmac() {
        driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("mac");
        driver.findElement(By.cssSelector("i[class='fa fa-search']")).click();
        Assert.assertTrue(driver.getPageSource().contains("mac"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    void researchsamsusng() {
        driver.findElement(By.cssSelector("input[placeholder='Search']")).clear();
        driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("samsung");
        driver.findElement(By.cssSelector("i[class='fa fa-search']")).click();
        Assert.assertTrue(driver.getPageSource().contains("samsung"));
    }
}
