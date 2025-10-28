public class PalindromeWithMethod {
            void printPalindromeNumber() {
                int num = 989, reverse = 0, temp = num;
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
            public static void main(String[] args) {
                PalindromeWithMethod obj = new PalindromeWithMethod();
                obj.printPalindromeNumber();
            }
}
