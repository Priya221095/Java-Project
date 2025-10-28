package Day16;

public class StudentDetails extends Student  // Child class extending parent class
{
    String course;
    int course_duration;

    void printCourseDetails(){
        System.out.println("Name of the course: " +course);
        System.out.println("Duration of the course: " +course_duration + " years");
    }
}
