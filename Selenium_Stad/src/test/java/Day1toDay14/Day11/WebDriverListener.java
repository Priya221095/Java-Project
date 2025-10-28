package Day1toDay14.Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

public class WebDriverListener {
    public static void main(String[] args) {
        // Normal WebDriver
        WebDriver driver = new ChromeDriver();

        // Attach listener using EventFiringDecorator
        EventFiringDecorator<WebDriver> decorator = new EventFiringDecorator<>(new MyListener());
        WebDriver decoratedDriver = decorator.decorate(driver);

        try {
            // Navigate to test page
            decoratedDriver.get("https://rahulshettyacademy.com/AutomationPractice/");

            // Find input box and type text
            WebElement searchBox = decoratedDriver.findElement(By.id("autocomplete"));
            searchBox.sendKeys("Selenium 4 WebDriverListener");

            // Click on an element
            WebElement firstLink = decoratedDriver.findElement(By.id("openwindow"));
            firstLink.click();

        } catch (Exception e) {
            System.out.println("Caught error: " + e.getMessage());
        } finally {
            decoratedDriver.quit();
        }
    }
}
