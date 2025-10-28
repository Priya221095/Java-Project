public class EvenOddWithMethod {

    int a = 55;

    void evenOdd() {
        if (a % 2 == 0) {
            System.out.println("A=55 ia an even number");
        } else {
            System.out.println("A=55 is an odd number");
        }
    }
    public static void main(String[] args) {
        EvenOddWithMethod pra = new EvenOddWithMethod();
        pra.evenOdd();
    }
}
