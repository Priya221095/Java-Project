// Prime number with function
public class PrimeWithMethod
{
        static void printPrimeNumber() {
            int num = 8;
            boolean isPrime = true;

            if (num <= 1) isPrime = false;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(num + " is " + (isPrime ? "a Prime number" : "not a Prime number")); // using ?: instead of if else

        }
        public static void main(String[] args) {
        PrimeWithMethod.printPrimeNumber();
        }
}
