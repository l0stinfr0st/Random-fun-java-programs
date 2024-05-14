
public class myTriangle {

    public static void main(String[] args) {
        boolean a = isValid(5, 10, 2);
        System.out.println(a);
        
    }

    public static boolean isValid(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
    public static double getArea(double a, double b, double c){
        double area = 0;
        if(isValid(a,b,c)){
            area = (1/4.0)*Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c));
            return area;
        }
        else{
            return 0;
        }
    }
}
