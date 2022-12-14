package Utilts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {
    public static void compareToList(List<String> menuExpectedList, List<WebElement> menuActualList) {

        for (int i = 0; i < menuActualList.size(); i++)
            Assert.assertEquals(menuExpectedList.get(i), menuActualList.get(i).getText(), "Karşılaştırma Sonucu");
    }

    public static void successMessageValidation() {
        Assert.assertTrue(GenelWebDriver.driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']")).getText().contains("success"));

//        Assert.assertEquals(GenelWebDriver. driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText(),"Success: Your newsletter subscription has been successfully updated!");
    }

    public static void Bekle(int saniye) {

        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static double WebElementToDouble(WebElement e) {
        String result = e.getText();
        result = result.replaceAll("[^0-9,a-z,.]", "");
        return Double.parseDouble(result);
    }

    public static int RandomGenerator(int max){

        return (int)(Math.random() * max);  //max 4 ise 0123 olacak
    }
}
