package classes.maths;

public class PrimeNumber {

    static boolean prime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        // prime number
        int n  = 4;
        System.out.println(prime(n));

    }
}


