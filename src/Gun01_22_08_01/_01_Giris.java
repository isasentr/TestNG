package Gun01_22_08_01;

import org.testng.annotations.Test;

//    public static void main(String[] args) {
//        webSitesiniAc();
//        LoginTestIsleminiYap();
//        driverıKapat();
//    }

// Eğer test metodlarına sıralama verilmezse alfabetik sırasına göre çalışır.

public class _01_Giris {
    @Test(priority = 1) // annotation tanımlama ~not
    void webSitesiniAc() {
        System.out.println("Driver tanımlandı ve web sitesini açıldı.");
    }

    @Test(priority = 2) // priority: öncelik sırası
    void loginTestIsleminiYap() {
        System.out.println("Login test işlemleri yapıldı.");
        //yeşil tık hatalı assertion yok demektir.
    }

    @Test(priority = 3)
    void driveriKapat() {
        System.out.println("Driver kapatıldı ve çıkıldı.");
    }
}
