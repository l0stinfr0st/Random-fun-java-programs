
public class sortingAlgorithim {

    public static void main(String[] args) {
        int[] array = {5, 1, 7, 8, 4, 3, 2};
        //sortingAlgo(array, 0);
        insertionSort1(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //System.out.println("Enter a series of numbers:");
    }

    public static int sortingAlgo(int[] array, int start) {
        if (array.length == start) {
            return 0;
        }
        int min = array[start];
        for (int i = start; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                int temp = array[start];
                array[start] = array[i];
                array[i] = temp;
            }
        }
        sortingAlgo(array, start + 1);
        return 0;
    }

    public static void insertionSort(int[] array) {
        int start = 1;
        for (int i = start; i > 0; i--) {
            if (array[i] < array[i - 1]) {
                int temp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temp;
            }
            else{
                start++;
                if (start >= array.length) {
                    break;
                }
            }
        }
    }
    public static void insertionSort1(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
