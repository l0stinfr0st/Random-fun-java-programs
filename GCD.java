import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your first number: ");
        int a = input.nextInt();
        System.out.print("Enter your second number: ");
        int b = input.nextInt();
        
        int d = 1;
        while(d != a){
        a = a/d;
        if(a%d==0)
            
        d++;
        
    }
        
        
    }
    
}
