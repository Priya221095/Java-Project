package Day15;

public class Employee
{
    String name;
    int id;

    Employee(String n,int a){
        name = n;
        id= a;
        System.out.println("Employee details: ");
    }
    void printEmployee(){
        System.out.println("Name of an employee: " + name);
        System.out.println("ID of an employee: " +id);
    }
}
