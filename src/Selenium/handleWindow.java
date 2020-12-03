package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class handleWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.demo.guru99.com/popup.php");

        //ilk penceremi kaydettim
        String firstWin = driver.getWindowHandle();

        String firstWinUrl = driver.getCurrentUrl();
        System.out.println("Başlangıç pencerem :   " + firstWinUrl);

        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        //        Pencere değişimi için set kullandım.
        Set<String> windowAllWindows = driver.getWindowHandles();

        for (String window : windowAllWindows) {
//                                      windowun parantez içine sıradaki pencereyi yazdım..
            driver.switchTo().window(window);
        }


        Thread.sleep(1300);
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("omer@gmail.com");

        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

        System.out.println("2. pencerenin Url'i =  " + driver.getCurrentUrl());

        //    pencereyi kapatmak için driver.close();
        driver.close();

        driver.switchTo().window(firstWin);

        System.out.println("Şuanki sayfanın Url ' i =   " + driver.getCurrentUrl());


        Thread.sleep(2000);
        //sistemi kapatmak için driver.quit();
        driver.quit();

    }
}