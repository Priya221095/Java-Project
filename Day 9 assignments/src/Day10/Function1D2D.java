package Day10;

public class Function1D2D {
    public static void main(String[] args) {
        //Function to print 1D array
        int[] intArray = {10, 20, 30, 40};
        System.out.println("Print 1D Array:");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Function to print 2D array
        int[][] arr = {{1,2,3}, {4,5,6}};
        System.out.println("Print 2D Array");
        for(int[] row:arr){
            for(int element:row){
                System.out.print(element + " ");
            }
            System.out.println();
            }
        }
        }


