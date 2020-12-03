package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Random;

public class basicTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Sistem acılıyor--------------");
    }

    @Test(priority = 0,enabled = true)
    public void test1() {

        Random random = new Random();

        int a = random.nextInt(10);
        int b = random.nextInt(10);

        int c = a + b;
        System.out.println("c: " + c);

        Assert.assertTrue(c < 10);
    }

    @Test(priority = 1)
    public void test2() {


        String a = "Berkan";
        String b = "Berkan";

        //Assert.assertEquals(b,a);
        Assert.fail("Assert Fail");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Sistem kapatılıyor.............");
    }
}
