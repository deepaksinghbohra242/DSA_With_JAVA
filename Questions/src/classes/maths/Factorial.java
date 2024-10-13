package classes.maths;
public class Factorial {
    static int factorial(int n)
    {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }

    static int countTrailingZero(int n){
        int res = 0;
        for(int i=5;i<=n;i*=5){
            res = res + n/i;
        }
        return res;
    }

    public static void main(String[] args) {
//        int n = 15;
//        int res = factorial(n);
//        System.out.println(res);
//        int count = 0;
//        while (res % 10 == 0){
//            count ++;
//            res = res/10;
//        }
//        System.out.println(count);

        System.out.println(countTrailingZero(25));

    }
}
