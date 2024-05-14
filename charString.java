public class charString {
    public static void main(String[] args) {
        String str = "acbeebca";
        
        boolean isSymmetrical = true;
        
        int low = str.charAt(0);
        int high = str.charAt(str.length()-1);

        while(low < high){
        char a = str.charAt(low);
        char b = str.charAt(high);

        if(a!=b){
            isSymmetrical = false;
            break;
        }
        low++;
        high++;
        
        if(isSymmetrical){
            System.out.println(str);
            
        }
        }
    }
    
}
