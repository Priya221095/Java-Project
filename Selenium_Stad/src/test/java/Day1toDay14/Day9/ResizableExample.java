package Day1toDay14.Day9;

import Day1toDay14.Day6.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResizableExample extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        ResizableExample obj = new ResizableExample();
        obj.BaseSetup("https://jqueryui.com/resizable/");

        By frameby = By.className("demo-frame");
        WebElement frameElement = webDriver.findElement(frameby);

        obj.switchToFrameByFrameElement(frameElement);

        obj.resizeElement(By.cssSelector(".ui-resizable-se"),100,50);
        Thread.sleep(2000);
        System.out.println("Resize function executed successfully");

        webDriver.quit();
    }
}
