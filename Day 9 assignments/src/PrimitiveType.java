
public class PrimitiveType {
    public static void main(String[] args) {
        int[] studentId = {101,102,103};
        System.out.println("Student Id");
        for (int i : studentId) {
            System.out.println("Student id is " + i);
        }
        float[] studentPercentage = {81.24F,75.02F,60.59F};
        System.out.println("Student Percentage");
        for (float j : studentPercentage) {
            System.out.println("Student Percentage is " +j);
        }
        boolean[] isActive = {true,true,false};
        System.out.println("isActive");
        for(boolean k:isActive){
            System.out.println("is student active: " +k);
        }
        char[] studentGrade = {'A', 'B' , 'F'};
        System.out.println("Student Grade");
        for(char l: studentGrade){
            System.out.println();
        }

    }
}