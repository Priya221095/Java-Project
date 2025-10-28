package Day1toDay14.Day10;

import Day1toDay14.Day6.BaseTest;

   public class JavaScriptExecutor extends BaseTest
    {
        public static void main(String[] args) throws InterruptedException {
            JavaScriptExecutor js = new JavaScriptExecutor();
            js.BaseSetup("https://rahulshettyacademy.com/AutomationPractice/");

            org.openqa.selenium.JavascriptExecutor javascriptExecutor = (org.openqa.selenium.JavascriptExecutor) webDriver;
            Thread.sleep(2000);
            javascriptExecutor.executeScript("location.reload()");
        }
    }

