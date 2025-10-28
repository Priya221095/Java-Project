public class CommonElement {
    public static void main(String[] args) {

        int arr1[] = {8, 2, 4, 5, 7, 9};
        int arr2[] = {5, 1, 6, 3, 4, 0};
        System.out.println("Common Elements are: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {  // This will match elements of arr1 with elements of arr2
                    System.out.println((arr1[i])); // This will print common elements
                }
            }
        }
    }
}
