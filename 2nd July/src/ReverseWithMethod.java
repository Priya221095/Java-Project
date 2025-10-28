// with function
public class ReverseWithMethod {
   static void printReverseNumber() {
        int num = 256417, reverse = 0;
        while (num != 0) {
            int i = num % 10;
            reverse = reverse * 10 + i;
            num /= 10;
        }
        System.out.println("Reversed number: " + reverse);
    }
        public static void main (String[] args)
        {
         ReverseWithMethod obj = new ReverseWithMethod();
         printReverseNumber();
    }
    }

