package classes.bitmanipulation;

public class OddAppearing {
    static void oddNonRepeat(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count % 2 !=0){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {3,4,4,5,2,3,4,5};
        oddNonRepeat(arr);
//        int res = 0;
//        for(int i = 0;i< arr.length;i++){
//            res = res ^ arr[i];
//        }
//        System.out.println(res);
    }
}
