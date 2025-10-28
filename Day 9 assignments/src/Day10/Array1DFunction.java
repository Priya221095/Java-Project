package Day10;
// Program to create 1D array function and calling it with anonymous array and non-anonymous array
public class Array1DFunction {
    // Function to print 1D array
    public static void print1D(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    // Calling of function
    public static  void main(String[]args){
        int[] name1D = {2, 4, 6};                        // Without anonymous array
        System.out.println("1D named array: ");
        print1D(name1D);

        System.out.println("1D anonymous array");    // With anonymous array
        print1D(new int[]{11, 21, 31});
    }
}

