package dsasheet;
// Reverse the array
public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverseArrayExtraArray(arr);
        for (int a:arr) {
            System.out.print(a + " ");
        }
    }

    private static void reverseArrayExtraArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
