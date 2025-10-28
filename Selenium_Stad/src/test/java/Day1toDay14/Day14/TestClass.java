package Day1toDay14.Day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.instagram.com/");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("Priyanka", "Pri@2210");

        driver.quit();
    }
}


