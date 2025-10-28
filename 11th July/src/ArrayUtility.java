// Creating Array utility class for all the "array" programs and call it in another class

import java.util.Arrays;

public class ArrayUtility {
// bubble sorting
public static void bubbleSort(int[] arr) {
    int a = arr.length;// arr.length means the length of array or no.of elements in an array
    for (int i = 0; i < arr.length; i++) {  // outer loop
        for (int j = 0; j < a - i - 1; j++) {  // Loop for iteration of each array inside
            if (arr[j] > arr[j + 1]) { // this will help to compare the left element with right element

                int temp = arr[j];    // Swapping of elements
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
// Linear search
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
// Insertion
public static void insertionSort(int[] arr) {
    int n = arr.length; // arr.length means the length of array or no.of elements in an array
    for (int i = 1; i < n; i++) { //i=1 is the position of the element we are starting to sort
        int key = arr[i]; //here key = arr[element position]
        int j = i - 1;  // here j is the element to be sorted & i-1 is the element at left of element j which we need to compare and sort

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}
//Find maximum and minimum
public static void printMaxMin(int[] arr){
    int max = arr[0];
    int min = arr[0];

    for (int i=0;i<arr.length;i++){// i=0 means the element at position 0 in array, and it will continue until the length of an array
        if(arr[i]>max) max = arr[i];  // to check if arr[i] i.e whether the element at i position is greater than element at max position
        if(arr[i]<min) min = arr[i];  // to check if arr[i] i.e whether the element at i position is lesser than element at min position
    }
    System.out.println("Print Maximum value: "+ max);
    System.out.println("Print Minimum value: " + min);
}
//Find second maximum and minimum
public static void findSecondMaxMin(int[] arr){
    Arrays.sort(arr);
    System.out.println("2nd Min: "+arr[1]);
    System.out.println("2nd Max: "+arr[arr.length-2]);
}
// Find duplicate
public static void findDuplicate(int[] arr) {
    for (int i = 0; i < arr.length; i++) { // i=0 means example i=2; this will continue until the length of array
        for (int j = i + 1; j < arr.length; j++) {  // j= (i+1) means example j=4; this will compare elements of i and j
            if (arr[i] == arr[j]) {  // this condition is to find duplicate element
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
}
