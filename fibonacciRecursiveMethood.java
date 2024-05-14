import java.util.Scanner;

public class fibonacciRecursiveMethood {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index of the fibonacci sequence: ");
        int a = input.nextInt();
        System.out.println(fibonacciRecursiveMethod(a));
    }
    public static long fibonacciRecursiveMethod(int index){
        switch (index) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibonacciRecursiveMethod(index-2) + fibonacciRecursiveMethod(index-1);
        }
    }
}
