package Day21;
public class ReversePalindrome
{
    public static void main(String[] args){
        String s1 = "Nolon";
        String reverse = "";
        for (int i = s1.length()-1; i>=0; i--){
             reverse = reverse + s1.charAt(i);
        }
        System.out.println("Original string: " + s1);
        System.out.println("Reversed string: " + reverse);

        if(s1.equals(reverse)){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }
    }
}
