package Gun04_22_08_04;

import org.testng.annotations.*;

public class _03_Intro {
    /*

        @BeforeSuite
            @BeforeTest
                @BeforeGroups
                    @BeforeClass
                        @BeforeMethod
                            @Test
                            @Test
                       @AfterMethod
                    @AfterClass
                 @AfterGroup
              @AfterTest
            @AfterSuit
    */
    @BeforeSuite
    void BeforeSuite(){System.out.println("Before suite");    }
    @BeforeTest
    void BeforeTest(){System.out.println("b test");    }
    @BeforeGroups
    void BeforeGroups(){System.out.println("Before group");    }
    @BeforeClass
    void BeforeClass(){System.out.println("Before class");    }
    @BeforeMethod
    void BeforeMethod(){System.out.println("Before method");    }
    @Test
    void test1(){System.out.println("test1");    }
    @Test
    void test2(){System.out.println("test2");    }
    @AfterSuite
    void AfterSuite(){System.out.println("After suite");    }
    @AfterTest
    void AfterTest(){System.out.println("After test");    }
    @AfterGroups
    void AfterGroups(){System.out.println("After group");    }
    @AfterClass
    void AfterClass(){System.out.println("After class");    }
    @AfterMethod
    void AfterMethod(){System.out.println("After method");    }
}
