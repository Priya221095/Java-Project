package Day20;

public class StringConstantPool
{
    public static void main(String[] args){
        // String literal
        String str1 = "Java";
        String str2 = "Java";

        // Using new keyword will create a new object and it goes to heap memory
        String str3 = new String("Java");

        // Comparing the reference
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
    }
}
