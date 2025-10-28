package TestNG.Day19;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount {
      WebDriver driver;

        @Test(invocationCount = 3)
        public void openHomePageMultipleTimes() {
            driver = new ChromeDriver();
            driver.get("https://rahulshettyacademy.com/AutomationPractice/");
            System.out.println("Page ttle: " + driver.getTitle());
            driver.quit();
        }
    }

 
