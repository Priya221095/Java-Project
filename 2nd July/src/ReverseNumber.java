// without function
public class ReverseNumber {
    public static void main(String[] args) {
        int num = 586241, reverse = 0;

        while (num != 0) {
            int i = num % 10;
            reverse = reverse * 10 + i;
            num /= 10;
        }
        System.out.println("Reversed number: " + reverse);
    }
}
