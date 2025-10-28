package TestNG.Day15;
import org.testng.annotations.Test;

public class Groups {
    @Test(groups = {"sanity"})
        public void loginTest() {
            System.out.println("Login test executed");
        }

        @Test(groups = {"regression"})
        public void registrationTest() {
            System.out.println("Registration test executed");
        }

        @Test(groups = {"sanity", "regression"})
        public void searchTest() {
            System.out.println("Search test executed");
        }
    }


