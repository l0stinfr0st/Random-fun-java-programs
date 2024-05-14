import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);
        
        
        if(number1<number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;   
        }
        
        System.out.println(number1 + "-" + number2 + "= ? ");
        int answer = input.nextInt();
        
        int count= 1;
                
        while(answer != number1 - number2 && count<10){
            System.out.println("Your answer is wrong, try again!");
            System.out.println(number1 + "-" + number2 + "= ? ");
            answer = input.nextInt();
            count++;
        }   
        if(count == 10){
            System.out.println("You failed the quiz");
            System.out.println("The correct answer was " + (number1 - number2));
            System.exit(0);
        }
        System.out.println("You got the correct answer after " + count + " try(ies)");
        System.out.println("Correct answer is " + (number1-number2));
    }
    
}

