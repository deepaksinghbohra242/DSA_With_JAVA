package classes.maths;

public class Tut2 {

//    static int fact(int n){
//        if(n == 1) return 1;
//        return f(n-1) + f(n-2) ;
//    }

    static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {

    }
}
