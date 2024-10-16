package classes.maths;

public class HCF {
    static int hcf(int a , int b){
        int n  = Math.min(a,b);
        for(int i=n;i>=2;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }

    static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int val = hcf(18,12);
        System.out.println(val);
    }
}
