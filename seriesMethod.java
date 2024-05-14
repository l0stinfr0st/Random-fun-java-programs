
public class seriesMethod {

    public static void main(String[] args) {
        double x = series(10);
        System.out.println(x);
    }

    public static double series(int n) {
        double a = 0;
        for (int i = 1; i <= n; i++) {
            double sign = Math.pow(-1,(i+1));
            a += (i + (i + 1.0)) / (i * (i + 1.0))*sign;
        }
        return a;
    }
}
