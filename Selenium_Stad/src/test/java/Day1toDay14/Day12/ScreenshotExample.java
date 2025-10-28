package Day1toDay14.Day12;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
public class ScreenshotExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://rahulshettyacademy.com/AutomationPractice/");
            // Capture full page screenshot
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("C:\\STAD Solutions\\Practice\\Selenium_Stad\\screenshot\\fullpage.png"));
            System.out.println("Full page screenshot captured successfully!");

            //capture screenshot of element
            WebElement logo = driver.findElement(By.id("alertbtn"));
            File elementScreenshot = logo.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(elementScreenshot, new File("C:\\STAD Solutions\\Practice\\Selenium_Stad\\screenshot\\logo.png"));
            System.out.println("Element screenshot captured successfully!");

        } catch (Exception e) {
            // Printing any exception messages if occurred
            System.out.println("Error while taking screenshot: " + e.getMessage());
        } finally {

            // Close the browser
            driver.quit();
        }
    }
}


