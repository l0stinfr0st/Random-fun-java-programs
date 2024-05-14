public class tuition {
    public static void main(String[] args) {
        
        double tuition = 10000;
        int count = 0;
        while(tuition < 20000){
        tuition = tuition * 1.07;
        count++;
        }
        System.out.println(count);    
        
    
    }    
}
