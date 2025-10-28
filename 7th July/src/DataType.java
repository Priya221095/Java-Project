// Array creation with Primitive type

public class DataType {
    public static void main(String[] args) {
        String[] studentName = new String[3];     // String data type creation in array
        studentName[0] = "Priyanka";
        studentName[1] = "Kaveri";
        studentName[2] = "Jayesh";
        System.out.println("Student Name");
        for (int i = 0; i < studentName.length; i++) {
            System.out.println("Student Name for " + i + " is " + studentName[i]);
        }
        int[] studentId = new int[3];     // Integer integral data type creation in array
        studentId[0] = 101;
        studentId[1] = 102;
        studentId[2] = 103;
        System.out.println("Student ID");
        for (int i = 0; i < studentId.length; i++) {
            System.out.println("Student id for " + i + " is " + studentId[i]);
        }
        float[] studentPercentage = new float[3];  // Float integral data type creation in array
        studentPercentage[0] = 80.15f;
        studentPercentage[1] = 75.45f;
        studentPercentage[2] = 30.25f;
        System.out.println("Student Percentage");
        for (int i = 0; i < studentPercentage.length; i++) {
            System.out.println("Student Percentage for " + i + " is " + studentPercentage[i]);
        }
        boolean[] studentActive = new boolean[3]; // Boolean integral data type creation in array
         studentActive[0] = true;
         studentActive[1] = true;
         studentActive[2] = false;
        System.out.println("Student Active");
        for (int i = 0; i < studentActive.length; i++) {
            System.out.println("Student Percentage for " + i + " is " + studentActive[i]);
        }
        char[] studentGrade = new char[3]; // Char integral data type creation in array
        studentGrade[0] = 'A';
        studentGrade[1] = 'A';
        studentGrade[2] = 'F';
        System.out.println("Student Grade");
        for (int i = 0; i < studentGrade.length; i++) {
            System.out.println("Student Grade for " + i + " is " + studentGrade[i]);
        }
    }
}