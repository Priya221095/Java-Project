// Program to find second maximum value,no sorting with function
public class NoSortingWM {
    public static void findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Second max value: " + secondMax);
    }

    public static void main(String[] args) {
        int[] arr = {31, 41, 74, 21, 52};
        NoSortingWM obj = new NoSortingWM();
        obj.findSecondMax(arr);
    }
}


