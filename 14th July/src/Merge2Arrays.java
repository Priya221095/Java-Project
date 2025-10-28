import java.util.Arrays;
public class Merge2Arrays {
    public static void main(String[] args) {
        int arr1[] = {8, 18, 28, 38};
        int arr2[] = {5, 15, 25, 35};
        int arr3[] = new int[arr1.length + arr2.length];
        System.out.println("Below are the merged arrays: ");

        for (int i = 0; i < arr1.length; i++)
            arr3[i] = arr1[i];
        {
            for (int j = 0; j < arr2.length; j++)
                arr3[arr1.length + j] = arr2[j];
            Arrays.sort(arr3);
            {
                for (int element : arr3) {
                    System.out.print(" " + element);
                }
            }
        }
    }
}
