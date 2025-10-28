package Day15;

public class CallConstructor {
    public static void main(String[] args) {
        Employee obj = new Employee("Priyanka", 29);
        obj.printEmployee();
        EmployeeData obj1 = new EmployeeData();
        obj1.printData();
    }
}