// Prime number without function

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 7;
        boolean isPrime = true;

        if(number <=1) isPrime = false;

        for(int i = 2; i<= number /2; i++){
            if (number %i==0){
                isPrime = false;
                break;
            }
        }
        System.out.println(number + " is " + (isPrime ? "Prime number" : "Not Prime")); // using ?: instead of if else
        }
    }
