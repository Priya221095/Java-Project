// Without function
public class Fibonacci
{
    public static void main (String[] args){
        int i = 9, a = 0, b = 1;

        System.out.println("Fibonacci: " + a + " " + b + " ");

        for(int j=2; j<=i; j++){
            int next = a+b;
            System.out.println(next+ " " );
            a=b;
            b=next;
        }
    }
}
