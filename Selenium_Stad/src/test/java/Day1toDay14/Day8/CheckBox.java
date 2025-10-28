package Day1toDay14.Day8;
import Day1toDay14.Day6.BaseTest;
import org.openqa.selenium.By;
public class CheckBox extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        CheckBox obj = new CheckBox();
        obj.BaseSetup("https://rahulshettyacademy.com/AutomationPractice/");

        By option1 = By.id("checkBoxOption1");
        By option2 = By.id("checkBoxOption2");

        // Select checkbox 1
        obj.selectCheckbox(option1);
        System.out.println("Option 1 selected? " + obj.isCheckboxSelected(option1));
        Thread.sleep(2000);

        // Select checkbox 2
        obj.selectCheckbox(option2);
        System.out.println("Option 2 selected? " + obj.isCheckboxSelected(option2));
        Thread.sleep(2000);

        // Unselect checkbox 1
        obj.unselectCheckbox(option1);
        System.out.println("Option 1 selected after unselect? " + obj.isCheckboxSelected(option1));

        obj.closeBrowser();
    }
}
