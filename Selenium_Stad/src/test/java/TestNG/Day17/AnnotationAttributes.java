package TestNG.Day17;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class AnnotationAttributes {
        // 1. description, priority
        @Test(priority = 1, description = "This test validates login functionality")
        public void loginTest() {
            System.out.println("Login Test executed");
        }

        // 2. dependsOnMethods, alwaysRun
        @Test(priority = 2, dependsOnMethods = "loginTest", alwaysRun = true)
        public void dashboardTest() {
            System.out.println("Dashboard Test executed (depends on loginTest)");
        }

        // 3. enabled
        @Test(priority = 3, enabled = false)
        public void skippedTest() {
            System.out.println("This will not run because enabled=false");
        }

        // 4. timeOut
        @Test(priority = 4, timeOut = 2000)
        public void timeoutTest() throws InterruptedException {
            System.out.println("Timeout Test started");
            Thread.sleep(1000); // finishes within 2 seconds
            System.out.println("Timeout Test finished");
        }

        // 5. groups
        @Test(priority = 5, groups = {"sanity"})
        public void sanityTest() {
            System.out.println("Sanity group test executed");
        }

        @Test(priority = 6, groups = {"regression"})
        public void regressionTest() {
            System.out.println("Regression group test executed");
        }

        // 6. dependsOnGroups
        @Test(priority = 7, dependsOnGroups = {"sanity"})
        public void dependsOnSanityGroup() {
            System.out.println("This test runs only after sanity group tests");
        }

        // 7. dataProvider
        @DataProvider(name = "loginData")
        public Object[][] loginDataProvider() {
            return new Object[][] {
                    {"user1", "pass1"},
                    {"user2", "pass2"}
            };
        }

        @Test(priority = 8, dataProvider = "loginData")
        public void dataProviderTest(String username, String password) {
            System.out.println("Login with: " + username + " / " + password);
        }

        // 8. dataProvider from external class
        @Test(priority = 9, dataProvider = "searchData", dataProviderClass = ExternalDataProvider.class)
        public void externalDataProviderTest(String keyword) {
            System.out.println("Searching for: " + keyword);
        }

        // 9. parameters (from testng.xml)
        @Parameters({"browser", "url"})
        @Test(priority = 10)
        public void parameterTest(String browser, String url) {
            System.out.println("Browser: " + browser);
            System.out.println("URL: " + url);
        }
    }


