package Gun06_22_08_09;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_DataProvider_Iterator {

    @Test(dataProvider = "getData")
    void usernameTest(String username) {
        System.out.print("\nUsername=" + username);
    }

    @DataProvider
    public Iterator<Object> getData() {

        List<Object> data = new ArrayList<>();
        data.add("isa");
        data.add("Nurhayat");
        data.add("Alper");
        data.add("uğur");

        return data.iterator();

    }


/*******************************************************/


    @Test(dataProvider = "getData2")
    void usernameTest2(String username,String password) {
        System.out.println("Username=" + username + " ,password=" + password);
    }

    @DataProvider
    public Iterator<Object[]> getData2() {

        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"isa","1236544"});
        data.add(new Object[]{"ali","12544"});
        data.add(new Object[]{"veli","123644"});
        data.add(new Object[]{"kazım","36544"});

        return data.iterator();
    }

}
