package TestNG.Day18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HardAssertions {


        WebDriver driver;

        @BeforeClass
        public void setUp() {
            driver = new ChromeDriver();
            driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        }

        @Test
        public void validateTitle() {
            String expectedTitle = "Practice Domain";
            String actualTitle = driver.getTitle();

            // Hard Assertion - test will stop here if assertion fails
            Assert.assertEquals(actualTitle, expectedTitle, "Page titles do not match!");

            // This will only execute if the assertion above passes
            System.out.println("Title verification completed.");
        }

        @AfterClass
        public void tearDown() {
            driver.quit();
        }
    }


