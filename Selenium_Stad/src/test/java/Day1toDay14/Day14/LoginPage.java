package Day1toDay14.Day14;

import Day1toDay14.Day6.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {


    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    public void enterUsername(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }


    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }
}

