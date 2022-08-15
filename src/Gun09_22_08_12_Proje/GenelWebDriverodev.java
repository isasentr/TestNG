package Gun09_22_08_12_Proje;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenelWebDriverodev {

    public WebDriver driver;

    public static WebDriverWait wait;

    @BeforeClass
    public void BaslangicIslemleri() { // hata verdiği için public ekledik
        System.out.println("Driver start...");

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        // burada public static void yazlı idi, bu metodu kullanırken yazmadan direk kullanmak için public ve void sildik. En başta olduğu için bu şkeilde kullanabildik.
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");  // run daki ilk 3 satırı gizliyor.

        System.setProperty("webdriver.chrome.driver", ".idea/drivers/chromedriver.exe");// burada driver ı drivers olarak değiştirdik.
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //max
        driver.manage().deleteAllCookies();

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

//     Duration dr= Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); //sadece ana sayfa yüklenirken eb başta
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //bütün webelement için geçerli

        driver.get("http://demowebshop.tricentis.com");
//        LoginTest();

    }

    @AfterClass
    public void BitisIslemleri() { // hata verdiği için public ekledik
        System.out.println("Driver stop...");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    void LoginTest() {
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("grup17@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.cssSelector("input[value='Log in']")).click();

    }

}
