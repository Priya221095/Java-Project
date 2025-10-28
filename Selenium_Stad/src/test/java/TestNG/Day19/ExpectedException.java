package TestNG.Day19;
import org.testng.annotations.Test;

public class ExpectedException {

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        int result = 40 / 0; // This will throw ArithmeticException
        System.out.println("Result: " + result);
    }

    @Test(expectedExceptions = {NullPointerException.class,IllegalArgumentException.class})
    public void testMultipleExceptions() {
        throw new NullPointerException();
    }
}

