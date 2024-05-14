public class evenSum {
    public static void main(String[] args) {
        
        int sum = 0;
        int num = 0;
        
        while(num<20){
            num++;
            if(num%2==1){
                sum+=num;
            }
        }
        System.out.println(sum);
    }
    
}
