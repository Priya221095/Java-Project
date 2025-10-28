package Day23;
public class ExceptionHandling
{
    // Method that throws an exception using 'throws'
    public static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            // throwing an exception manually using 'throw'
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted!");
        }
    }

    public static void main(String[] args) {
        try {
            // code that may throw an exception
            int a = 10, b = 0;
            int result = a / b;  // This will throw ArithmeticException

            checkAge(15); // Calling a method that uses throws and throw. This will not execute because above line has an exception

        } catch (ArithmeticException e) {
            // catch block to handle exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // finally block always executes
            System.out.println("This block executes regardless of exception.");
        }

        System.out.println("Program continues...");
    }
}
