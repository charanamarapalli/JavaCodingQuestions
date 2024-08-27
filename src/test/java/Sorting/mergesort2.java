package Sorting;

public class mergesort2 {
    static void mergeSort(int arr[],int p,int r){
        if(p<r){
            int m=(p+r)/2;
            mergeSort(arr,p,m);
            mergeSort(arr,m+1,r);


        }

    }
    static void Sort(int arr[],int a,int b, int c){

        int n1=b-a+1;
        int n2=c-b;
        int l1[]=new int[n1];
        int l2[]=new int[n2];
        for(int i=0;i<n1;i++){

        }
    }
    public static void main(String[] args) {
       int arr[]={3,2,1};
       mergeSort(arr,0,arr.length-1);
    }
}
