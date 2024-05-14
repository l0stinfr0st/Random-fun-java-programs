import java.util.Scanner;
        
public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the year you were born in: ");
        int year = input.nextInt();
        
        int zod = year % 12;
        
        switch(zod){
            case 0: System.out.println("You are a monkey!");
            break;
            case 1: System.out.println("You are a rooster!");
            break;
            case 2: System.out.println("You are a dog!");
            break;
            case 3: System.out.println("You are a pig");
            break;
            case 4: System.out.println("You are a rat");
            break;
            case 5: System.out.println("You are a ox!");
            break;
            case 6: System.out.println("You are a tiger!");
            break;
            case 7: System.out.println("You are a rabbit!");
            break;
            case 8: System.out.println("You are a dragon!");
            break;
            case 9: System.out.println("You are a snake!");
            break;
            case 10: System.out.println("You are a horse!");
            break;
            case 11: System.out.println("You are a Goat!");
            
           System.exit(0);
        
        
        }      
    }
}
