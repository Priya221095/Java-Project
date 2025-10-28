package Day10;
// 2D array printing "for each" loop

public class ForEachLoop
{
public static void main(String[] args){
    int[][] arr = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println("Print Array");
        for(int[] row:arr){
            for(int element:row){
                System.out.print(element + " ");
            }
            System.out.println();
            }
        }
}

