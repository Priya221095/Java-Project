// factorial with function
class FactorialWithMethod {
    static void printFactorial() {
        int num = 10;
        int fact = 1;
        {
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + num + " = " + fact);
        }
    }
        public static void main (String[] args)
        {
            FactorialWithMethod obj = new FactorialWithMethod();
            printFactorial();
        }
    }


