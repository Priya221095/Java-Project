package Day1toDay14.Day9;

import Day1toDay14.Day6.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SliderExample extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        SliderExample obj = new SliderExample();
        obj.BaseSetup("https://jqueryui.com/slider/");

        By frameby = By.className("demo-frame");
        WebElement frameElement = webDriver.findElement(frameby);

        obj.switchToFrameByFrameElement(frameElement);

        obj.slideElement(By.cssSelector(".ui-slider-handle"),70); // this will slide from original to 70px to right
        Thread.sleep(2000);
        obj.slideElement(By.cssSelector(".ui-slider-handle"),40); // this will again slide to 40px

        System.out.println("Slide function executed successfully");

        webDriver.quit();
    }
}

