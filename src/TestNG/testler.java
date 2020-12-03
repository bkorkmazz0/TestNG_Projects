package TestNG;

import org.testng.annotations.Test;

public class testler {

    @Test(groups = "grup1")
    public void test1() {
        System.out.println("TEST1-------------");
    }

    @Test(groups = "grup1")
    public void test2() {
        System.out.println("TEST2-------------");
    }

    @Test(groups = "grup1")
    public void test3() {
        System.out.println("TEST3-------------");
    }

    @Test
    public void test4() {
        System.out.println("TEST4-------------");
    }

    @Test
    public void test5() {
        System.out.println("TEST5-------------");
    }

    @Test
    public void test6() {
        System.out.println("TEST6-------------");
    }
}
