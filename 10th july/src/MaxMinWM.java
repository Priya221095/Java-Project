//Program to find  maximum and minimum value  with function

public class MaxMinWM {
static void printMaxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];

        for (int i=0;i<arr.length;i++){// i=0 means the element at position 0 in array, and it will continue until the length of an array
            if(arr[i]>max) max = arr[i];  // to check if arr[i] i.e whether the element at i position is greater than element at max position
            if(arr[i]<min) min = arr[i];  // to check if arr[i] i.e whether the element at i position is lesser than element at min position
        }
        System.out.println("Print Maximum value: "+ max);
        System.out.println("Print Minimum value: " + min);
    }
    public static void main(String[] args) {
        int[] arr = {4,9,7,2,6};
        MaxMinWM obj = new MaxMinWM(); // Object creation
        printMaxMin(arr); //calling main method
    }
}
