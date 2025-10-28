package Day1toDay14.Day8;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadioButton {
    // Generic Function for Radio Button
    public static void selectRadioButton(WebDriver driver, String value) {
        WebElement radioBtn = driver.findElement(By.xpath("//input[@value='" + value + "']"));
        if (!radioBtn.isSelected()) {
            radioBtn.click();
        }
        System.out.println("Radio button selected: " + value);
    }
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        selectRadioButton(driver, "radio2"); // Selecting radio button 2
        selectRadioButton(driver, "radio3"); // Selecting radio button 3

        driver.quit();
    }
}

