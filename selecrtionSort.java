import java.util.*;

public class selecrtionSort {

    public static void main(String[] args) {
        int[] array = {2, 4, 64, 21, 23, 6, 87, 84, 3};
        insertionSort(array);
        
        System.out.println(Arrays.toString(array));
        

    }
    
    public static void selectionSort(int[] array){
         for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    
    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }

}
