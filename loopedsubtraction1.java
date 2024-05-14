import java.util.Scanner;

public class loopedsubtraction1 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         int count1 = 1;
         int count2 = 1;
         
         while(count1 + count2<12){
             int a= (int) (Math.random()*10);
             int b = (int) (Math.random()*10);
             System.out.print("What is "+ a+ " + "+ b + " : ");
             int answer = input.nextInt();
             if(answer == a+b){
                 System.out.println("The answer is correct");
                 System.out.println(count1 + " Correct");
             count1++;}
             else {
                 System.out.println("The answer is wrong");
                 System.out.println(count2 + " Wrong");
             count2++;}
         }
         System.out.println((count1-1) + " Correct " + " and " + (count2-1) + " Wrong ");
    }
}