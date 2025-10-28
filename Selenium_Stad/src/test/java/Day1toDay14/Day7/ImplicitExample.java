package Day1toDay14.Day7;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ImplicitExample {
    public static void main(String[] args) throws InterruptedException {

        // Set path to ChromeDriver if required
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Priyanka\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Set implicit wait (applies to all findElement calls)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open a page
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement element = driver.findElement(By.id("autocomplete"));
        element.sendKeys("India");
        Thread.sleep(3000);

        WebElement element1 = driver.findElement(By.xpath("(//div[contains(text(),'India')])"));
        element1.click();
        Thread.sleep(3000);

        // Close browser
        driver.quit();
    }
}

