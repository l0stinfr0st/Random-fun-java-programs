public class breakExample {
    public static void main(String[] args) {
        boolean IsCorrect = true;
        int num = 0;
        
        while(IsCorrect){
            System.out.println(num);
            num++;
            if(num==5){
                break;//IsCorrect = false;
            }
        }
    }
}
