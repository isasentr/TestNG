package Utilts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {
    public static void compareToList(List<String>menuExpectedList, List<WebElement>menuActualList){

        for (int i = 0; i < menuActualList.size(); i++)
            Assert.assertEquals(menuExpectedList.get(i), menuActualList.get(i).getText(),"Karşılaştırma Sonucu");
    }

    public static void successMessageValidation(){
        Assert.assertTrue(GenelWebDriver. driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']")).getText().contains("Success"));

//        Assert.assertEquals(GenelWebDriver. driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText(),"Success: Your newsletter subscription has been successfully updated!");
    }

}
