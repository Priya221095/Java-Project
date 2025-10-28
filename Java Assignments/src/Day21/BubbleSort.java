package Day21;
public class BubbleSort
{
    public static void main(String[] args){
        String str1 = "yllil";
        char[] characters = str1.toCharArray();

        for(int i = 0; i< characters.length-1; i++){
            for(int j = 0;j< characters.length-1-i;j++){
                String s1= String.valueOf(characters[j]);
                String s2= String.valueOf(characters[j+1]);

                if (s1.compareTo(s2)>0){
                    char temp = characters[j];
                    characters[j] = characters[j+1];
                    characters[j+1] = temp;
                }
            }
        }
        String sortedStr = new String(characters);
        System.out.println("Original String: " + str1);
        System.out.println("Sorted String: " + sortedStr);
    }
}
