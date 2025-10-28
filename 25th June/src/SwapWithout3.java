// Swapping of 2 number without 3rd variable with function
public class SwapWithout3 {
    int a = 10, b = 80;

    void swapNumber() {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After SwapNumber: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        SwapWithout3 show = new SwapWithout3();
        show.swapNumber();
    }
}

