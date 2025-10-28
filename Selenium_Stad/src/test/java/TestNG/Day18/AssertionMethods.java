package TestNG.Day18;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AssertionMethods {

        @Test
        public void testAssertEquals() {
            String expected = "Selenium";
            String actual = "Selenium";
            Assert.assertEquals(actual, expected, "Values don't match!");
        }

        @Test
        public void testAssertTrue() {
            Assert.assertTrue(5 > 3, "5 is not greater than 3!");
        }

        @Test
        public void testAssertFalse() {
            Assert.assertFalse(3 > 5, "3 is greater than 5!");
        }

        @Test
        public void testAssertNotEquals() {
            Assert.assertNotEquals("Actual", "Expected", "Values are the same!");
        }
    }


