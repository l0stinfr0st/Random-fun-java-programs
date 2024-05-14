
public class celsiusMethod {

    public static void main(String[] args) {
        System.out.println("Fah       Cel");
        System.out.println("----      ----");
        celsiusConverter(120);
    }

    public static void celsiusConverter(double temp) {
        int n = (int) temp;
        n -= 10;
        double celsius = ((temp - 32.0) * (5 / 9.0));
        System.out.println((int) (temp) + "\t" + (int) (celsius * 10.0) / (10.0));
        if (n != 0) {
            celsiusConverter(n);
        }
    }
}
