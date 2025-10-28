package Day1toDay14.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo
{
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver","C:\\Users\\Priyanka\\Downloads\\chromedriver-win64.zip\\chromedriver-win64\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();

        driver.get("https://www.instagram.com/");// Opening Website

        String title = driver.getTitle();

        System.out.println("page title: "+ title);//Print Title

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current Url: "+currentUrl);//Print URL

        driver.quit();//Close the Browser
    }
}
