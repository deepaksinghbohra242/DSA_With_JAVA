package Striver1.array;

public class RotateArray {
    public static void main(String args[]) {
        int n = 7;
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        Rotatetoright(arr, n, k);
        System.out.println("After Rotating the elements to right ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
//        Rotatetoleft(arr,n,k);
//        System.out.println("After Rotating the elements to right ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }

    public static void reverse(int [] arr , int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]   = temp;
            start++;
            end--;
        }
    }

    private static void Rotatetoright(int[] arr, int n, int k) {
        reverse(arr , 0 , n-k-1);
        reverse(arr , n-k , n-1);
        reverse(arr,0,n-1);
    }
    private static void Rotatetoleft(int[] arr, int n, int k) {
        reverse(arr , 0, k-1);
        reverse(arr,k,n-1);
        reverse(arr,0, n-1);
    }
}
