package classes.bitmanipulation;

public class OddAppearing {
    public static void main(String[] args) {
        int [] arr = {3,4,5,2,3,4,5};
        int res = 0;
        for(int i = 0;i< arr.length;i++){
            res = res ^ arr[i];
        }
        System.out.println(res);
    }
}
