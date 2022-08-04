package Gun03_22_08_03;

import Utilts.GenelWebDriver;
import Utilts.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

/*
       Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.
       3- En son eklenen adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En son  adresi siliniz.
 */
public class _02_AddressFunctionality extends GenelWebDriver {

    By adresslink = By.linkText("Address Book");
    By newadress = By.linkText("New Address");
    By name = By.id("input-firstname");
    By surname = By.id("input-lastname");
    By company = By.id("input-company");
    By adress = By.id("input-address-1");
    By city = By.id("input-city");
    By postcode = By.id("input-postcode");
    By country = By.id("input-country");
    By region = By.id("input-zone");
    By defaultadress = By.cssSelector("input[type='radio']");
    By defaultadressno = By.cssSelector("input[value='0']");
    By Continue = By.cssSelector("input[value='Continue']");

    By ediltlink = By.cssSelector("td[class='text-right']>a");


    @Test
    void addressfunc() {
        driver.findElement(adresslink).click();
        driver.findElement(newadress).click();
        driver.findElement(name).sendKeys("sahil");
        driver.findElement(surname).sendKeys("eıg5n");
        driver.findElement(company).sendKeys("aliaba");
        driver.findElement(adress).sendKeys("kazim karabekir");
        driver.findElement(city).sendKeys("esenler");
        driver.findElement(postcode).sendKeys("34225");

        Select countryS = new Select(driver.findElement(country));
        countryS.selectByVisibleText("Turkey");

//        wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("select[id='input-zone']>option"))));
        Select state = new Select(driver.findElement(region));
        state.selectByVisibleText("Kastamonu");
        driver.findElement(defaultadress).click();
        driver.findElement(Continue).click();
        Tools.successMessageValidation();
    }
//
//    @Test(dependsOnMethods = {"addressfunc"})
//    void editfunc() {
//        driver.findElement(ediltlink).click();
//        driver.findElement(name).clear();
//        driver.findElement(name).sendKeys("isa");
//        driver.findElement(surname).clear();
//        driver.findElement(surname).sendKeys("ova");
//        driver.findElement(defaultadressno).isSelected();
//        driver.findElement(Continue).click();
//        Tools.successMessageValidation();
//    }
//    @Test(dependsOnMethods = {"editfunc", "addressfunc"})
//    void deletefunc() {
//
//            By adelete1 = By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[2]/td[2]/a[2]");
//            driver.findElement(adelete1).click();

//        Tools.successMessageValidation();
//    }

    @Test(dependsOnMethods = {"addressfunc"})
    void editadress() {
        WebElement adressbook = driver.findElement(By.linkText("Address Book"));
        adressbook.click();

        List<WebElement> editall = driver.findElements(By.linkText("Edit"));//bütün editleir listeye ekledik
        editall.get(editall.size() - 1).click();//burada en son editi seçtik ve tıkladık
        System.out.println(editall.size());

        driver.findElement(name).clear();
        driver.findElement(name).sendKeys("is56a");
        driver.findElement(surname).clear();
        driver.findElement(surname).sendKeys("ov66a");
        driver.findElement(defaultadressno).isSelected();
        driver.findElement(Continue).click();
        Tools.successMessageValidation();
    }

    @Test(dependsOnMethods = {"addressfunc", "editadress"})
    void deletefuntion() {
        List<WebElement> deleteall = driver.findElements(By.linkText("Delete"));//bütün editleir listeye ekledik
        deleteall.get(deleteall.size() - 2).click();//burada en son editi seçtik ve tıkladık
//kontrol koymak gerekir bazen defaulta denk geliyor.
        Tools.Bekle(5);
        Tools.successMessageValidation();
    }
}
