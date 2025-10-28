package Day16;

public class Student        // Parent class
{
    String student_name;
    int id;

    void printStudentDetails(){
        student_name = "Priyanka";             //providing values to variables of class parent
        id = 101;
        System.out.println("Student student_name is: " + student_name);
        System.out.println("Student id is: " +id);
    }
}
