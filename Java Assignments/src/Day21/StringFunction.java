package Day21;
public class StringFunction
{
    public static void main(String[] args){
        // ====== Inherited from Object class ======
        String str1 = "Java";
        String str2 = new String("Java");

        // equals(Object obj)
        System.out.println("1. equals(): " + str1.equals(str2)); // true

        // toString()
        System.out.println("2. toString(): " + str1.toString()); // Java

        // ====== String-specific methods ======
        String sentence = "  Hello World  ";

        // length()
        System.out.println("3. length(): " + sentence.length()); //10

        // isEmpty()
        String blankString = "";
        System.out.println("4. isEmpty(): " + blankString.isEmpty()); // true

        // trim()
        System.out.println("5. trim(): '" + sentence.trim() + "'"); // "Hello World"

        // equals()
        System.out.println("6. equals(): " + sentence.equals("  Hello World  ")); // true

        // equalsIgnoreCase()
        System.out.println("7. equalsIgnoreCase(): " + "WORLD".equalsIgnoreCase("world")); // true

        // + operator
        String lang = "Chaudhari";
        String result1 = lang + " Priyanka";
        System.out.println("8. + operator: " + result1); // Chaudhari Priyanka

        // concat()
        String result2 = lang.concat(" Kapil");
        System.out.println("9. concat(): " + result2); // Chaudhari Kapil

        // join()
        String languages = String.join(", ", "English", "Hindi", "Marathi");
        System.out.println("10. join(): " + languages); // English,Hindi,Marathi

        // replace()
        System.out.println("11. replace(): " + sentence.replace("o", "O")); // "  HellO WOrld  "

        // replaceFirst()
        System.out.println("12. replaceFirst(): " + sentence.replaceFirst("l", "@")); // "  He@lo World  "

        // replaceAll()
        System.out.println("13. replaceAll(): " + sentence.replaceAll("\\s", "")); // HelloWorld

        // indexOf()
        System.out.println("14. indexOf('o'): " + sentence.indexOf('o')); // 6

        // lastIndexOf()
        System.out.println("15. lastIndexOf('o'): " + sentence.lastIndexOf('o')); //9

        // charAt()
        System.out.println("16. charAt(10): " + sentence.charAt(10)); // 'r'

        // contains()
        System.out.println("17. contains(\"Java\"): " + sentence.contains("Java")); // false

        // startsWith()
        System.out.println("18. startsWith(\"  Wel\"): " + sentence.startsWith("  Wel")); // false

        // endsWith()
        System.out.println("19. endsWith(\"ld  \"): " + sentence.endsWith("ld  ")); // true

        // toUpperCase()
        System.out.println("20. toUpperCase(): " + sentence.toUpperCase()); // "  HELLO WORLD  "

        // toLowerCase()
        System.out.println("21. toLowerCase(): " + sentence.toLowerCase()); // "  hello world  "

        // toCharArray()
        char[] characters = sentence.toCharArray();
        System.out.print("22. toCharArray(): ");   // H e l l o  W o r l d
        for (char ch : characters) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // valueOf()
        boolean isLearning = true;
        String strLearning = String.valueOf(isLearning);
        System.out.println("23. valueOf(): " + strLearning); // true
    }
}


