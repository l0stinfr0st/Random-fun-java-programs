
public class modula3 {

    public static void main(String[] args) {

        int numcount = 0;
        for (int i = 51; i <= 150; i += 3) {
            System.out.println(i);
            numcount++;
            if (numcount % 10 == 0) {
                System.out.println(i);
            }
        }
    }
}
