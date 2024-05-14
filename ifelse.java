
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number1 = (int) (Math.random()*10);
        int number2 = (int) (Math.random()*10);
        
        if (number1 < number2){
           int temp = number1;
            number1 = number2;
            number2 = temp;
                    }
        System.out.println("What is" + number1 + " - " + number2 + "?");
        
        int answer = input.nextInt();
        
        if (answer == (number1 - number2)){
            System.out.println("Your answer is correct");
        }else{ 
            System.out.println("Your answer is wrong");
    }
    }
    
}
