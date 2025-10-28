package Day1toDay14.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Handle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\Downloads\\chromedriver-win64.zip\\chromedriver-win64\\chrome-win64");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        // Locating the iframe
        WebElement iframeElement = driver.findElement(By.xpath("//iframe[contains(@id,'courses-iframe')]"));

        // iframe by Index
        try {
            driver.switchTo().frame(0);
            System.out.println("iframe by index: " + driver.getCurrentUrl());
        } catch (Exception e) {
            System.out.println("if iframe by index failed: " + e.getMessage());
        }
        driver.switchTo().defaultContent();


        // iframe by webelement
        try {
            driver.switchTo().frame(iframeElement);
            System.out.println("iframe by webelemet: " + driver.getCurrentUrl());
        } catch (Exception e) {
            System.out.println("if iframe by webelement failed: " + e.getMessage());
        }
        driver.switchTo().defaultContent();

        driver.quit();


    }

}
