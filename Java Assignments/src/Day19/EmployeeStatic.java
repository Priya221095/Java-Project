package Day19;
public class EmployeeStatic {
    // Static variable
    static int id;
    static String name;
    // Static block
    static {
        id = 101;
        name = "Kiran";
        System.out.println("Below are the employee details");
    }
    // Static method
    static void employeeDetails() {
        System.out.println("Employee id: " + id);
        System.out.println("Employee name: " + name);
    }
    public static void main(String[] args) {
       EmployeeStatic.employeeDetails();  // Calling static method without any object
        EmployeeStatic obj = new EmployeeStatic(); // Creating object of class
        //below object can access the static variables as static variables can be shared
        obj.id = 102;          //giving different values to static variable
        obj.name = "Priyanka";  //giving different values to static variable
    }
}


