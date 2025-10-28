// Inverted right angle triangle with function

public class InvertedTriangleWM {
    static void printInvertedTriangle() {
        int rows = 3;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    InvertedTriangleWM obj = new InvertedTriangleWM();
    obj.printInvertedTriangle();
    }
}
