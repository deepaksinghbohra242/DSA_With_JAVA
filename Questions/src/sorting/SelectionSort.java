package sorting;

public class SelectionSort {
    void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int mnidx = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[j] < arr[mnidx]) {
                    mnidx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mnidx];
            arr[mnidx] = temp;
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
