import java.util.Scanner;

public class Lotter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int  a = (int) (((Math.random())*90)+10);
        System.out.println(a);
        
        System.out.print("Enter a 2-digit number: ");
        int b = input.nextInt();
        
        if ((a%10)==((b/10)) && (b%10)==((a/10))){
            System.out.println("Congratulations, you've won $10,000");
        }
}
    
  
}
