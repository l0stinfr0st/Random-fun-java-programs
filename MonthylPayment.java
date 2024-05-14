import java.util.Scanner;

public class MonthylPayment {
 public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    double monthlyPayment;
    
    System.out.println("Enter the interest rate");
    double interest = input.nextDouble();
    
    System.out.println("Enter the number of year");
    double time = input.nextDouble();
    System.out.println("Enter the loan amount");
    double loan = input.nextDouble();
    
    monthlyPayment = (loan * interest)/(1-(1)/Math.pow((1+interest),(time*12)));
    
    System.out.println(monthlyPayment);
    
   
    }
}