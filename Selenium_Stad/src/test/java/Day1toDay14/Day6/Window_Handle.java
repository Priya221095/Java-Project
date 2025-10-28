package Day1toDay14.Day6;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class Window_Handle extends BaseTest {
    public static void main(String[] args) {
        Window_Handle obj = new Window_Handle();
        obj.BaseSetup("https://rahulshettyacademy.com/AutomationPractice/");

        By windowElement = By.id("openwindow");
        By clickCourse = By.linkText("Courses");
        By radioButton = By.xpath("//input[@value='radio1']");
        By browserText = By.xpath("//h1[contains(.,'Browse products')]");
        obj.clickAction(windowElement);

        String parentWindow = webDriver.getWindowHandle();
        Set<String> allWindows = webDriver.getWindowHandles();
        for ( String handel : allWindows)
        {
            if(!(handel.equals(parentWindow)))
            {
                webDriver.switchTo().window(handel);
            }
        }
        obj.clickAction(clickCourse);
        System.out.println(webDriver.getTitle());
        webDriver.close();

        //webDriver.switchTo().window(parentWindow);
        obj.switchToNewWindowByIndex(0);
        obj.clickAction(radioButton);
        System.out.println("Radio button clicked");

        WebElement iframe = webDriver.findElement(By.id("courses-iframe"));
        webDriver.switchTo().frame(iframe);
        System.out.println("iframe found");

        obj.clickAction(clickCourse);
        System.out.println("Click on Course");

        //System.out.println(obj.getValue(browserText));

        obj.closeBrowser();
    }
}
