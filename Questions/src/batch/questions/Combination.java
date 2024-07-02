package batch.questions;

import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;

public class Combination {
    public static void main(String[] args) {
        String s = "abc";
        int n = s.length();
        ArrayList<String> res = new ArrayList<>();
        combination(s ,0 , n-1 , res);
        res.stream().forEach(System.out::println);
    }

    private static void combination(String s , int first , int last , ArrayList<String> res) {
        if(first == last){
            res.add(s);
        }else{
            for(int i=first ;i<=last;i++){
                s = swap(s,first,i);
                combination(s,first+1,last,res);
                s = swap(s,first,i);
            }
        }
    }

    private static String swap(String s, int first, int i) {
        char [] arr = s.toCharArray();
        char temp = arr[first];
        arr[first] = arr[i];
        arr[i] = temp;
        return String.valueOf(arr);
    }

}
