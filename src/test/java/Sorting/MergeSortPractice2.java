package Sorting;

public class MergeSortPractice2 {

    public static void main(String[] args) {
        int arr[]={3,6,10,9,8,7};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    private static void mergeSort(int[] arr, int start, int end) {
            while(start>=end){
                return;
            }

        System.out.println("runong");
            int mid=(start+end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            conquer1(arr,start,mid,end);

    }

    private static void conquer1(int[] arr, int start, int mid, int end) {
        int merger[]=new int[end-start+1];
        int i=0;
        int indx1=start;
        int indx2=mid+1;
        while(indx1<=mid && indx2<=end){
            if(arr[indx1]<arr[indx2]){
                merger[i]=arr[indx1];
                i++;
                indx1++;
            }
            else if(arr[indx1]> arr[indx2]){
                merger[i]=arr[indx2];
                i++;
                indx2++;
            }

        }

        while(indx1<=mid){
            merger[i]=arr[indx1];
            i++;
            indx1++;

        }

        while(indx2<=mid){
            merger[i]=arr[indx2];
            i++;
            indx2++;
        }

        for(int a=0,j=start;a<merger.length;a++,j++){
            arr[j]=merger[a];
        }


    }
}
