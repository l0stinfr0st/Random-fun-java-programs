import java.util.Scanner;

public class fibseq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter nth term: ");
        int n = input.nextInt();
        
        System.out.println(fibSeq(n));
        
        
    }
    public static int fibSeq(int n){
        int num = 0;
        int store = 1;
        int prev = 1;
        if(n == 1 || n == 2){
            return 1;
        }else{
            for (int i = 2; i < n; i++) {
                num = prev+store;
                prev = store;
                store = num;
            }
        }
        return num;
    }
   
}
