// Fibonacci series with function
public class FibonacciWithMethod
{
    static void printFibonacciSeries(int i){
        int a = 0, b = 1;
        System.out.print("Fibonacci: " + a + " " + b + " ");
        for(int j=2; j<=i; j++){
            int next = a+b;
            System.out.println(next+ " " );
            a=b;
            b=next;
        }
    }
    public static void main (String[] args){
        printFibonacciSeries(5);  //calling class
    }
}
