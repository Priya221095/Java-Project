package Day1toDay14.Day10;
import Day1toDay14.Day6.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PromptAlert extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        PromptAlert promptAlert = new PromptAlert();
        promptAlert.BaseSetup("https://the-internet.herokuapp.com/javascript_alerts");

        // Click JS Prompt button
        WebElement promptAlert1 = webDriver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
        promptAlert1.click();
        Thread.sleep(2000);

        // Handle the prompt alert
        promptAlert.handlePromptAlert("Priyanka Chaudhari", true);
        Thread.sleep(2000);

        // Verify result text
        WebElement resultElement = webDriver.findElement(By.xpath("//p[@id='result']"));
        System.out.println(resultElement.getText().contains("Priyanka Chaudhari"));

        webDriver.quit();
    }
    }

