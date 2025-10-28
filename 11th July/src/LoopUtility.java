public class LoopUtility {
    //  program for printing a table
    public void printTable(int num) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
            }
        }

    // Program for printing factorial of a number
    public void printFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " = " + fact);
    }

    // Program to print reverse number
    void printReverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int i = number % 10;
            reverse = reverse * 10 + i;
            number /= 10;
        }
        System.out.println("Reversed number: " + reverse);
    }

    // Program to print Palindrome number
    void printPalindrome(int num) {
        int reverse = 0, temp = num;
        while (num != 0) {
            int i = num % 10;
            reverse = reverse * 10 + i;
            num /= 10;
        }
        if (temp == reverse)
            System.out.println(temp + " is a Palindrome");
        else
            System.out.println(temp + " is not a Palindrome");
    }

    // Program for printing prime number
    public void printPrimenumber(int num) {
        boolean isPrime = true;
        if (num <= 1) isPrime = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + " is " + (isPrime ? "Prime number" : "Not Prime")); // using ?: instead of if else
    }

    // Program for printing fibonacci series
    public void printFibonacci(int i) {
        int a = 0, b = 1;
        System.out.print("Fibonacci: " + a + " " + b + " ");
        for (int j = 2; j <= i; j++) {
            int next = a + b;
            System.out.println(next + " ");
            a = b;
            b = next;
        }
    }

    // Program for printing right angled triangle
    public void printRightAngled(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

    }

    // Program to print inverted triangle
    public void printInvertedTriangle(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}





