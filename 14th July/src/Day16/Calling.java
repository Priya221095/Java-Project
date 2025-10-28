package Day16;

public class Calling
{
    public static void main(String[] args){
        StudentDetails obj = new StudentDetails();  // object creation
        obj.course = "Bsc-IT";                     //providing values to variables of class child
        obj.course_duration = 3;           //providing values to variables of class child
        obj.printCourseDetails();                  //calling child function
    }
}