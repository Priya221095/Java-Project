// without function

public class Table {
    public static void main(String[] args) {
        int number = 4;
        {
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }
    }
}