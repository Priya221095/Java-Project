public class LargerNumberWithMethod {

    int a = -20;
    int b = -30;

    void largerNumber() {
        if (a > b) {
            System.out.println("A=-20 is a larger number");
        } else {
            System.out.println("B=-30 is a larger number");
        }
    }
    public static void main(String[] args) {
        LargerNumberWithMethod a = new LargerNumberWithMethod(); // calling object
        a.largerNumber();
    }
}

