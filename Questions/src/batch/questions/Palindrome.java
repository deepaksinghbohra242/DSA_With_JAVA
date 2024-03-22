package batch.questions;

public class Palindrome {
    static  boolean Palind (String s){
        int j = s.length()-1;
        for(int i=0 ; i <= j;i++){
            if(s.charAt(i) != s.charAt(j) ){
                return false;
            }
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "saaes";
        if(Palind(s)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
