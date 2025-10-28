package Day1toDay14.Day6;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;


public class BaseTest {
    public static WebDriver webDriver;

    // 🔹 true = use manual chromedriver.exe path
    // 🔹 false = let Selenium Manager auto-manage
    private static final boolean USE_MANUAL_DRIVER = true;

    public void BaseSetup(String URL) {
        if (USE_MANUAL_DRIVER) {
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\Priyanka\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        }

        webDriver = new ChromeDriver();

        // Implicit wait (applies globally to all findElement calls)
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Maximize window
        webDriver.manage().window().maximize();

        // Open URL
        webDriver.get(URL);
    }

    public void closeBrowser() {
        webDriver.quit();
    }

    public void clickAction(By locator) {
        webDriver.findElement(locator).click();
    }

    public void clearAction(By locator) {
        webDriver.findElement(locator).clear();
    }

    public void valueEnter(By locator, String text) {
        webDriver.findElement(locator).sendKeys(text);
    }

    public boolean display(By locator) {
        try {
            return webDriver.findElement(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public boolean display(By locator, boolean b) {
        try {
            return webDriver.findElement(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean enable(By locator) {
        try {
            return webDriver.findElement(locator).isEnabled();
        } catch (Exception e) {
            return false;
        }
    }

    public String getValue(By locator) {
        return webDriver.findElement(locator).getText();
    }

    public String getTagName(By locator) {
        return webDriver.findElement(locator).getTagName();
    }

    public String getElement(By locator, String css) {
        return webDriver.findElement(locator).getCssValue(css);
    }

    public String getAttribute(By locator, String AttributeName) {
        return webDriver.findElement(locator).getAttribute(AttributeName);
    }

    public org.openqa.selenium.Dimension getAttributes(By locator) {
        return webDriver.findElement(locator).getSize();
    }

    public void switchToNewWindowByTitle(String expectedTitle) {
        for (String handel : webDriver.getWindowHandles()) {
            if (webDriver.getTitle().equals(expectedTitle)) {
                webDriver.switchTo().window(handel);
            }
        }
    }

    public void switchToNewWindowByIndex(int index) {
        List<String> handels = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(handels.get(index));
    }

    //  Select checkbox (only if not already selected)
    public void selectCheckbox(By locator) {
        WebElement checkbox = webDriver.findElement(locator);
        if (!checkbox.isSelected()) {
            checkbox.click();
            System.out.println("Checkbox selected: " + locator.toString());
        } else {
            System.out.println("Checkbox already selected: " + locator.toString());
        }
    }

    //  Unselect checkbox (only if selected)
    public void unselectCheckbox(By locator) {
        WebElement checkbox = webDriver.findElement(locator);
        if (checkbox.isSelected()) {
            checkbox.click();
            System.out.println("Checkbox unselected: " + locator.toString());
        } else {
            System.out.println("Checkbox already unselected: " + locator.toString());
        }
    }

    //  Check status of checkbox
    public boolean isCheckboxSelected(By locator) {
        return webDriver.findElement(locator).isSelected();
    }
    // Select dropdown by visible text
    public void selectDropdownByText(By locator, String text) {
        WebElement dropdown = webDriver.findElement(locator);
        Select select = new Select(dropdown);
        select.selectByVisibleText(text);
        System.out.println("Selected dropdown option: " + text);
    }

    // Select dropdown by index
    public void selectDropdownByIndex(By locator, int index) {
        WebElement dropdown = webDriver.findElement(locator);
        Select select = new Select(dropdown);
        select.selectByIndex(index);
        System.out.println("Selected dropdown option at index: " + index);
    }

    // Select dropdown by value
    public void selectDropdownByValue(By locator, String value) {
        WebElement dropdown = webDriver.findElement(locator);
        Select select = new Select(dropdown);
        select.selectByValue(value);
        System.out.println("Selected dropdown option with value: " + value);
    }
    // Get all links (anchor tags) from a page or a section
    public void getAllLinks(By locator) {
        List<WebElement> links = webDriver.findElements(locator);
        System.out.println("Total links found: " + links.size());

        for (WebElement link : links) {
            String linkText = link.getText();
            String href = link.getAttribute("href");
            System.out.println("Link Text: " + linkText + " | URL: " + href);
        }
    }

    // Generic function: Switch to frame by locator
    public void switchToFrameByFrameElement(WebElement frameElement) {
        webDriver.switchTo().frame(frameElement);
    }


    // Generic function: Switch back to default content
    public void switchToDefaultContent() {
        webDriver.switchTo().defaultContent();
    }

    // Generic function: Drag and Drop
    public void dragAndDrop(By sourceLocator, By targetLocator) {
        WebElement source = webDriver.findElement(sourceLocator);
        WebElement target = webDriver.findElement(targetLocator);
        Actions actions = new Actions(webDriver);
        actions.dragAndDrop(source, target).perform();
    }
    // Generic function: Resizable
    public void resizeElement(By handleLocator, int xOffset, int yOffset) {
        WebElement resizeHandle = webDriver.findElement(handleLocator);
        Actions actions = new Actions(webDriver);
        actions.clickAndHold(resizeHandle)
                .moveByOffset(xOffset,yOffset)
                .release()
                .perform();
    }
    // Generic function Slider
    public void slideElement(By handleLocator, int xOffSet) {
        WebElement slideHandle = webDriver.findElement(handleLocator);
        Actions actions = new Actions(webDriver);
        actions.clickAndHold(slideHandle)
                .moveByOffset(xOffSet,0)
                .release()
                .perform();
    }
        // Handle Simple Alert (only OK)
        public void acceptSimpleAlert() {
            Alert alert = webDriver.switchTo().alert();
            System.out.println("Alert Text: " + alert.getText());
            alert.accept();
        }

        // Handle Confirmation Alert (OK / Cancel)
        public void handleConfirmationAlert(boolean accept){
            Alert alert = webDriver.switchTo().alert();
            System.out.println("Confirmation Alert Text: " + alert.getText());

            if (accept) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            System.out.println("Confirmation accepted: " + accept);
        }

        // Handle Prompt Alert (enter text + OK / Cancel)
        public void handlePromptAlert(String inputText, boolean accept) {
            Alert alert = webDriver.switchTo().alert();
            System.out.println("Prompt Alert Text: " + alert.getText());

            if (inputText != null &&  !inputText.isEmpty()) {
                alert.sendKeys(inputText);
            }

            if (accept) {
                alert.accept();
            } else {
                alert.dismiss();
            }
        }
    }

