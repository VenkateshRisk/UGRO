package DAY_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainMethod {

    public static void main(String[] args) {
        
        // Set up WebDriverManager for ChromeDriver
        WebDriverManager.chromedriver().setup();
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        try {
            // Navigate to the URL
            driver.get("https://prime.riskcovry.com/partner_sso?enc=sAQ7U/DigjhN6lMVnVZMotqYRM3YGumydT7NYGOis08CncWku0Lm4DKAh/sCMOvrS+UqBaACQ+e4V4d0d4BTrTgG/2BzkR8NH7If4aTLP/rPtIIPxfOdLVXjXjQqJ4xM02CPi4GFdpkKI7OAAYExBfTZ8AvFgx1I1GcDIcssz/E=&redirect_url=/loanProtect_T2/insuranceCombo&quote_id=3Zei95ae21iuaoyY5_De");
            
            // Maximize the window
            driver.manage().window().maximize();
            // Set up WebDriverWait with Duration
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            
            // Wait for the span element to be click_able and then click
            WebElement spanElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='PA+CI+EMI - Digit Group Total Protect Policy']")));
            spanElement.click();
            
            // Wait for the button to be click_able and then click
            WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Click Here')]")));
            clickableButton.click();
            
            WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mainContent > main > div > div.py-4.px-2.max-w-screen-xl.m-auto.w-auto > div.block.sm\\:grid.gap-4 > div:nth-child(1) > div.mt-6 > form > div.flex.flex-col.bg-color-box-bg.rounded-lg.border-2.md\\:p-4.py-4.border-solid.mb-4.border-gray-300 > div > div.p-3.xsm\\:p-4.md\\:px-6.block.sm\\:grid > div.gap-4.grid.grid-cols-2 > div:nth-child(1) > input")));
            
            // Clear the input field if necessary and then enter the value
            inputElement.clear();
            inputElement.sendKeys("2000");
            
            
           
        } catch (Exception e) {
            e.printStackTrace(); // Print exception if any
        } finally {
            // Ensure the browser is closed
            //driver.quit();
        }
    }
}
