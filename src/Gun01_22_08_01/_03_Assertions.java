package Gun01_22_08_01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {

    /*
       // Yeşil tik : test de hata yok
    // Sarı çarpi : test de hata var
    // Beyaz  : test çalıştırılmadı.skip


     */
    //
    @Test
    void EqualOrnek() {
        String s1 = "Merhaba"; // oluşan
        String s2 = "İyi Akşamlar";// beklenen


        Assert.assertEquals(s1, s2, "Karşılaştırma sonucu");
//Expected :İyi Akşamlar //Beklenen
        //Actual   :Merhaba //Oluşan
    }


    @Test
    void EqualOrnekdogru() {
        String s1 = "Merhaba"; // oluşan
        String s2 = "İyi Akşamlar";// beklenen


        Assert.assertNotEquals(s1, s2, "Karşılaştırma sonucu");
//Expected :İyi Akşamlar //Beklenen
        //Actual   :Merhaba //Oluşan
    }



    @Test
    void NotEqualOrnek() {
        int s1 = 55;
        int s2 = 555; // oluşan beklenen, hata başlığı

//oluşan , beklenen,hata başlığı
        Assert.assertNotEquals(s1==s2, "Karşılaştırma sonucu");
//Expected :İyi Akşamlar //Beklenen
        //Actual   :Merhaba //Oluşan
    }

    @Test
    void TrueOrnek() {
        int s1 = 55;
        int s2 = 55; // oluşan beklenen, hata başlığı

//oluşan , beklenen,hata başlığı
        Assert.assertTrue(s1==s2, "Karşılaştırma sonucu");
//Expected :İyi Akşamlar //Beklenen
        //Actual   :Merhaba //Oluşan
    }

    @Test
    void nullOrnek(){
        String s1=null;

        Assert.assertNull(s1,"Karşılaştırma sonucu");
    }


    @Test
    void direktfail(){
        int a=55;

        if (a==55){
        Assert.fail();}
    }








}
