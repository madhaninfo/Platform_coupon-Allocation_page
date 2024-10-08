import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CouponAllocationPage {

    public static void main(String[] args) {
        // Automatically manage ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to Google
            driver.get("https://platform.ea.mezzofy.com/");

                        // Find the username input field and enter the username
                        WebElement usernameField = driver.findElement(By.id("username")); // Use the actual id or name attribute of the field
                        usernameField.sendKeys("merchant@ea.com");
            
                        // Find the password input field and enter the password
                        WebElement passwordField = driver.findElement(By.id("password")); // Use the actual id or name attribute of the field
                        passwordField.sendKeys("12345678");

            // Print the title of the page
            System.out.println("Page title is: " + driver.getTitle());

            // Find the search box element by its name attribute and type a query
            // WebElement searchBox = driver.findElement(By.name("q"));
            // searchBox.sendKeys("Selenium WebDriver");

            // Submit the search form
            // searchBox.submit();


            // Wait for the results page to load and display the results
            Thread.sleep(3000); 
            WebElement loginButton = driver.findElement(By.id("login-btn")); // Use the actual id or class of the button
            loginButton.click();

            WebElement Coupons = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/ul/li[4]/a/span[1]")); // Use the actual id or class of the button
            Coupons.click();
            Thread.sleep(3000); 

            String[] couponCodes = {"1020048", "1049255", "1025163", };
            for (int i = 0; i < couponCodes.length; i++) {
                WebElement CouponAllocation = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/ul/li[4]/ul/li[2]/a")); // Use the actual id or class of the button
                CouponAllocation.click();
                WebElement couponField = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/form/div/div[2]/div[2]/div/div[2]/div/div/div/label/input"));
                couponField.click();
                System.out.println(couponCodes[i]);
                couponField.sendKeys(couponCodes[i]);
                WebElement applyCouponButton = driver.findElement(By.className("blue"));
                applyCouponButton.click();
                WebElement CouponAllocationView = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/form/div/div[2]/div[3]/table/tbody/tr/td[16]/a\n"));
                CouponAllocationView.click();
                // couponField.clear();
                Thread.sleep(3000); 

                WebElement hoverButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/ul/li[1]/button"));

                // Initialize the Actions class
                Actions actions = new Actions(driver);
        
                // Perform the hover action
                actions.moveToElement(hoverButton).perform();
                Thread.sleep(3000); 
                WebElement AddCouponAllocation = driver.findElement(By.xpath(" /html/body/div[3]/div[2]/div/div[1]/div/ul/li[1]/ul/li[1]/a\n"));
                AddCouponAllocation.click();
                WebElement AllocationQty = driver.findElement(By.id("allocationCount"));
                AllocationQty.click();
        
                // Enter the coupon code
                AllocationQty.sendKeys("20");
                WebElement AllocationQtys = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/div[2]/form/div[2]/div/a\n"));
                AllocationQtys.click();
                Thread.sleep(6000); 

            
            }
            driver.close();
            // Enter the coupon code
        

            // Print the title of the results page
           
          
            // WebElement applyCouponButtons = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/ul/li[1]/button"));
            // applyCouponButtons.click();
           

     

            
            // Loop Ending 
        
            System.out.println("Results page title is: " + driver.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
        }
    }
}



