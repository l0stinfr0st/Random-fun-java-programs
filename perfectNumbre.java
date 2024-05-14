
public class perfectNumbre {

    public static void main(String[] args) {
        for (int i = 1; i <= 1000000; i++) {
            if (i % 2 == 0) {

                int sum = 0;
                for (int j = 1; j <= i / 2; j++) {
                    if (i % j == 0) {
                        sum += j;
                    }
                }
                if (sum == i) {
                    System.out.println(i + " is a perfect number");
                }
            }
        }
    }
}
