import java.util.Scanner;

public class sumInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any integer: ");
        int num = input.nextInt();
        int sum=0;
        
        while(num!=0){
            
            int digit = num%10;
            sum += digit;
        }
        System.out.println("The sum of the integers is: " + sum);
    }
    
}
