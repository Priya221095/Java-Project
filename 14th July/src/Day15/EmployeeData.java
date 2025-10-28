package Day15;

public class EmployeeData
{
    String Profession;
    int Salary;

    EmployeeData(){
        Profession = "Software Tester";
        Salary = 50000;
    }
    void printData(){
        System.out.println("Designation: " +Profession);
        System.out.println("Salary: " +Salary);
    }
}
