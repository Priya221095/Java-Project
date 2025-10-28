//Program to find Second maximum and minimum value using sorting with function

import java.util.Arrays;

public class SecondMaxMinWM {
     static void findSecondMaxMin(int[] arr){
        Arrays.sort(arr);
        System.out.println("2nd Min: "+arr[1]);
        System.out.println("2nd Max: "+arr[arr.length-2]);
    }
    public static void main(String[] args){
        int [] arr = {18,42,51,74,12};
        SecondMaxMin obj = new SecondMaxMin();
        findSecondMaxMin(arr);

    }
}
