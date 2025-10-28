
 public class Humans
 {
     String name= "Ram"; // using proper descriptive naming conventions
     void action(){

         System.out.println("Humans action: Run");
    }
    public static void main(String[] args){
         Humans obj = new Humans(); // object creation
         obj.action(); //calling method
        System.out.println(obj.name);
    }
 }
