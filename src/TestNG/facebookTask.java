package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class facebookTask {
    WebDriver driver;

    @DataProvider
    public Object[][] facedata(){

        Object[][] facebookData = new Object[2][2];
        facebookData[0][0] = "berkankorkmazz0@gmail.com";
        facebookData[0][1] = "berkan123";
        facebookData[1][0] = "bkorkmaz18@outlook.com";
        facebookData[1][1] = "berkan123";

        return facebookData;
    }

    @Test(dataProvider = "facedata")
    public void test1(String email, String password) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Selenium/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tr-tr.facebook.com/");

        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);

        Thread.sleep(2000);

        driver.quit();
    }


}
