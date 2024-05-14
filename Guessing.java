
import java.util.Scanner;

public class Guessing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int rand = (int) ((Math.random() * 100));
        System.out.println(rand);
        int guess = 0;

        do {
            guess = input.nextInt();

            if (guess < rand) {
                System.out.println("Answer is too low");
            } else {
                System.out.println("Answer is too high");
            }
        } while (rand != guess);

    }
}
