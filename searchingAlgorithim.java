
public class searchingAlgorithim {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch1(array, 3));
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

   /* public static int binarySearch(int[] array, int key, int length) {
        if (array[(length - 1) / 2] == key) {
            return (length - 1) / 2;
        } else if (array[(length - 1) / 2] > key) {
            length = (length - 1) / 2;
            binarySearch(array, key, length);
        } else {
            binarySearch(array, key, (length - 1) / 2);
        }

        return -1;
    } */

    public static int binarySearch1(int[] array, int key) {
        int low = 0;
        int high = array.length-1;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key == array[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
