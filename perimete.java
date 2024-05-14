import java.util.Arrays;
import java.util.HashMap;

public class perimete {
    public static void main(String[] args) {
        int[] a = {13,5,12,7,24,2};
        int[] b = {12,7,24};
        int[] c = {0,0,1,1,1,2,2,3,3,4};
        
        System.out.println(removeDuplicates(c));
        System.out.println(searchArray(a,b));
        
    }
    
    public static int islandPerimeter(int[][] grid){
        int count = 0;
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if(grid[j][i] == 1){
                    count += 4;
                    if(j != grid.length-1 && grid[j+1][i] == 1){
                        count--;
                    }
                    if(i != grid[0].length-1 && grid[j][i+1] == 1){
                        count--;
                    }
                    if(j != 0 && grid[j-1][i] == 1){
                        count--;
                    }
                    if(i != 0 && grid[j][i-1] == 1){
                        count--;
                    }
                }
            }
        }
        return count;
    }
    
    public static int searchArray(int[] a, int[] b){
        int startIndex = -1;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == b[0]){
                int begin = i+1;
                startIndex = i;
                for (int j = 1; j < b.length; j++) {
                    if(a[begin] != b[j]){
                        startIndex = -1;
                        break;
                    }
                    begin++;
                }
            }
        }
        return startIndex;
    }
    
    
    public static int removeDuplicates(int[] nums) {
        HashMap h = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(!h.containsValue(nums[i])){
                h.put(i, nums[i]);
            }else{
                int index = i;
                while(i < nums.length && h.containsValue(nums[i])){
                    i++;
                    if(i < nums.length && !h.containsValue(nums[i])){
                        h.put(i, nums[i]);
                        int temp = nums[index];
                        nums[index] = nums[i];
                        nums[i] = temp;
                        i = index;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return h.size();
    }
    
}
