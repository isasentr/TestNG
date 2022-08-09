package Gun06_22_08_09;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider_Cokboyutlu {

    @Test(dataProvider = "getData")
// parameter yerine dataprovider kullandık. Sürekli veri çekicek.
    void usernameTest(String username, String password) {

        System.out.println("Username=" + username + " ,password=" + password);
    }

    @DataProvider
    public Object[][] getData() {

        Object[][] data = {
                {"Nurhayat", "15222"},
                {"Alper", "15222"},
                {"Uğur", "15222"},
                {"Hakan", "15222"},
                {"isa", "15222"}};


        return data;
    }
}
