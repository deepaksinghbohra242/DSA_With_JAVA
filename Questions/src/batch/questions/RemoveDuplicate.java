//12-March-2024 Algorithm
//        Given a sorted array arr[] of size N, the task is to remove the duplicate elements from the array.
//
//        Examples:
//
//        Input: arr[] = {2, 2, 2, 2, 2}
//        Output: arr[] = {2}
//        Explanation: All the elements are 2, So only keep one instance of 2.
//
//        Input: arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}
//        Output: arr[] = {1, 2, 3, 4, 5}
package batch.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
//    static void removeDuplicate(int arr[]){
//        int ar1[] = new int[arr.length];
//        int i=0;
//        for(int j =0 ; j< arr.length;j++){
//            for(int k=0;k < ar1.length ;k++){
//                if
//            }
//        }
//    }
    public static void main(String[] args) {
        int arr[] = {2,2,2,2,2};
//        removeDuplicate(arr);
        int ar1[] = new int[5];
        System.out.println(ar1[1]);
    }

    public static class MinimumAbsDiff {

        private static List<List<Integer>> minimumAbsoluteDifference(int[] arr) {
            int mn = Integer.MAX_VALUE;
            List<List<Integer>> res = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    mn = Math.min(mn , Math.abs(arr[i]-arr[j]));
                }
            }

            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(Math.abs(arr[i]-arr[j]) == mn){
                        List<Integer> p = new ArrayList<>();
                        p.add(arr[i]);
                        p.add(arr[j]);
                        res.add(p);
                    }
                }
            }
            return res;
        }

        private static List<List<Integer>> minimumAbsoluteDifference2(int[] arr){
            Arrays.sort(arr);
            int mn = Integer.MAX_VALUE;
            List<List<Integer>> res = new ArrayList<>();
            for(int i=1;i<arr.length;i++){
                mn = Math.min(mn,arr[i]-arr[i-1]);
            }
            for(int i=1;i<arr.length;i++){
                if(arr[i]-arr[i-1] == mn){
                    List<Integer> p = Arrays.asList(arr[i-1],arr[i]);
                    res.add(p);
                }
            }
            return res;
        }
        public static void main(String[] args) {
            int [] arr = {4,2,1,3};
            List<List<Integer>> res = minimumAbsoluteDifference2(arr);
            System.out.println(res);
        }


    }
}
