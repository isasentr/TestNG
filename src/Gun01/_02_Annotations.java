package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {
    /*
    @BeforeClass--> Her class çalışıyorken önce burası çalışır.
         @BeforeMetod--> Her class çalışıyorken önce burası çalışır.
                @Test -->Testlerin çalıştığı metodlar
                @Test -->Testlerin çalıştığı metodlar

    @AfterClass--> Her testten/ metodtan sonra burası çalışır.
             @AfterMetod--> Her class çalışıyorken sonra burası çalışır.

     */

    @BeforeClass
    void beforeclass() {
        System.out.println("Her class dan önce çalışacak: Before class");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("Her test method dan önce çalışacak: Before method");
    }

@Test
    void test1() {
        System.out.println("Test 1 çalıştı.");
    }
@Test
    void test2() {
        System.out.println("Test 2 çalıştı.");
    }

@AfterMethod
    void afterMethod() {
        System.out.println("Her test method dan önce çalışacak: After Method");
    }
@AfterClass
    void afterclass() {
        System.out.println("Her class dan sonra çalışacak: After class");
    }
}
