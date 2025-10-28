// Program for deleting a data in 1D array

public class Deletion1D
{
        public static void main(String[] args) {
            String[] studentName = new String[3];     // String data type creation in array
            studentName[0] = "Priyanka";
            studentName[1] = "Kaveri";
            studentName[2] = "Jayesh";
            System.out.println("Student Name");
            for (int i = 0; i < studentName.length - 1; i++) {
                studentName[i] = studentName[i+1];
                System.out.println("Student Name for " + i + " is " + studentName[i]);
            }
        }
}
