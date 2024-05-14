
public class recursiveMethodGofigure {

    public static void main(String[] args) {

        mysteryXY(3, 60);
        System.out.println("");
    }

    public static int goFigure(int x) {
        if (x < 100) {
            x = goFigure(x + 10);
            System.out.println(x);
        }
        return (x - 1);
    }

    public static void mysteryXY(int x, int y) {
        if (y == 1) {
            System.out.print(x);
        } else {
            System.out.print(x * y + ",");
            mysteryXY(x, y - 1);
            System.out.print("," + x * y);
        }
        

    }
    
}
