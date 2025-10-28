package Day1toDay14.Day8;

import Day1toDay14.Day6.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class AllLinksHandling extends BaseTest {
    public static void main(String[] args) {
        AllLinksHandling obj = new AllLinksHandling();
        obj.BaseSetup("https://rahulshettyacademy.com/AutomationPractice/");

        By allLinks = By.tagName("a");
        List<WebElement> allLinksOnPage = webDriver.findElements(allLinks);

        System.out.println("Total Links: " + allLinksOnPage.size());

        for (WebElement link : allLinksOnPage) {
            String text = link.getText();
            String href = link.getAttribute("href");
            System.out.println("Text: " + text + " | URL: " + href);
        }

        obj.closeBrowser();
    }
}
