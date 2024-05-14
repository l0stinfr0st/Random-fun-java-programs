import java.util.Scanner;

public class taxing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your annual income in dollars: ");
        double income = input.nextDouble();
        
        System.out.print("Enter which case you fit in: Single (1) , Married Filing Joinlty or Qualifying Widower (2) , Married Filing Separately (3) , Head of Household (4): ");
        int status = input.nextInt();
        
       switch(status){
        case 1: if(income <= 8350){
                System.out.println("$"+income*0.9 + " is your income after being taxed 10%");}
                else if (income <= 33950)
                    System.out.println("$"+income*0.85 + " is your income after being taxerd 15%");
                else if (income <= 82250)
                    System.out.println("$"+income*0.75 + " is your income after being taxed 25%");
                else if (income <= 171550)
                    System.out.println("$"+income*0.72 + " is your income after being taxxed 28%");
                else if (income <= 372950)
                    System.out.println("$"+income*0.67 + " is your income after neing taxxed 33%");
                else if (income >= 372951)
                    System.out.println("$"+income*0.65 + " is your income after being taxxed 35%");
            break;
        
        case 2: if(income <= 16700){
                System.out.println("$"+income*0.9 + " is your income after being taxed 10%");}
                else if (income <= 67900)
                    System.out.println("$"+income*0.85 + " is your income after being taxerd 15%");
                else if (income <= 137050)
                    System.out.println("$"+income*0.75 + " is your income after being taxed 25%");
                else if (income <= 208850)
                    System.out.println("$"+income*0.72 + " is your income after being taxxed 28%");
                else if (income <= 372950)
                    System.out.println("$"+income*0.67 + " is your income after neing taxxed 33%");
                else if (income >= 372951)
                    System.out.println("$"+income*0.65 + " is your income after being taxxed 35%");
            break;
        
        case 3: if(income <= 8350){
                System.out.println("$"+income*0.9 + " is your income after being taxed 10%");}
                else if (income <= 33950)
                    System.out.println("$"+income*0.85 + " is your income after being taxerd 15%");
                else if (income <= 68525)
                    System.out.println("$"+income*0.75 + " is your income after being taxed 25%");
                else if (income <= 104425)
                    System.out.println("$"+income*0.72 + " is your income after being taxxed 28%");
                else if (income <= 186475)
                    System.out.println("$"+income*0.67 + " is your income after neing taxxed 33%");
                else if (income >= 186476)
                    System.out.println("$"+income*0.65 + " is your income after being taxxed 35%");
            break;
        case 4: if(income <= 11950){
                System.out.println("$"+income*0.9 + " is your income after being taxed 10%");}
                else if (income <= 45500)
                    System.out.println("$"+income*0.85 + " is your income after being taxerd 15%");
                else if (income <= 117450)
                    System.out.println("$"+income*0.75 + " is your income after being taxed 25%");
                else if (income <= 190200)
                    System.out.println("$"+income*0.72 + " is your income after being taxxed 28%");
                else if (income <= 372950)
                    System.out.println("$"+income*0.67 + " is your income after neing taxxed 33%");
                else if (income >= 372951)
                    System.out.println("$"+income*0.65 + "  is your income after being taxxed 35%");
            break;
       }   
    }
} 
