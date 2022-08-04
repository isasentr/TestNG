package Gun01_22_08_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _04_Enable {

    @Test
    void test1() {
        System.out.println("Test 1");
    }

    @Test(enabled = false)
    void test2() {
        System.out.println("Test 2");
    }

    @Test
    void test3() {
        System.out.println("Test 3");
    }

    public static WebDriver driver;

    public static WebDriverWait wait;

    @BeforeClass
    void BaslangicIslemleri() {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        // burada public static void yazlı idi, bu metodu kullanırken yazmadan direk kullanmak için public ve void sildik. En başta olduğu için bu şkeilde kullanabildik.
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");  // run daki ilk 3 satırı gizliyor.

        System.setProperty("webdriver.chrome.driver", ".idea/drivers/chromedriver.exe");// burada driver ı drivers olarak değiştirdik.
        driver = new ChromeDriver();
        //  driver.manage().window().maximize(); //max
        driver.manage().deleteAllCookies();

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

//     Duration dr= Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); //sadece ana sayfa yüklenirken eb başta
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //bütün webelement için geçerli
        System.out.println("Driver start...");
    }

    @AfterClass
    void BitisIslemleri() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
        System.out.println("Driver stop...");
    }
}
