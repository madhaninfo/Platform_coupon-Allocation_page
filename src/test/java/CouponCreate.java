// import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
// import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test

public class CouponCreate {

    WebDriver driver;
//     System.out.println("invalid username and password");



//     System.out.println("invalid Empty");


    @Test
    public void testGoogleTitle() throws InterruptedException, FileNotFoundException, IOException {
        System.out.println("Login SucessFully...!");
        Thread.sleep(3000);
           ChromeOptions options = new ChromeOptions();
                    System.setProperty("webdriver.chrome.driver", "/home/madhanagopal/Videos/platform/src/test/java/chromedriver-linux64/chromedriver");
                    options.addArguments("--disable-web-security");

                    WebDriver driver = new ChromeDriver(options);
                    Thread.sleep(4000);
     driver.get("https://platform.ea.mezzofy.com/");
        WebElement usernameField = driver.findElement(By.id("username")); // Use the actual id or name attribute of the field
        usernameField.sendKeys("merchant@ea.com");

        // Find the password input field and enter the password
        WebElement passwordField = driver.findElement(By.id("password")); // Use the actual id or name attribute of the field
        passwordField.sendKeys("12345678");
        Thread.sleep(3000);
        WebElement loginButton = driver.findElement(By.id("login-btn")); // Use the actual id or class of the
                                                                         // button
        loginButton.click();
        Thread.sleep(3000);

        WebElement Coupons = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/ul/li[4]/a/span[1]")); // Use
        Coupons.click();
        Thread.sleep(3000);
        WebElement CouponListing = driver.findElement(By.linkText("Coupon Listing")); // Use the
                                                                                                        // actual id or
                                                                                                        // class of the
                                                                                                        // button
            CouponListing.click();
            Thread.sleep(3000);
            // >>>>>>>>>>>>>>>>>>>>>>>> BUTTON HOVER >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement Action = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/ul/li[1]/button/i")));


        Actions actions = new Actions(driver);

        // Perform hover action on the button
        actions.moveToElement(Action).perform();
        Thread.sleep(3000);

            WebElement AddCoupon = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/ul/li[1]/ul/li[1]/a"));
            AddCoupon.click();

            WebElement Radio = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/div[2]/form/div[1]/div[4]/div/div[2]/label/div/span/input"));
            Radio.click();
            WebElement CouponName = driver.findElement(By.id("campaignNames0"));
            CouponName.sendKeys("12345678");
            CouponName.click();
          
            Thread.sleep(3000);
            WebElement CouponDescription = driver.findElement(By.id("campaignDescs0"));
            CouponDescription.sendKeys("12345678");
            CouponDescription.click();
            WebElement CouponStartDate = driver.findElement(By.id("startDate"));
            CouponStartDate.click();
            WebElement CouponDatePicker = driver.findElement(By.xpath("//div[10]/div/table/tbody/tr[2]/td[3]"));
            CouponDatePicker.click();
            WebElement CouponExpiryDate = driver.findElement(By.id("expiryDate"));
            CouponExpiryDate.click();
            WebElement CouponDatePickers = driver.findElement(By.xpath("//div[10]/div/table/thead/tr/th[2]"));
            CouponDatePickers.click();
            
 //button/span
            driver.closes();

        } 
    
}
