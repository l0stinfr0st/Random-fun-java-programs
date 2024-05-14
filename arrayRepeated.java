
import java.util.Arrays;
import java.util.Scanner;

public class arrayRepeated {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.println("Enter first array size");
        int size1 = input.nextInt();
        System.out.println("Enter second array size");
        int size2 = input.nextInt();

        int[] a = new int[size1];
        int[] b = new int[size2];

        System.out.println("Fill first array");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter num:");
            a[i] = input.nextInt();
        }
        System.out.println("Fill second array");
        for (int i = 0; i < b.length; i++) {
            System.out.print("Enter num:");
            b[i] = input.nextInt();
        }*/

        int[] list = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int key = 0;

        System.out.println(Arrays.toString(insertKey(list, key)));

        //System.out.println("Common integers: " + numSame(a, b));
    }

    public static boolean repeatedSequence(int[] a, int[] b) {
        int condition = 0;
        if (b.length % a.length != 0) {
            return false;
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] != a[condition]) {
                return false;
            }
            condition++;
            if (condition == a.length) {
                condition = 0;
            }
        }
        return true;
    }

    public static int numSame(int[] list1, int[] list2) {
        int index1 = 0, index2 = 0, count = 0;

        while (index1 < list1.length && index2 < list2.length) {
            if (list1[index1] == list2[index2]) {
                count++;
                index2++;
                index1++;
            } else if (list1[index1] > list2[index2]) {
                index2++;
            } else {
                index1++;
            }
        }
        return count;
    }

    public static int[] insertKey(int[] num, int key) {
        int[] keyed = new int[num.length + 1];
        int index = 0, condition = 0;

        for (int i = 0; i < num.length; i++) {
            if (key < num[i]) {
                keyed[i] = key;
                index = i;
                break;
            } else if (key > num[i]) {
                keyed[i+1] = key;
                index = i+1;
            }
        }
        for (int i = 0; i < keyed.length; i++) {
            if (i == index) {
                continue;
            }
            keyed[i] = num[condition];
            condition++;
        }
        return keyed;
    }
}
