package Day18;
public class College
{ //Global variable
    String name;
    String address;
    int number;
    float result;

    College(){
        this("D.G Ruparel","Matunga rd,Mumbai",5,95.5f); // Assigning the values to variable
    }
    College(String name, String address, int number, float result){
        //Local variable value that is called from contructor to global variable
        this.name = name;
        this.address = address;
        this.number = number;
        this.result = result;
    }
     void print(){
         System.out.println("Name of the college: "+ this.name);
         System.out.println("Address: " + this.address);
         System.out.println("Rank in mumbai: " + this.number +"th");
         System.out.println("Result in mumbai: " + this.result + "%");
     }
     void display(){
        this.print(); // Calling the function using this keyword
     }
     public static void main(String[] args){
      College obj = new College(); // Object creation
      obj.display();  // Calling function
    }
}
