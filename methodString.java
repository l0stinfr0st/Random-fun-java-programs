
import java.util.Scanner;

public class methodString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String a = input.next();
        System.out.print("Enter second sentence:");
        String b = input.next();

        String c = Message(a, b);

        System.out.println(c);

    }

    public static String Message(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return str1;
        } else if (str2.length() > str1.length()) {
            return str2;
        } else {
            return "";
        }
    }
}
