package Utilts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParametreliWebDriver {

    public WebDriver driver; // webdirever static idid paralel test yapmak için static kaldırdık. Bitanesinden kaynaklı

    public static WebDriverWait wait;

    @Parameters("browser") // ekleme yapıldı
    @BeforeClass
    public void BaslangicIslemleri(String browser) { // hata verdiği için public ekledik    // ekleme yapıldı
        System.out.println("Driver start...");

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        if(browser.equalsIgnoreCase("chrome")) {
            // burada public static void yazlı idi, bu metodu kullanırken yazmadan direk kullanmak için public ve void sildik. En başta olduğu için bu şkeilde kullanabildik.
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");  // run daki ilk 3 satırı gizliyor.

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");// burada driver ı drivers olarak değiştirdik.
            driver = new ChromeDriver();
            //  driver.manage().window().maximize(); //max
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }


        driver.manage().deleteAllCookies();

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

//     Duration dr= Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); //sadece ana sayfa yüklenirken eb başta
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //bütün webelement için geçerli

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        LoginTest();

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

        WebElement inputemail = driver.findElement(By.id("input-email"));
        inputemail.sendKeys("ali5@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("123456");

        WebElement loginbtn = driver.findElement(By.cssSelector("input[type='submit']"));
        loginbtn.click();

    }
}
