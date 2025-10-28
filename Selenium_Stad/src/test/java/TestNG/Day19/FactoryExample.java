package TestNG.Day19;
import org.testng.annotations.Factory;

public class FactoryExample {
        @Factory
        public Object[] factoryMethod() {
            return new Object[]{
                    new TestClass(1),
                    new TestClass(2),
                    new TestClass(3)
            };
        }
    }


