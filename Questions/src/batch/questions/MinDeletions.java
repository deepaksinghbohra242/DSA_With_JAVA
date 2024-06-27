package batch.questions;

public class MinDeletions {
    public static void main(String[] args) {
        String s = "BBABAA";
        int n = s.length();
        int res = Solution(s,n);
        System.out.println(res);
    }

    private static int Solution(String S, int N) {

        // Prefix count of 'B's
        int[] bCount = new int[N + 1];
        // Suffix count of 'A's
        int[] aCount = new int[N + 1];

        // Fill the prefix counts of 'B'
        for (int i = 1; i <= N; i++) {
            bCount[i] = bCount[i - 1] + (S.charAt(i - 1) == 'B' ? 1 : 0);
        }

        // Fill the suffix counts of 'A'
        for (int i = N - 1; i >= 0; i--) {
            aCount[i] = aCount[i + 1] + (S.charAt(i) == 'A' ? 1 : 0);
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i <= N; i++) {
            int deletions = bCount[i] + aCount[i];
            res = Math.min(res, deletions);
        }

        return res;
    }
}
