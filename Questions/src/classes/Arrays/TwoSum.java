package classes.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {

//    static void twoSum(int arr[] , int x){
//        Arrays.sort(arr);
//        int i = 0;
//        int j = arr.length -1;
//        while(i <= j){
//            if(arr[i] + arr[j] == x){
//                break;
//            } else if (arr[i] + arr[j] < x) {
//                i++;
//            }else{
//                j--;
//            }
//        }
//        System.out.println(i + " " + j);
//    }

    static void twoSum(int []arr ,int x){
        Set<Integer> s = new HashSet<>();
        s.add(arr[0]);
        for(int i=1;i< arr.length;i++){
            if(s.contains(x-arr[i])){
                System.out.println(arr[i] + " " + (x-arr[i]));
                break;
            }else{
                s.add(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,5,6,7,8};
        int x = 9;
        twoSum(arr,x);
    }
}


