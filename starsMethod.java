public class starsMethod {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            drawLineStar(i);
        }
    }
    public static void drawLineStar(int length){
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
}
