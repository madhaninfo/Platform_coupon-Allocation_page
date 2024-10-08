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

public class TestngCouponallocation {

    WebDriver driver;
//     System.out.println("invalid username and password");

    @BeforeMethod
    public void setUp() throws InterruptedException {
        Thread.sleep(3000);

    System.out.println("invalid username and password");
    Thread.sleep(3000);
    ChromeOptions options = new ChromeOptions();
             System.setProperty("webdriver.chrome.driver", "/home/madhanagopal/Videos/platform/src/test/java/chromedriver-linux64/chromedriver");
             options.addArguments("--disable-web-security");

             WebDriver driver = new ChromeDriver(options);

        // Maximize the browser window
        driver.manage().window().maximize();

        driver.get("https://platform.ea.mezzofy.com/");
        WebElement usernameField = driver.findElement(By.id("username")); // Use the actual id or name attribute of the field
        usernameField.sendKeys("merchant@ea.com");

        // Find the password input field and enter the password
        WebElement passwordField = driver.findElement(By.id("password")); // Use the actual id or name attribute of the field
        passwordField.sendKeys("123456789");
        Thread.sleep(3000);
        WebElement loginButton = driver.findElement(By.id("login-btn")); // Use the actual id or class of the
                                                                         // button
        loginButton.click();
        if (driver != null) {
            driver.close();
        }


    }

//     System.out.println("invalid Empty");

    @BeforeSuite
    public void setUps() throws InterruptedException {
    System.out.println("invalid Empty");
    Thread.sleep(3000);
    ChromeOptions options = new ChromeOptions();
             System.setProperty("webdriver.chrome.driver", "/home/madhanagopal/Videos/platform/src/test/java/chromedriver-linux64/chromedriver");
             options.addArguments("--disable-web-security");

             WebDriver driver = new ChromeDriver(options);

        // Maximize the browser window
        driver.manage().window().maximize();

        driver.get("https://platform.ea.mezzofy.com/");
        WebElement usernameField = driver.findElement(By.id("username")); // Use the actual id or name attribute of the field
        usernameField.sendKeys("");

        // Find the password input field and enter the password
        WebElement passwordField = driver.findElement(By.id("password")); // Use the actual id or name attribute of the field
        passwordField.sendKeys("");
        Thread.sleep(3000);
        WebElement loginButton = driver.findElement(By.id("login-btn")); // Use the actual id or class of the
                                                                         // button
        loginButton.click();
        if (driver != null) {
            driver.close();
        }

    }
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

            String csvFile = "/home/madhanagopal/Videos/demo/src/test/java/CSVFile.csv";
        String line;
        String csvSplitBy = ","; // delimiter

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Skip the header line if present
            br.readLine();

            while ((line = br.readLine()) != null) {
                // Use comma as separator
                String[] data = line.split(csvSplitBy);

                // Assuming the CSV has two columns: "username" and "password"
         

                // Example: Use the data to perform login
              
                // Add your assertions or other operations here
        
                Thread.sleep(3000);
                String CouponCodes = data[0];
                List<String> ss = List.of(CouponCodes.toString());
                // String[] couponCodes = {"1020048", "1049255", "1025163", };
                System.out.println("Results page title is: " + ss);

                for (int i = 0; i < ss.size(); i++) {
                                    // Add your assertions or other operations here
                WebElement Coupons = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/ul/li[4]/a/span[1]")); // Use
                // the
                // actual
                // id
                // or
                // class
                // of
                // the
                // button
Coupons.click();
                    WebElement CouponAllocation = driver
                            .findElement(By.xpath("/html/body/div[3]/div[1]/div/ul/li[4]/ul/li[2]/a")); // Use the
                                                                                                        // actual id or
                                                                                                        // class of the
                                                                                                        // button
                    CouponAllocation.click();
                    Thread.sleep(5000); 

                    WebElement couponField = driver.findElement(By.xpath(
                            "/html/body/div[3]/div[2]/div/div[2]/div/form/div/div[2]/div[2]/div/div[2]/div/div/div/label/input"));
                    couponField.click();
                    couponField.click();
                    System.out.println(CouponCodes);
                    couponField.sendKeys(CouponCodes);
                    WebElement applyCouponButton = driver.findElement(By.className("blue"));
                applyCouponButton.click();
                WebElement CouponAllocationView = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/form/div/div[2]/div[3]/table/tbody/tr/td[16]/a\n"));
                CouponAllocationView.click();
                // couponField.clear();
                Thread.sleep(5000); 

                WebElement hoverButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/ul/li[1]/button"));

                // Initialize the Actions class
                Actions actions = new Actions(driver);
        
                // Perform the hover action
                actions.moveToElement(hoverButton).perform();
                Thread.sleep(5000); 
                WebElement AddCouponAllocation = driver.findElement(By.xpath(" /html/body/div[3]/div[2]/div/div[1]/div/ul/li[1]/ul/li[1]/a\n"));
                AddCouponAllocation.click();
                WebElement AllocationQty = driver.findElement(By.id("allocationCount"));
                AllocationQty.click();
        
                // Enter the coupon code
                AllocationQty.sendKeys("100");
                WebElement AllocationQtys = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/div[2]/form/div[2]/div/a\n"));
                AllocationQtys.click();
                Thread.sleep(6000); 

                }

            }
            driver.close();

        } 
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Testing After");

        // Close the browser
        if (driver != null) {
            driver.close();
        }
    }
}
