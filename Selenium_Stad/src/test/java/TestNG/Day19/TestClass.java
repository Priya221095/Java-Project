package TestNG.Day19;
import org.testng.annotations.Test;

public class TestClass {
        private int data;
        public TestClass(int data) {
            this.data = data;
        }

        @Test
        public void testMethod() {
            System.out.println("Test  data: " + data);
        }
    }


