package classes.maths;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,7};
//        int res[] = new int[arr.length];
//        int j = 0;
//        for(int i= arr.length-1;i>0;i--){
//            res[j] = arr[i];
//            j++;
//        }
        int i =0;
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}


