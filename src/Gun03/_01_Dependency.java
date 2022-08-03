package Gun03;
//interview de soruluyor.  Testlere öncelikleri neye göre verirsin priority ve dependency ile veririm.
//Nasıl kullanırsın.
// 1-)priority =1 gibi sıralı rakamlar verirerek bununla çalışma sırası veririrm.
// 2-)dependOnMethods : bununla kendinden önce hangi metod çalışması gerekiyor ise onu belirtirim.
// bir metodu direkt çalıştırdığınızda kendinden önce bağımlı 1  metod var ise ototmaitk onları
//      önce çağırıp sonra kendisi çalışır. Fakat 2 veya daha fazla tane var ise bağımlı olduğu metod o zaman çalışamaz.


import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency {

@Test
    void startCar(){
        System.out.println("Car started");
    }

    @Test(dependsOnMethods = {"startCar"})//bu testin çalışması, startCar ın hatasız çalışmasına bağlı
    void driveCar(){
        System.out.println("Car is droven");
//        Assert.fail(); // burada fail yaparak skip (atlama) yaptık. görmek için
    }

    @Test(dependsOnMethods = {"startCar","driveCar"}) // bu testin çalışması için verilen 2 testin hatasız çalışması lazım
    void parkCar(){
        System.out.println("Car parked");
    }

    @Test(dependsOnMethods = {"parkCar"},alwaysRun = true)// alwaysRun=true bağımlılıkları var ama hata çıkarsa da yine çalıştırır.
    void stopcar(){
        System.out.println("Car stop");
    }

}
