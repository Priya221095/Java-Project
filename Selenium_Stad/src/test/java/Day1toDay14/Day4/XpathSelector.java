package Day1toDay14.Day4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class XpathSelector {
    public static void main(String[] args) {
        // Set path to ChromeDriver
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Priyanka\\Downloads\\chromedriver-win64.zip\\chromedriver-win64\\chrome-win64");
        WebDriver driver = new ChromeDriver();
        // Open Practice Website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        try {
            //Basic xpath selectors
            driver.findElement(By.xpath("//input"));  //by tag name
            driver.findElement(By.xpath("//input[@value='Alert']"));  //by Attribute
            System.out.println("Elements found using basic xpath selectors");

            //XPath Functions for Attributes
            driver.findElement(By.xpath("//input[contains(@type , 'submit')]"));  //by contains
            driver.findElement(By.xpath("//input[starts-with(@id , 'confirmbtn')]"));  //by Starts-with
            System.out.println("Elements found using xpath functions for attributes");

            //XPath Axes and relationships
            driver.findElement(By.xpath("//input[@value='radio1']/.."));  //Parent
            driver.findElement(By.xpath("//label/input"));  //Child
            driver.findElement(By.xpath("//label/descendant::input")); //Descendant
            driver.findElement(By.xpath("//input[@id='name']/following-sibling::input")); // following sibling
            System.out.println("Elements found using xpath axes and relationships");

            //Position and index
            driver.findElement(By.xpath("//input[1]")); //First element
            driver.findElement(By.xpath("(//label)[3]")); // Nth element
            driver.findElement(By.xpath("(//legend)[last()]")); // Last element
            System.out.println("Elements found using xpath position and index");

            //Combining conditions
            driver.findElement(By.xpath("//input[@value='radio3' and @type='radio']")); // AND
            driver.findElement(By.xpath("//input[@name='radiobutton' or @value='radio1']")); // OR
            System.out.println("Elements found using xpath combining condition");

        } catch (Exception e) {
            System.out.println("Element does not exist");
        }
        // close the browser
        driver.quit();
    }
}
