package Sorting;

public class MergeSort {

    public static void main(String[] args) {
        int arr[]= {4,3,2,1};
        divide(arr, 0, arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }

    }

    public static void divide(int []arr, int start, int end){
        while(start>=end){
            return;
        }

        int mid = (start +end)/2;

        divide(arr, start, mid);
        divide(arr,mid+1, end);
        conquer(arr,start,mid,end);


}

    public static void conquer(int[] arr, int start, int mid, int end) {
        int[] merger= new int[end-start+1];
        int index1=start;
        int index2=mid+1;
        int x=0;

        System.out.println("Arraye length is"+ merger.length);

        while(index1<=mid && index2<=end){
            if(arr[index1]>arr[index2]){
                merger[x]=arr[index2];
                x++;
                index2++;
            }

            else{
                merger[x]=arr[index1];
                x++;
                index1++;
            }
        }

        while(index1<=mid){
            merger[x]=arr[index1];
            x++;
            index1++;
        }

        while(index2<=end){
            merger[x]=arr[index2];
            x++;
            index2++;
        }

        for(int i=0, j=start;i<merger.length;i++, j++){
            arr[j]=merger[i];
        }
    }
    }
