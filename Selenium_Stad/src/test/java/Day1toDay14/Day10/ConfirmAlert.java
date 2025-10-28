package Day1toDay14.Day10;

import Day1toDay14.Day6.BaseTest;
import org.openqa.selenium.By;

public class ConfirmAlert extends BaseTest {
    public static void main(String[] args){
        ConfirmAlert confirmAlert = new ConfirmAlert();
        confirmAlert.BaseSetup("https://rahulshettyacademy.com/AutomationPractice/");

        webDriver.findElement(By.id("name")).sendKeys("TestUser");
        webDriver.findElement(By.id("confirmbtn")).click();

        confirmAlert.handleConfirmationAlert(false);
        webDriver.quit();
    }
}
