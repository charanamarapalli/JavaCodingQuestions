package Sorting;

public class QuickSort {

    public static void main(String[] args) {
        int arr[]={3,6,10,9,8,7};
        quickSort(arr, 0, arr.length-1);

        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low<high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }

    }

    private static int partition(int[] arr, int low, int high) {
        int pindx=low-1;
        for(int i=low;i<high;i++){
            if(arr[i]<arr[high]){
                pindx++;
                int temp=arr[pindx];
                arr[pindx]=arr[i];
                arr[i]=temp;
            }
        }

        pindx++;
        int temp=arr[high];
        arr[high]=arr[pindx];
        arr[pindx]=temp;
        return pindx;
    }
}
