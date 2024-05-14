
public class upperCaseLetter {

    public static void main(String[] args) {
                    double probability = (((int)(Math.random()*9 )) + 1)/10.0;
        System.out.println(probability);
        upperCase('c');
    }

    public static void upperCase(char letter) {

        String str = "" + letter;
        
        if (str.equals(str.toUpperCase())) {
            System.out.println("Syntax Error");
        } else {
            System.out.println(str.toUpperCase());
        }

    }
}
