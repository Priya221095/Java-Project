public class LargerOf3Num
{
    public static void main(String[] args){
        int a= 25; int b= 125; int c= 700;
        if(a>b && a>c) {
            System.out.println("A=25 is a larger number");
        }else if(b>a && b>c){
            System.out.println("B=125 is a larger number");
        }else{
            System.out.println("C=700 is a larger number");
        }
    }
}

