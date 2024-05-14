
import java.util.Arrays;
import java.util.Scanner;

public class twoDimensionalArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int[][] Array2d = {
            {2,3,4,5},
            {2,34,5,3},
            {2,3,4,5,},
            {1,5,64,2}
        };
        
        alternate(Array2d[1]);
        
        System.out.println(Array2d[0].length);
       
        
        int m = 3;
        for (int i = 0; i < 10; i += m) {
            System.out.println("hi");
        }
        
        int[] Array = {1,2,3,4};
        System.out.println(Arrays.toString(Array));
        
        
        int[][] array2D = new int[5][5];
        double[][] Array2D = {
            {3.4, 2.6},
            {1.2, 2.7},
            {4.2, 5},
            {3.1, 1.6},
            {3.2, 1.7},};
        
        

        
        pointClose(Array2D);

        /*int count = 0;
        int sum = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = j;
            }
        
        }
        /*for (int i = 0; i < array2D.length; i++) {
            System.out.println(Arrays.toString(array2D[i]));
        }
        randomShuffling2D(array2D);
        System.out.println("");

        for (int i = 0; i < array2D.length; i++) {
            System.out.println(Arrays.toString(array2D[i]));
        }

        char[] key = {'A', 'B', 'C', 'D', 'E'};
        char[][] answers = {
            {'A', 'C', 'D', 'E', 'A'},
            {'A', 'C', 'D', 'B', 'E'},};

        System.out.println(Arrays.toString(answerChecker(key, answers))); */
    }

    public static void printArray2D(int[][] array2D) {
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println("");
        }
        
       

    }

    public static void randomShuffling2D(int[][] array2D) {
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                int randomIndexR = (int) (Math.random() * array2D.length);
                int randomIndexC = (int) (Math.random() * array2D[randomIndexR].length);
                int temp = array2D[i][j];
                array2D[i][j] = array2D[randomIndexR][randomIndexC];
                array2D[randomIndexR][randomIndexC] = temp;
            }
        }
    }

    public static int[] answerChecker(char[] key, char[][] answers) {
        int[] grades = new int[answers.length];
        int correctAns = 0;
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == key[j]) {
                    correctAns++;
                }
            }
            grades[i] = correctAns;
            correctAns = 0;
        }
        return grades;
    }

    public static void pointClose(double[][] array) {
        double x1 = 0, x2 = 0, y1 = 0, y2 = 0, minDistance = 10000, distance = 0;
        int minIndex1 = 0, minIndex2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == 0) {
                    x1 = array[i][j];
                }
                if (j == 1) {
                    y1 = array[i][j];
                }
            }
            i++;
            for (int j = i; j < array.length; j++) {
                for (int k = 0; k < array[j].length; k++) {
                    if (k == 0) {
                        x2 = array[j][k];
                    }
                    if (k == 1) {
                        y2 = array[j][k];
                    }
                }
                distance = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
                if (distance < minDistance) {
                    minDistance = distance;
                    minIndex1 = i - 1;
                    minIndex2 = j;
                }
            }
            i--;
        }
        System.out.println("The points closes to each other are in coloumns: " + minIndex1 + " and " + minIndex2);
        System.out.println("(" + array[minIndex1][0] + " , " + array[minIndex1][1] + ") , (" + array[minIndex2][0] + " , " + array[minIndex2][1] + ")");
    }
    
    public static void alternate(int[] Array){
        System.out.println(Arrays.toString(Array));
    }
   
    
    
    
}
