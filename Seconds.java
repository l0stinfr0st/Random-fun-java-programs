
import java.util.Scanner;

public class Seconds {
   public static void main (String[] args){
           int min;
           int remainder;
   System.out.println("Enter seconds");
   Scanner input = new Scanner(System.in);
   int seconds = input.nextInt();
   min = seconds / 60;
   remainder = seconds % 60;
   System.out.println(min + " minutes " + remainder + " seconds ");
   }

}