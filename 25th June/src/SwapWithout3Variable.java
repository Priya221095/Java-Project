// Swapping of 2 number without 3rd variable without function
public class SwapWithout3Variable
{
    public static void main(String[] args)
    {
        int a = 10, b=80;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After SwapNumber: a = " + a + ", b = " +b);
    }
}
