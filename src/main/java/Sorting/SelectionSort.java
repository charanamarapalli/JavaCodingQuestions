package Sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[]={5,1,3};
        selectionSort(arr);
        for(int a:arr){
            System.out.println(a);
        }

    }

    public static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}
