package Gun02;

import Utilts.GenelWebDriver;
import Utilts.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
      1- Siteyi açınız.
      2- Edit Account a tıklatınız.
      3- Yeni isim ve soyisim göndererek Continue yapınız.
      4- İşlem sonucunu kontrol ediniz.
      5- Bu işlemi 2 kez çalıştırarak eski haline getiriniz.
     */
public class _03_EditAccount extends GenelWebDriver {
    By edit = By.cssSelector("div[class='list-group']>:nth-child(2)");

    By name=By.id("input-firstname");

    By surname=By.id("input-lastname");

    By contbutton = By.cssSelector("input[type='submit']");

    @Test
    void editAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(edit));
        driver.findElement(edit).click();
        driver.findElement(name).clear();
        driver.findElement(name).sendKeys("ali");
        driver.findElement(surname).clear();
        driver.findElement(surname).sendKeys("kemal");
        driver.findElement(contbutton).click();
        Tools.successMessageValidation();

        wait.until(ExpectedConditions.elementToBeClickable(edit));
        driver.findElement(edit).click();
        driver.findElement(name).clear();
        driver.findElement(name).sendKeys("isa");
        driver.findElement(surname).clear();
        driver.findElement(surname).sendKeys("sen");
        driver.findElement(contbutton).click();
        Tools.successMessageValidation();
    }
}
