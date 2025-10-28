package Day1toDay14.Day12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreenRecord {
    public static void main(String[] args) throws Exception {
        // Start Screen Recording
        RecordingUtility.startRecording();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Handle JS Alerts
        By simpleAlert = By.xpath("//button[contains(text(),'Click for JS Alert')]");
        driver.findElement(simpleAlert).click();
        driver.switchTo().alert().accept();

        By confirmAlert = By.xpath("//button[contains(text(),'Click for JS Confirm')]");
        driver.findElement(confirmAlert).click();
        driver.switchTo().alert().dismiss();

        By promptAlert = By.xpath("//button[contains(text(),'Click for JS Prompt')]");
        driver.findElement(promptAlert).click();
        driver.switchTo().alert().sendKeys("Java Selenium");
        driver.switchTo().alert().accept();

        WebElement result = driver.findElement(By.id("result"));
        System.out.println(result.getText());

        driver.quit();

        // Stop Screen Recording
        RecordingUtility.stopRecording();
    }
}
