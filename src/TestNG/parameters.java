package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class parameters {
    WebDriver driver;
    WebDriverWait wait;

    @Test
    @Parameters({"firstname","lastname","email","telephone","password"})
    public void test1(String firstname, String lastname, String email, String telephone, String password) {
        System.setProperty("webdriver.chrome.driver", "C:/Selenium/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");

        driver.findElement(By.cssSelector("#input-firstname")).sendKeys(firstname);

        driver.findElement(By.cssSelector("#input-lastname")).sendKeys(lastname);

        driver.findElement(By.cssSelector("#input-email")).sendKeys(email);

        driver.findElement(By.cssSelector("#input-telephone")).sendKeys(telephone);

        driver.findElement(By.cssSelector("#input-password")).sendKeys(password);

        driver.findElement(By.cssSelector("#input-confirm")).sendKeys(password);
    }

}
