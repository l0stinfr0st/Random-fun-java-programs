import java.util.Scanner;

public class method {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        
        System.out.println("The sum of numbers from " + a + "-" + b + " is: " + sumNumbers(a, b));
        System.out.println("The sum of numbers from 20-30 is: " + sumNumbers(20, 30));
        System.out.println("The sum of numbers from 35-45 is: " + sumNumbers(35, 45));
    }

    public static int sumNumbers(int startNum, int endNum) {
        int sum = 0;

        for (int i = startNum; i <= endNum; i++) {
            sum += i;
        }

        return sum;

    }
}
