import java.util.Scanner;

public class MonetraryUnits {
 public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    
    int dollars;
    int quarters;
    int nickles;
    
    System.out.println("Enter the amount in dollars ");
    double money = input.nextDouble();
    
    dollars = (int) money;
    quarters =(int) ((int)((money-dollars)/(0.25)));
    nickles = (int) ((int)(((money - dollars)-(quarters*0.25)))/(0.1));
   
    System.out.println(dollars + " Dollars " + quarters + " Quarters " + nickles + " Nickles ");
   
    

 }
}