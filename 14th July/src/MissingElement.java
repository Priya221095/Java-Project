
public class MissingElement {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,6};
        int expectedNoOfElement = array.length+1;   // defines the length of an array
        int totalSum = (expectedNoOfElement * (expectedNoOfElement + 1))/2;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Missing element = " +(totalSum-sum));
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}