public class LargerOf3WithMethod
{
    int a= 25; int b= 125; int c= 700;
    void largerOf3Number()
    {
        if(a>b && a>c) {
            System.out.println("A=25 is a larger number");
        }else if(b>a && b>c){
            System.out.println("B=125 is a larger number");
        }else{
            System.out.println("C=700 is a larger number");
        }
    }
    public static void main(String[] args){
        LargerOf3WithMethod show = new LargerOf3WithMethod();
        show.largerOf3Number();
    }
}
