public class CallArrayUtility {
    public static void main(String[] args) {

        ArrayUtility obj = new ArrayUtility(); //Object creation
        int[] arr = {8, 4, 7, 9, 3, 1};
        ArrayUtility.bubbleSort(arr);    // bubble sort class calling
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        int[] sort = {7, 6, 10, 4, 8, 5};
            ArrayUtility.insertionSort(sort); // insertion sort class calling
            for (int elements : sort) {
                System.out.print(elements + " ");
            }
        System.out.println();
            String[] linear = {"Priyanka", "Riddhi", "Tushar"};
            String target = "Tushar";
            ArrayUtility.linearSearch(linear, target);  // linear search class calling

            int[] maxmin = {4, 9, 7, 2, 6};
            ArrayUtility.printMaxMin(maxmin); // Maximum and minimum class calling

            int[] secondminmax = {18, 42, 51, 74, 12};
            ArrayUtility.findSecondMaxMin(secondminmax);

            int[] duplicate = {2, 4, 8, 1, 4, 5};
            System.out.print("Duplicate element is: ");
            ArrayUtility.findDuplicate(duplicate);         // Duplicate class calling

    }
    }
