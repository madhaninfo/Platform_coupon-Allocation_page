// import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// import org.testng.Assert;

import org.testng.annotations.Test;


@Test

public class CouponCreate {

    WebDriver driver;
    // System.out.println("invalid username and password");

    // System.out.println("invalid Empty");

    @Test
    public void testGoogleTitle() throws InterruptedException {
        System.out.println("Login SucessFully...!");
        Thread.sleep(3000);
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver",
                "/home/madhanagopal/Videos/platform/src/test/java/chromedriver-linux64/chromedriver");
        options.addArguments("--disable-web-security");

        WebDriver driver = new ChromeDriver(options);

        Thread.sleep(4000);
        driver.get("https://platform.ea.mezzofy.com/");
        driver.manage().window().maximize();


        WebElement usernameField = driver.findElement(By.id("username")); // Use the actual id or name attribute of the
                                                                          // field
        usernameField.sendKeys("merchant@ea.com");

        // Find the password input field and enter the password
        WebElement passwordField = driver.findElement(By.id("password")); // Use the actual id or name attribute of the
                                                                          // field
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
        System.out.println("Coupon Listing Page"); // actual id or
        // class of the
        // button
        CouponListing.click();
        Thread.sleep(3000);
        // >>>>>>>>>>>>>>>>>>>>>>>> BUTTON HOVER
        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement Action = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/ul/li[1]/button/i")));

        Actions actions = new Actions(driver);

        // Perform hover action on the button
        actions.moveToElement(Action).perform();
        // Initialize the Actions class
        // Simulate the PAGE DOWN key to scroll down the page
        Thread.sleep(3000);

        WebElement AddCoupon = driver
                .findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/ul/li[1]/ul/li[1]/a"));
        AddCoupon.click();

        WebElement Radio = driver.findElement(By.xpath(
                "/html/body/div[3]/div[2]/div/div[2]/div/div/div[2]/form/div[1]/div[4]/div/div[2]/label/div/span/input"));
        Radio.click();
        WebElement CouponName = driver.findElement(By.id("campaignNames0"));
        CouponName.sendKeys("OCTOBER 09 2024 Charge Coupon Test");
        CouponName.click();
        System.out.println("CouponName");
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(3000);
        WebElement CouponDescription = driver.findElement(By.id("campaignDescs0"));
        CouponDescription.sendKeys("12345678");
        CouponDescription.click();
        Thread.sleep(5000);
        System.out.println("CouponDescription");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(4000);

        WebElement CouponSellingPrice = driver.findElement(By.id("sellingPrice"));
        CouponSellingPrice.sendKeys("200");
        CouponSellingPrice.click();
        System.out.println("CouponSellingPrice");
        Thread.sleep(4000);

        WebElement orginalPrice = driver.findElement(By.id("orginalPrice"));
        orginalPrice.sendKeys("200");
        orginalPrice.click();
        System.out.println("orginalPrice");
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        // WebElement bodyElement =
        // driver.findElement(By.cssSelector("body.cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders"));
        WebElement iframeElement = driver.findElement(By.xpath(
                "/html/body/div[3]/div[2]/div/div[2]/div/div/div[2]/form/div[1]/div[16]/div/div/div/div[1]/div/div/div/iframe"));
        driver.switchTo().frame(iframeElement);

        WebElement bodyElement = driver.findElement(By.tagName("body"));
        bodyElement.clear(); // Clear any existing text if necessary
        bodyElement.sendKeys("This is the new text for the rich text editor!");

        driver.switchTo().defaultContent();

        Thread.sleep(4000);

        System.out.println("Start Date And Expiry Date ");
        WebElement CouponStartDate = driver.findElement(By.id("startDate"));
        CouponStartDate.sendKeys("10/10/2024");

        CouponStartDate.click();

        WebElement CouponExpiryDate = driver.findElement(By.id("expiryDate"));
        CouponExpiryDate.sendKeys("10/10/2025");

        CouponExpiryDate.click();
        Thread.sleep(4000);

        WebElement allocationCount = driver.findElement(By.id("allocationCount"));
        allocationCount.sendKeys("20");

        allocationCount.click();
        System.out.println("Clicked Select Button");
        WebElement Select = driver.findElement(By.xpath("//a[contains(text(),'Select')]"));

        Select.click();
        WebElement issuebtn = driver.findElement(By.id("issuebtn"));

        issuebtn.click();
        WebElement redeembtn = driver.findElement(By.id("redeembtn"));

        redeembtn.click();
        Thread.sleep(4000);

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        WebElement linkText = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/div[2]/form/div[2]/div/button"));

        linkText.click();
        Thread.sleep(4000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(10000);

        
        WebElement Add = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/div[2]/form/div[2]/div[1]/a"));
System.out.println("Add Button Clicked");
        Add.click();
        System.out.println("Coupon Created .....!");
        Thread.sleep(10000);


        // button/span
        driver.close();

    }

}
