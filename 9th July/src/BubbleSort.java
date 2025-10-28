// Bubble sort program without function

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {18, 14, 27, 9, 13, 11};  //providing the elements
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
        for (int val : arr)
            System.out.print(val + " ");
    }
}

