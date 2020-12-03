package TestNG;

import org.testng.annotations.Test;

public class enabled_priority {

    @Test(priority = 1)
    public void a(){
        System.out.println("a");
    }

    @Test(priority = 2)
    public void b(){
        System.out.println("b");
    }

    @Test(priority = 3,enabled = false)
    public void c(){
        System.out.println("c");
    }
}
