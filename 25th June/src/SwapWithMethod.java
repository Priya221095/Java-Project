public class SwapWithMethod
{
    int a = -20, b = 20;
    int c;
    void swap2Number(){
        c=a;
        a=b;
        b=c;
        System.out.println("After swap: a= "+a +",b= " +b);
    }
    public static void main(String [] args){
        SwapWithMethod obj = new SwapWithMethod();
        obj.swap2Number();
    }
}
