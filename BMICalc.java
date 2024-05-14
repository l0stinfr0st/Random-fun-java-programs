import java.util.Scanner;
        
public class BMICalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                        
        
        int sum = 0;
        int n = 32;
        for (int i = n; i >= 1; i /= 2) {
            for (int j = n; j >= 1; j--) {
                sum++;
            }
        }
        System.out.println(sum);
        
//        System.out.print("Enter your weight in kg: ");
//        double kg = input.nextDouble();
//        
//        System.out.print("Enter your hieght meter: ");
//        double m = input.nextDouble();
//        
//        double BMI = (kg)/Math.pow(m,2);
//        
//        if (BMI >= 30)
//            System.out.println("Your BMI is " + BMI + " which makes you obese" );
//          else if (BMI >= 25)
//            System.out.println("Your BMI is " + BMI + " which makes you Overweight");
//          else if (BMI >= 18.5)
//            System.out.println("Your BMI is " +  BMI + " which makes you Normal");
//          else
//            System.out.println("Your BMI is " + BMI + " which makes you Underweight");
        
    }   
}
