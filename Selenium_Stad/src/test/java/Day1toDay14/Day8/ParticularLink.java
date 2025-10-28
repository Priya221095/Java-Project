package Day1toDay14.Day8;

import Day1toDay14.Day6.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ParticularLink extends BaseTest {
    public static void main(String[] args) {
        ParticularLink obj = new ParticularLink();
        obj.BaseSetup("https://rahulshettyacademy.com/AutomationPractice/");

        // Locate a particular link by visible text
        By particularLink = By.linkText("Free Access to InterviewQues/ResumeAssistance/Material");

        WebElement linkElement = webDriver.findElement(particularLink);

        // Print link text & URL
        System.out.println("Link Text: " + linkElement.getText());
        System.out.println("Link URL: " + linkElement.getAttribute("href"));

        // Perform click on it
        linkElement.click();
        System.out.println("Clicked on the link successfully!");

        obj.closeBrowser();

    }
}
