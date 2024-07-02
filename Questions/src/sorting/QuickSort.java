package sorting;

public class QuickSort {
    private static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int pi = partition(arr , low ,high);

            quickSort(arr, low ,pi-1);
            quickSort(arr,pi+1 , high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for(int j=low ; j<high;j++){
            if(arr[j] < pivot){
                i++;
                swap(arr , i , j);
            }
        }
        swap(arr ,i+1 , high);
        return i+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        quickSort(arr,0, n-1);
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
