package batch.questions;

import java.util.HashMap;
import java.util.Map;

public class Ques2 {


    //[1,1,4,5,6,4,7,5,5,5,5,5,5,4,5,2,4,4] ///
    public static void main(String[] args) {
        int [] arr = {1,1,4,5,6,4,5,7,4,5,5,5,5,5,5,5,6,4,5,3,5,2,};
        int n = arr.length;
        int count  = consecutiveCount(arr , n);
//        System.out.println(count);
    }

    private static int consecutiveCount(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1);
            if(i<n-1 && arr[i] == arr[i+1]){
                i++;
            }
        }
        int mx = map.get(arr[0]);
        int res = arr[0];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(mx < entry.getValue()){
                mx = entry.getValue();
                res = entry.getKey();
            }
        }
        System.out.println("Number " + mx);
        System.out.println("Frequency " + res);
        return res;

/*
        int max_freq = 0;
        int max_num = arr[0];

        for(int i=0;i<n;i++){
            int freq = 1;
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    freq++;
                    j++;
                }
               *//* if (j < n - 1 && arr[j] == arr[j + 1]) {
                    j++;
                }*//*
            }
            if(freq > max_freq){
                max_num = arr[i];
                max_freq = freq;
            }
        }
        System.out.println("Number " + max_num);
        System.out.println("Frequency " + max_freq);
        return max_num;*/
    }
}
