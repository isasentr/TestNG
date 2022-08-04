package Gun02_22_08_02;

import Utilts.GenelWebDriver;
import Utilts.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class _02_Subscribe extends GenelWebDriver {

    /*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe ve UnSubscribe işlemlerini ayrı ayı testlerde yapınız.
  3- Newsletter  üyelik işlemini, üye ise , üyelikten çıkma, değilse ekleme şeklinde yapınız
 */

    By link = By.partialLinkText("Newsletter");
    By yes = By.cssSelector("input[value='1']");
    By no = By.cssSelector("input[value='0']");
    By submit = By.cssSelector("input[type='submit']");


    @Test(priority = 1)
    void SubscribeYes() {
        wait.until(ExpectedConditions.elementToBeClickable(link));
        driver.findElement(link).click();
        driver.findElement(yes).click();
        driver.findElement(submit).click();
//Assert.assertEquals( driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText(),"Success: Your newsletter subscription has been successfully updated!");
        Tools.successMessageValidation();
    }

    @Test(priority = 2)
    void SubscribeNo() {
        wait.until(ExpectedConditions.elementToBeClickable(link));
        driver.findElement(link).click();
        driver.findElement(no).click();
        driver.findElement(submit).click();

        //Assert.assertEquals( driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText(),"Success: Your newsletter subscription has been successfully updated!");
        Tools.successMessageValidation();
    }

    @Test(priority = 3)
    void checkYesorNo() {
        driver.findElement(link).click();

        if (driver.findElement(yes).isSelected()){
            driver.findElement(no).click();
        } else {
            driver.findElement(yes).click();
        }

        //Alternatif yöntem
//        if (driver.findElement(By.cssSelector("input[value='1']")).getText().contains("1")) {
//            driver.findElement(no).click();
//        } else {
//            driver.findElement(yes).click();
//        }
        driver.findElement(submit).click();
        Tools.successMessageValidation();
    }
}
