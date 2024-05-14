import java.util.Scanner;

public class stringMethodCapitalA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String msg = input.nextLine();
        
        System.out.println("The number of A's in " + msg + " is: "+ howManyA(msg));
    }

    public static int howManyA(String msg) {
        if (msg.length() == 0) {
            return 0;
        }
        if (msg.substring(0, 1).equalsIgnoreCase("A")) {
            return 1 + howManyA(msg.substring(1));
        } else {
            return howManyA(msg.substring(1));
        }
    }
}
