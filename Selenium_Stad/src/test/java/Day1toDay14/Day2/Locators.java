package Day1toDay14.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {
    public static void main(String[] args) {
        // Set path to ChromeDriver
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Priyanka\\Downloads\\chromedriver-win64.zip\\chromedriver-win64\\chrome-win64");
        WebDriver driver = new ChromeDriver();
        // Open Practice Website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        try {
            // ID locator
            WebElement idLocator = driver.findElement(By.id("autocomplete"));
            System.out.println("id locator exists");

            // Name locator
            WebElement nameLocator = driver.findElement(By.name("checkBoxOption1"));
            System.out.println("name locator exists");

            // Class Name locator
            WebElement classNameLocator = driver.findElement(By.className("radioButton"));
            System.out.println("class name locator exists");

            // tag name locator
            WebElement tagLocator = driver.findElement(By.tagName("Checkbox Example"));
            System.out.println("tag name locator exists");

            // Link Text Locator
            WebElement linkTextLocator = driver.findElement(By.linkText("in"));
            System.out.println("link text locator exists");

            // Partial Link Text Locator
            WebElement partialLinkText = driver.findElement(By.partialLinkText("linked"));
            System.out.println("Partial link text locator exists");
        }
        catch (Exception e) {
            System.out.println("Element does not exist");;
        }
        // close the browser
        driver.quit();
    }
}