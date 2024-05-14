import java.util.Scanner;

public class summation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        
        while (num != 0){
        
        System.out.print("Please enter a number: ");
        num = input.nextInt();
        sum = sum + num;
       
        
        } 
       
        System.out.println(sum);
    
    }    
}
