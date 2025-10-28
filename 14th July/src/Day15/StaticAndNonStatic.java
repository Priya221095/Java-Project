package Day15;
public class StaticAndNonStatic
{
     static void printName(){         // Static method with no parameter and no return type
        System.out.println("My name is Priyanka");
    }
    static int printInteger(int age){         // Static method with parameter and return type
        System.out.println("Age is: " + age);
        return age;
    }
        void printLine () {                  // Non static method with no parameter and no return type
        System.out.println("I am a student");
    }
    int printPercentage(int percentage){     // Non Static method with parameter and return type
        System.out.println("My percentage: " +percentage);
        return percentage;
    }
    public static void main(String[] args){
         StaticAndNonStatic obj = new StaticAndNonStatic();
         printName();
         StaticAndNonStatic.printInteger(29);
         obj.printLine();
         obj.printPercentage(70);
     }
}
