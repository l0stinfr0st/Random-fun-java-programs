
import java.util.Scanner;

public class AdditionQuiz {

    public static void main(String[] args) {
        
        int[] array = new int[6];        
        
        Scanner input = new Scanner(System.in);
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        System.out.print("Enter " + number1 + "+" + number2 + "=? ");
        int answer = input.nextInt();

        int num = 1;
        while (answer != (number1 + number2)) {
            System.out.println("You answer is wrong, try again!");
            System.out.print("Enter " + number1 + "+" + number2 + "=? ");
            answer = input.nextInt();
            num++;
        }

        System.out.println("You got the correct answer after " + num + " tries");
        System.out.println("Correct answer is " + (number1 + number2));

    }
}
