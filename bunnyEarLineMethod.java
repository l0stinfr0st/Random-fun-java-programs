
import java.util.Scanner;

import java.util.ArrayList;

public class bunnyEarLineMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Etner index of bunnies: ");
        int index = input.nextInt();
        int ears = bunnyEars(index);
        System.out.println("The amount of ears of the bunnies is: " + ears);
    }

    public static int bunnyEars(int index) {
        if (index == 0) {
            return 0;
        } else if (index % 2 == 0) {
            return 3+ bunnyEars(index - 1);
        } else {
            return 2 + bunnyEars(index - 1);
        }

    }
    
    
    ArrayList<String> names = new ArrayList<String>();
    
    
    
    
}
