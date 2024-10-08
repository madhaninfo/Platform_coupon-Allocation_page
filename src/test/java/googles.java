// import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
// import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test

public class googles {

    WebDriver driver;
    // System.out.println("invalid username and password");

    @BeforeMethod
    public void setUp() throws InterruptedException {
        Thread.sleep(3000);

        System.out.println("invalid username and password");
        Thread.sleep(3000);
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver",
                "/home/madhanagopal/Videos/demo/src/test/java/chromedriver-linux64/chromedriver");
        options.addArguments("--disable-web-security");

        WebDriver driver = new ChromeDriver(options);

        // Maximize the browser window
        driver.manage().window().maximize();

        driver.get("https://google.com/");

        // Your testing code goes here

        driver.quit();
    }
}
