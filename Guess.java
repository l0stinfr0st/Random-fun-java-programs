import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num = (int)((Math.random())*90+10);
        System.out.println(num);
        
            int guess = 101;
    
            while(guess != num){
            System.out.print("Enter an integer between 0-100: ");
            guess = input.nextInt();
            
            if(guess > num){
                System.out.println("The number you entered is too high");
                }
            else if(guess == num){
                System.out.println("Congratulations, you got it right!");
                System.out.println("The number was indeed " + num);}
            
            else if (guess< num){
                System.out.println("Your answer is wrong try again!");
                System.out.println("The number you entered is too low");
            }
        }
    }
}
