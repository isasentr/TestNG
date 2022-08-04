package Gun04_22_08_04;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _02_Intro {
    @Test
    void test1(){System.out.println("test1");    }
    @Test
    void test2(){System.out.println("test2");    }

    @BeforeTest
    void atest(){System.out.println("a test ");    }
    ////Aynı annotation dan olursa Class isminin alfabetik sırasına göre çalışır

}
