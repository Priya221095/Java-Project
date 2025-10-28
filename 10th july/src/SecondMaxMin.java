//Program to find second maximum and minimum value using sorting without function

import java.util.Arrays;
public class SecondMaxMin
{
    public static void main(String[] args){
        int[] arr = {10,20,5,80,14};
        Arrays.sort(arr);
        System.out.println("2nd Min: "+arr[1]);
        System.out.println("2nd Max: "+arr[arr.length-2]);
    }
}
