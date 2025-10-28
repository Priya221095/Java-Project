// Square pattern with function

public class SquareWM {
            static void printSquare(int rows) {
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= rows; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
            public static void main(String[] args){
            printSquare(6);
}
}


