// Program of missing elements without main method

public class MissingElementWM {
    public static int printMissingElements(int[] array) {
        int expectedNoOfElement = array.length + 1;   // defines the length of an array
        int totalSum = (expectedNoOfElement * (expectedNoOfElement + 1)) / 2;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Missing element = " + (totalSum - sum));
        return totalSum - sum;
        }
    public static void main(String[] args) {
        int [] array = {1,2,3,5,6};
        MissingElementWM obj = new MissingElementWM();
        obj.printMissingElements(array);
    }
}
