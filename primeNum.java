import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        
        int trial = 2;
        while(trial <= num/2){
            if (num%trial == 0 ){
                System.out.println("The number you entered is not prime number");
                System.exit(0);
            }
           trial++;
        }
        System.out.println("The number you entered is a prime");
    }   
}
