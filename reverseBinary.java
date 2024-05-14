
public class reverseBinary {

    public static void main(String[] args) {
        displayReverseBinary(7);
    }

    public static void displayReverseBinary(int n) {
        if (n > 0) {
            System.out.print(n%2);
            displayReverseBinary(n / 2);
        }
    }
}
