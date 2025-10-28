// Program for Linear search with function

public class LinearSearchWM {
    public static String linearSearch(String[] arr, String target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) { // iteration of values
            if (arr[i] == target) { // comparison between arr[] = target value
                index = i;
            }
        }
        System.out.println("Found at index: " + index);
        return target;
    }

    public static void main(String[] args) {
        String[] arr = {"Priyanka", "Riddhi", "Tushar"}; // Elements
        String target = "Priyanka";
        linearSearch(arr, target);
    }
}


