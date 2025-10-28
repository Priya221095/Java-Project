package Day1toDay14.Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {
    public static void main(String[] args) {
        // Set ChromeDriver path manually
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Priyanka\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Create WebDriverWait (10 seconds timeout)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until textbox is visible, then sendKeys
        WebElement nameBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("name"))
        );
        nameBox.sendKeys("Priyanka Chaudhari");

        // Wait until button is clickable, then click
        WebElement openWindowBtn = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("openwindow"))
        );
        openWindowBtn.click();

        System.out.println("SendKeys and Click successful using Explicit Wait");

        driver.quit();
    }
}
