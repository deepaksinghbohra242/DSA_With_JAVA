package sorting;

public class InsertionSort {
    void sort(int arr[]){
        for (int i=0;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    void printArray(int arr[]){
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
