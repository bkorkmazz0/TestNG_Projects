package TestNG;

import org.testng.annotations.*;

public class MethodlarVeHiyerarsi {



    @BeforeTest
    public void beforeTest(){
        System.out.println("BEFORETEST-----------------------------------");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BEFORECLASS-----------------------------------");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BEFOREMETHOD-----------------------------------");
    }

    @Test
    public void test1(){
        System.out.println("TEST1-------------------------------------------");
    }

    @Test
    public void test2(){
        System.out.println("TEST2-------------------------------------------");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AFTERMETHOD-------------------------------------");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AFTERCLASS---------------------------------------");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AFTERTEST-----------------------------------------");
    }

    @AfterSuite
    public void  afterSuite(){
        System.out.println("AFTERSUITE----------------------------------------");
    }

}
