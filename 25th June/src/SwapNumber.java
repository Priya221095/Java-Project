public class SwapNumber //PascalCase naming for class
{
    public static void main(String[] args)
    {
        int a = -20, b = 20;
        int c;

        c=a;
        a=b;
        b=c;

        System.out.println("After swap: a= "+a +",b= " +b);
    }
}
