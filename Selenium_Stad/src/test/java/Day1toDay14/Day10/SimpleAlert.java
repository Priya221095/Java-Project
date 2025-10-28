package Day1toDay14.Day10;

import Day1toDay14.Day6.BaseTest;
import org.openqa.selenium.By;

public class SimpleAlert extends BaseTest
{
    public static void main(String[] args) throws InterruptedException {
        SimpleAlert simpleAlert = new SimpleAlert();
        simpleAlert.BaseSetup("https://rahulshettyacademy.com/AutomationPractice/");

        // Simple Alert
        webDriver.findElement(By.id("name")).sendKeys("TestUser");
        webDriver.findElement(By.id("alertbtn")).click();
        Thread.sleep(2000);
        simpleAlert.acceptSimpleAlert();

        webDriver.quit();
    }
}
