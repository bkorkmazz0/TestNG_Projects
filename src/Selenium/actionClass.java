package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class actionClass {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.etsy.com/");
//        WebElement cookies = driver.findElement(By.cssSelector(".wt-btn.wt-btn--secondary.wt-width-full"));
//        cookies.click();

        driver.findElement(By.xpath("//span[@class='wt-display-inline-block wt-vertical-align-middle']")).click();
        WebElement sprache = driver.findElement(By.xpath("//select[@name='language_code']"));

        Select slc = new Select(sprache);

        slc.selectByVisibleText("Italiano");

        driver.findElement(By.cssSelector("#locale-overlay-save")).click();

        Thread.sleep(3000); //thread koymazsan çalısmıyor.

        Actions action = new Actions(driver);

        List<WebElement> menubars = driver.findElements(By.xpath("//ul[@class='wt-list-unstyled wt-grid__item-xs-12 wt-body-max-width wt-display-flex-xs wt-justify-content-space-between']/li"));

        for (WebElement menubar : menubars) {

            action.moveToElement(menubar).perform();

            Thread.sleep(1000);
        }

        driver.quit();

    }
}