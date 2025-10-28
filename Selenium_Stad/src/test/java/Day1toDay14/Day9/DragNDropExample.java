package Day1toDay14.Day9;

import Day1toDay14.Day6.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DragNDropExample extends BaseTest {
    public static void main(String[] args) {
        DragNDropExample obj = new DragNDropExample();

        obj.BaseSetup("https://jqueryui.com/droppable/");

        By frameBy = By.className("demo-frame");
        WebElement frameElement = webDriver.findElement(frameBy);

        obj.switchToFrameByFrameElement(frameElement);

        obj.dragAndDrop(By.id("draggable"),By.id("droppable"));
        System.out.println("Drag and drop function executed successfully");

        webDriver.quit();
    }
}
