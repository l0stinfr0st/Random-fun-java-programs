
import java.util.Scanner;

public class Celsius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double celsius;
        System.out.println("Enter the temorature in farenhiet");
        double Fahrenheit = input.nextDouble();
        celsius = 5.0 / 9.0 * (Fahrenheit - 32);
        System.out.println(celsius + " celsius degrees");

    }

}
