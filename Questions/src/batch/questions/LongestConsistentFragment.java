package batch.questions;

import java.util.HashSet;
import java.util.Set;

public class LongestConsistentFragment {
    public static void main(String[] args) {
        int[] A = {23, 333, 33, 30, 0, 505};
        System.out.println(longestConsistentFragment(A));
    }

    private static int longestConsistentFragment(int[] arr) {
        int n = arr.length;
        int maxLen = 0;

        for(int i=0;i<n;i++){
            Set<Character> uniqueDigits = new HashSet<>();
            int curLen = 0;

            for(int j=i ; j<n; j++){
                Set<Character> digits = getDigits(arr[j]);
                uniqueDigits.addAll(digits);

                if(uniqueDigits.size() > 2){
                    break;
                }
                curLen = j-i+1;
                maxLen = Math.max(curLen , maxLen);
            }
        }
        return maxLen;
    }

    private static Set<Character> getDigits(int num) {
        Set<Character> digitSet = new HashSet<>();
        char[] digits = String.valueOf(Math.abs(num)).toCharArray();

        for (char digit : digits) {
            digitSet.add(digit);
        }

        return digitSet;
    }
}