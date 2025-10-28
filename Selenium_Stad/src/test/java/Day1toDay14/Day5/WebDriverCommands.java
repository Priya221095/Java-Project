package Day1toDay14.Day5;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class WebDriverCommands {
    public static void main(String[] args) {
        // Set path to ChromeDriver
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Priyanka\\Downloads\\chromedriver-win64.zip\\chromedriver-win64\\chrome-win64");
        WebDriver driver = new ChromeDriver();
        // Open Practice Website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        if (driver == null) {
            System.out.println("Didn't get any ID");
        } else {
            try {
                // 1. click()
                WebElement button = driver.findElement(By.xpath("//button[@id='openwindow']"));
                button.click();

                // 2. sendKeys() 3. clear()
                WebElement text = driver.findElement(By.id("name"));
                text.sendKeys("Priyanka Chaudhari");
                Thread.sleep(5000);
                text.clear();

                //4. isDisplayed()
                boolean status = driver.findElement(By.id("openwindow")).isDisplayed();
                System.out.println("is button visible: " + status);

                //5. isEnabled()
                boolean enabled = driver.findElement(By.id("opentab")).isEnabled();
                System.out.println("is button visible: " + enabled);

                //6. getText()
                String text1 = driver.findElement(By.className("totalAmount")).getText();
                System.out.println("Message: " +text1);

                //7. getTagName()
                String tag = driver.findElement(By.name("enter-name")).getTagName();
                System.out.println("Tag name: " + tag);

                //8. getCSSValue()
                String bgColor = driver.findElement(By.id("autocomplete")) .getCssValue("background-color");
                System.out.println("Background color: " + bgColor);

                String textColor = driver.findElement(By.id("opentab")) .getCssValue("color");
                System.out.println("Text color: " + textColor);

                String fontSize = driver.findElement(By.id("checkBoxOption2")) .getCssValue("font-size");
                System.out.println("Font size: " + fontSize);

                String textAlign = driver.findElement(By.id("openwindow")) .getCssValue("text-align");
                System.out.println("Text Alignment: " + textAlign);

                //9. getAttribute()
                String value = driver.findElement(By.id("openwindow")).getAttribute("class");
                System.out.println("Class  :" + value);

                //10. getSize()
                org.openqa.selenium.Dimension size = driver.findElement(By.className("logoClass")).getSize();
                System.out.println("Height: " + size.getHeight());
                System.out.println("Width: " + size.getWidth());

                //11. getLocation()
                org.openqa.selenium.Point location = driver.findElement(By.className("logoClass")).getLocation();
                System.out.println("X coordinate: " + location.getX());
                System.out.println("Y coordinate: " + location.getY());

            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        driver.quit();
    }
}
