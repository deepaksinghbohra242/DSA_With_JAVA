package Striver1;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        System.out.println("Armstrong Number : " + armstrongNumber(n));
    }

    private static Boolean armstrongNumber(int n) {
        // num value
        int numSize = String.valueOf(n).length();

        int sum = 0;
        int num = n;
        while(n>0){
            int digit = n%10;
            sum += Math.pow(digit , numSize);
            n = n/10;
        }
        return sum == num ? true : false;
    }
}
