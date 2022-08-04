package Gun01_22_08_01;
/*
   Senaryo ;
     1- http://opencart.abstracta.us/index.php?route=account/login  sitesini açınız.
     2- asd@gmail.com  ve 123qweasd   bilgileri ile login olan test metodunu yazınız.
     3- Login olup olmadığınızı assert ile kontrol ediniz.

 üyelik
  ali
mehmet
ali5@gmail.com
+90 123 456 78 90
123456
 */

import Utilts.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _05_Ornek extends GenelWebDriver {
    @Test
    void LoginTest(){

        WebElement inputemail= driver.findElement(By.id("input-email"));
        inputemail.sendKeys("ali5@gmail.com");

        WebElement password= driver.findElement(By.id("input-password"));
        password.sendKeys("123456");

        WebElement loginbtn=driver.findElement(By.cssSelector("input[type='submit']"));
        loginbtn.click();

//        WebElement test1= driver.findElement(By.className("fa fa-exclamation-circle"));
//        Assert.assertTrue(driver.getPageSource().contains(" Warning: No match for E-Mail Address and/or Password."));
    }

}