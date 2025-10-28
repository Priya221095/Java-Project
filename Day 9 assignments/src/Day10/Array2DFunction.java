package Day10;
// Program to create 2D array function and calling it with anonymous array and non-anonymous array
public class Array2DFunction {
    public static void print2D(int[][] arr) {
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");}
            System.out.println();}
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};          //Without anonymous array
        System.out.println("Print 2D array: ");
        print2D(arr);

        System.out.println("Print 2D anonymous array: "); //With anonymous array
        print2D(new int [][]{
            {14,28,37},
            {42,55,}
        });
    }
}

