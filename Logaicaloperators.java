
public class Logaicaloperators {

    public static void main(String[] args) {

        int number;
        number = 6;

        if (number % 2 == 0 && 3 == 0) {
            System.out.println("The number is divisible by 2 and 3");
        }
        if (number % 2 == 0 || 3 == 0) {
            System.out.println("The number is divisible by either 2 or 3");
        }

        if (number % 2 == 0 ^ 3 == 0) {
            System.out.println("divisible by 2 or 3, but not both");
        }
    }
}
