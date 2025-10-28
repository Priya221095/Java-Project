package TestNG.Day15;
import org.testng.annotations.Test;
public class IncludeExclude {
    @Test
    public void loginTest() {
        System.out.println("Login test executed");
    }
    @Test
    public void logout() {
        System.out.println("Logout test executed");
    }
    @Test
    public void registrationTest() {
        System.out.println("Registeration test executed");
    }
}

