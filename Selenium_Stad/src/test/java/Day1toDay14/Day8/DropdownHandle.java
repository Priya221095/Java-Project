package Day1toDay14.Day8;
import Day1toDay14.Day6.BaseTest;
import org.openqa.selenium.By;

public class DropdownHandle extends BaseTest {
    public static void main(String[] args) {
        DropdownHandle obj = new DropdownHandle();
        obj.BaseSetup("https://rahulshettyacademy.com/AutomationPractice/");

        By dropdownLocator = By.id("dropdown-class-example");

        // Using generic functions
        obj.selectDropdownByText(dropdownLocator, "Option2");
        obj.selectDropdownByIndex(dropdownLocator, 3);
        obj.selectDropdownByValue(dropdownLocator, "option1");

        obj.closeBrowser();
    }
}

