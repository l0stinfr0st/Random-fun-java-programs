
import java.util.Scanner;

public class Derivative {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter constant of variable x: ");
        double constant = input.nextDouble();
        System.out.print("Enter degree of variable x: ");
        double degree = input.nextDouble();

        System.out.println("Original Function: f(x) = " + (int)constant + "x" + "^" + (int)degree);
        
        if (degree - 1 == 0) {
            System.out.println("Derivative of function is: f'(x) = " + (degree * constant));
            System.exit(0);
        }
        System.out.println("Derivative of function is: f'(x) = " + (degree * constant) + "x^" + (degree - 1));
    }

}
