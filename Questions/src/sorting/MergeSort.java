package sorting;

public class MergeSort {
    private static void mergeSort(int[] arr, int low , int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }
    private static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid-low+1;
        int n2 = high-mid;
        int [] l = new int[n1];
        int [] r = new int[n2];

        for(int i=0;i<n1;i++){
            l[i]= arr[low+i];
        }
        for(int j=0;j<n2;j++){
            r[j] = arr[mid+j+1];
        }

        int i=0 , j=0, k = low;
        while(i<n1 && j<n2){
            if(l[i] <= r[j]){
                arr[k] = l[i];
                i++;
            }else{
                arr[k] = r[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = l[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k] = r[j];
            k++;
            j++;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        mergeSort(arr,0, n-1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }


    static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
