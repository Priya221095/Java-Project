package Day20;
public class StringCreation
{
    public static void main(String[] args){
        //Using character array
        char[] arr = {'W','e','l','c','o','m','e'};
        String str1 = new String(arr);
        System.out.println("String using character array: " + arr);

        //Using new keyword
        String str2 = new String("Java");
        System.out.println("String using new keyword: " + str2);

        //Using string literal
        String str3 = "World";
        System.out.println("String using literal: " + str3);
    }
}
