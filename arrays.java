import java.util.Arrays;
import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = {3,7,4,9,12,50};
        System.out.println(Arrays.toString(array));
        double[] newArray = updateArray(array);

       System.out.println(Arrays.toString(newArray));
        /*

        boolean[] isCovered = new boolean[99];

        int number = input.nextInt();
        for (int i = 0; i < 10; i += m - 1) {

        }

        do {
            isCovered[number - 1] = true;
            number = input.nextInt();

        } while (number != 0);

        char[] occur = new char[6];

        occur[0] = 'a';
        occur[1] = 'b';
        occur[2] = 'c';
        occur[3] = 'a';
        occur[4] = 'a';
        occur[5] = 'a';

        int counta = 0;
        for (int i = 0; i < occur.length; i++) {
            if (occur[i] == 'a') {
                counta++;
            }

        }
        System.out.println(counta);


        /*        int[] list3 = {1,2,3,4,5};
        printArray(list3);
        System.out.println("");
        
        printArray(reverse(list3));
        System.out.println("");
        
        System.out.println(list3[0]);
        
        changeList(list3);
        
        System.out.println(list3[0]);

        shifting();

        int[] list1 = new int[5];
        int[] list2 = new int[5];

        list2 = list1;

        double[] templist = new double[10];

        double average = 0;
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter temperature of day " + i + ": ");
            double n = input.nextDouble();
            templist[i - 1] = n;
            sum += n;
            average = sum / 10.0;
        }
        System.out.println("The average temperature is: " + average);

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (templist[i] > average) {
                count++;
            }

        }
        System.out.println(count + " days have a higher temperature than the average");*/
    }

    public static void shifting() {
        int[] myList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }

        int first = myList[0];
        for (int i = 1; i < myList.length; i++) {
            myList[i - 1] = myList[i];

        }
        myList[myList.length - 1] = first;

        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }
    }

    public static void printArray(int[] myList) {
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i]);
        }
    }

    public static void changeList(int[] numbers) { //same thing applies for strings
        numbers[0] = -1;
    }

    //returning arrawys
    public static int[] reverse(int[] list) {
        int[] reverse = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            reverse[i] = list[list.length - (i + 1)];
        }
        return reverse;
    }

    public static char[] createArray() {
        char[] chars = new char[100];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        }
        return chars;
    }

    public static int[] storing(int num) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENter an integer: ");
        int number = input.nextInt();

        int[] array = new int[10];
        int index = 0;
        while (number > 0) {
            array[index] = number % 10;
            index++;
            number /= 10;
        }
        return array;
    }
    public static double median(int[] array){
        if(array.length%2==0){
            return (array[(array.length-1)/2] + array[((array.length-1)/2)+1])/2.0;
        }else{
            return array[((array.length-1)/2)];
        }
    }
    public static int[] doubleArray(int[] array){
        int[] doubleArray = new int[array.length*2];
        System.arraycopy(array, 0, doubleArray, 0, array.length);
        return doubleArray;
    }
    public static int[] productArray(int[] a, int[] b){
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] * b[i];
        }
        return result;
    }
    public static double[] updateArray(int[] arrayNum){
        if(arrayNum.length==0){
            return null;
        }
        double[] newArray = new double[arrayNum.length];
        
        for (int i = 0; i < arrayNum.length; i++) {
            if(i%2==0){
                newArray[i] = Math.pow(arrayNum[i],2);
            }else{
                newArray[i]= arrayNum[i]/2.0;
            }
        }
        return newArray;
    }
}
