public class Students
{
    static void studentDetails(){ //cameCase for method naming

           int studentId = 5;                 //primitive type and camelCase for variable naming convention
           float studentPercentage = 72;
           String studentName= "Riya";        //non-primitive type

           System.out.println("Id: " + studentId);
           System.out.println("Percentage: " + studentPercentage);
           System.out.println("Name:" +studentName);

      }
    public static void main(String[] args) {
        Students.studentDetails();
    }
}