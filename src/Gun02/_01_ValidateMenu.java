package Gun02;

import Utilts.GenelWebDriver;
import Utilts.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/*
        Senaryo;
        1- Siteyi açınız
        2- Top Menudeki menu elemanlarının olduğunu doğrulayınız.
     */

public class _01_ValidateMenu extends GenelWebDriver {

    @Test
    void Desktops(){

        List<String> menuExpectedList=new ArrayList<>();
        menuExpectedList.add("Desktops");
        menuExpectedList.add("Laptops & Notebooks");
        menuExpectedList.add("Components");
        menuExpectedList.add("Tablets");
        menuExpectedList.add("Software");
        menuExpectedList.add("Phones & PDAs");
        menuExpectedList.add("Cameras");
        menuExpectedList.add("MP3 Players");

        By menuFinder=By.cssSelector("ul[class='nav navbar-nav']>li");
        List<WebElement>menuActualList=driver.findElements(menuFinder);

        Tools.compareToList(menuExpectedList,menuActualList);

        }
    }
