package TestNG.Day18;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {

    WebDriver driver;

        @BeforeClass
        public void setUp() {
            driver = new ChromeDriver();
            driver.get("https://example.com/home");
        }

        @Test
        public void validateSoftAssertions() {
            SoftAssert softAssert = new SoftAssert();

            // Title validation
            String expectedTitle = "Some Wrong Title";
            String actualTitle = driver.getTitle();
            softAssert.assertEquals(actualTitle, expectedTitle, "Title check failed!");

            // URL validation
            String expectedUrl = "https://example.com/home";
            String actualUrl = driver.getCurrentUrl();
            softAssert.assertEquals(actualUrl, expectedUrl, "URL check failed!");

            // More soft assertions can be added here

            // This will collate and report all failures at the end
            softAssert.assertAll();
        }

        @AfterClass
        public void tearDown() {
            driver.quit();
        }
    }



