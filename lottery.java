import java.util.Scanner;

public class lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int  a = (int) (((Math.random())*90)+10);        
        System.out.print("Enter a 2-digit number: ");
        int b = input.nextInt();
        
        if(a==b){
            System.out.println("The lottery number was "+ a);
            System.out.println("Congratulations, you've won $10,000");
        }
        else if ((a%10)==((b/10)) && (b%10)==((a/10))){
            System.out.println("The lottery number was "+ a);
            System.out.println("Congratulations, you've  won $3,000");}
        
        else if (((a/10)==((b/10)) || (a/10)==((b%10))) || ((a%10)==(b/10)) || ((a%10)==(b%10))){
            System.out.println("The lottery number was "+ a);
            System.out.println("Congratulations, you've won $1,000");
            System.exit(0);}
        else
            System.out.println("The lottery number was "+ a);
            System.out.println("Unfortunantly, you didn't win anything");
    }
}