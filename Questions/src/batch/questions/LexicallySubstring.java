package batch.questions;

import java.util.Hashtable;

public class LexicallySubstring {
    public static String minimalString(String s){
        int[] arr = new int[26];

        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0) {
                return Character.toString((char) ('a' + i));
            }
        }
        int minFreq = Integer.MAX_VALUE;
        int minCharIndex = 0;

        for (int i = 0; i < 26; i++) {
            if (arr[i] < minFreq) {
                minFreq = arr[i];
                minCharIndex = i;
            }
        }

        char smallestChar = (char) ('a' + minCharIndex);
        return Character.toString(smallestChar) + Character.toString(smallestChar);
    }

    public static void main(String[] args) {
        String s = "a";
        s = minimalString(s);
        System.out.println(s);  // Output should be "aa" since all characters are present.
    }
}
