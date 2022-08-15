package Gun09_22_08_12_Proje;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class odev extends GenelWebDriverodev {

   @Test(priority = 1)
    void login() {
       odev_element logintest = new odev_element(driver);

       logintest.Login.click();
       logintest.Email.sendKeys("grup17@gmail.com");
       logintest.password.sendKeys("123456");
       logintest.loginbutton.click();

       Assert.assertEquals("Log out", logintest.logout.getText());
       logintest.logout.click();

   }

    @Test(priority = 2)
    void loginNot() {

        odev_element logintest = new odev_element(driver);

        logintest.Login.click();
        logintest.Email.sendKeys("grup178@gmail.com");
        logintest.password.sendKeys("123456");
        logintest.loginbutton.click();

        Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.", logintest.error.getText());
    }

    @Test(priority = 3)
    void login_pickup() {
        odev_element logintest = new odev_element(driver);

        logintest.Login.click();
        logintest.Email.sendKeys("grup17@gmail.com");
        logintest.password.sendKeys("123456");
        logintest.loginbutton.click();

        logintest.laptop.click();
        logintest.addbutton.click();
        logintest.cartbutton.click();
        logintest.termsofservice.click();
        logintest.checkout.click();
        logintest.Continue.click();
        logintest.PickUpInStore.click();

        wait.until(ExpectedConditions.elementToBeClickable( logintest.Shipping));
        logintest.Shipping.click();

        wait.until(ExpectedConditions.elementToBeClickable(logintest.PaymentMethod));
        logintest.PaymentMethod.click();

        wait.until(ExpectedConditions.elementToBeClickable(logintest.PaymentInfo));
        logintest.PaymentInfo.click();

        wait.until(ExpectedConditions.elementToBeClickable(logintest.ConfirmOrder));
        logintest.ConfirmOrder.click();

        Assert.assertTrue(logintest.successfully.getText().contains("successfully"));

    }









        /*
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log out")));
        Assert.assertEquals("Log out", driver.findElement(By.linkText("Log out")).getText());
        driver.findElement(By.linkText("Log out")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log in")));
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("grup177@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.cssSelector("input[value='Log in']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("div[class='validation-summary-errors']>span")).getText().contains("unsuccessful"));
        driver.findElement(By.cssSelector("img[alt='Tricentis Demo Web Shop']")).click();
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("grup17@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123456");

        driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
        driver.findElement(By.linkText("14.1-inch Laptop")).click();
        driver.findElement(By.cssSelector("[id^='add-to-cart-button']")).click();
        driver.findElement(By.cssSelector("[class='ico-cart']")).click();
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        driver.findElement(By.id("PickUpInStore")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[onclick='Shipping.save()']")));
        driver.findElement(By.cssSelector("input[onclick='Shipping.save()']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[onclick='PaymentMethod.save()")));
        driver.findElement(By.cssSelector("input[onclick='PaymentMethod.save()")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[onclick='PaymentInfo.save()")));
        driver.findElement(By.cssSelector("input[onclick='PaymentInfo.save()']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[onclick='ConfirmOrder.save()")));
        driver.findElement(By.cssSelector("input[onclick='ConfirmOrder.save()']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='title']")));
        Assert.assertTrue(driver.findElement(By.cssSelector("div[class='title']")).getText().contains("successfully"));
        */

    }

