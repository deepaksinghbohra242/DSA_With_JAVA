package Striver1;

import java.util.ArrayList;

//  Given an integer N, return all divisors of N.
public class AllDivisor {
    public static void main(String[] args) {
        int number = 12;
        ArrayList<Integer> divisors = findDivisors(number);

        System.out.print("Divisors of " + number + " are: ");
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
        System.out.println();
    }

    private static ArrayList<Integer> findDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        int sqt = (int) Math.sqrt(n);
        for(int i=1 ; i<=sqt ; i++){
            if(n%i == 0){
                divisors.add(i);
                if(n/i != i ){
                    divisors.add(n/i);
                }
            }
        }
        return divisors;
    }
}
