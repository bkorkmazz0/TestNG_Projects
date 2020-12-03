package Selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class alert2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.automationtesting.in/Alerts.html");


        driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();

        driver.findElement(By.cssSelector(".btn.btn-danger")).click();

        Thread.sleep(3000);

        driver.switchTo().alert().accept();

        Thread.sleep(3000);



        driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();

        driver.findElement(By.cssSelector(".btn.btn-primary")).click();

        Thread.sleep(3000);

        driver.switchTo().alert().dismiss();

        Thread.sleep(3000);


        driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();

        driver.findElement(By.cssSelector(".btn.btn-info")).click();

        driver.switchTo().alert().sendKeys("Selenium Türkçe");

        Thread.sleep(3000);

        driver.switchTo().alert().accept();

        String message = driver.findElement(By.cssSelector("#demo1")).getText();

        System.out.println(message);

        Assert.assertEquals("Hello Selenium Türkçe How are you today", driver.findElement(By.cssSelector("#demo1")).getText());

        System.out.println("Çalışıyor...");
    }
}