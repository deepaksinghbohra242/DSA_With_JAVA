package batch.questions;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Ques1 {
    public static void main(String[] args) {
        int a = 1;
        int c = a++ + ++a;
        System.out.println(c);
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(1);arr.add(1);arr.add(3);arr.add(2);arr.add(2);arr.add(1);
//        int k = 4;
//        ArrayList<Float> res = solve(arr ,k);
//
////        for(Float r : res){
////            System.out.printf("%.2f\n", r);
////        }
//        for (Float r : res) {
//            System.out.println(r);
//        }
    }

    private static ArrayList<Float> solve(ArrayList<Integer> arr, int k) {
        ArrayList<Float> res = new ArrayList<>();
        int n = arr.size() - k;
        for(int i=0;i<=n;i++){
            float sum = 0.00f;
            int j = i;
            for(int m=0;m<k;m++){
                sum += arr.get(j);
                j++;
            }
            sum /= k;
            BigDecimal bd = new BigDecimal(Float.toString(sum));
            bd = bd.setScale(2, RoundingMode.HALF_UP);
            res.add(bd.floatValue());
        }
        return res;
    }
}
