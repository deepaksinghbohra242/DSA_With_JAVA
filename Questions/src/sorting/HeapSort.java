package sorting;

public class HeapSort {

    private static void heapSort(int[] arr) {
        int n = arr.length;

        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
        for(int i=n-1;i>0;i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr,i,0);
        }
    }
    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int low = 2*i +1 ;
        int high = 2*i +2;

        if(low < n && arr[low] > arr[largest]){
            largest = low;
        }
        if(high < n && arr[high] > arr[largest]){
            largest = high;
        }
        if(largest != i ){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    static void printArray(int arr[])
    {
        int N = arr.length;

        for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver's code
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int N = arr.length;

        heapSort(arr);
        System.out.println("Sorted array is");
        printArray(arr);
    }
}
