package recurssion;

import java.util.Collections;

public class ReverseAnArray {

    static void reverseAnArrayUsingRecursion(int arr[], int a){
        int temp;
        if(a>=arr.length-1-a) return;

            temp=arr[a];
            arr[a]= arr[arr.length-1-a];
            arr[arr.length-1-a] = temp;
            reverseAnArrayUsingRecursion(arr, a+1);
        }

    static void reverseAnArrayUsingRecursionTwoPointers(int arr[], int a, int n){
        int temp;
        if(a>=n) return;

        temp=arr[a];
        arr[a]= arr[n];
        arr[n] = temp;
        reverseAnArrayUsingRecursionTwoPointers(arr, a+1, n-1);
    }


    public static void main(String args[]){
        int arr[] = new int[]{1,2,3,4,5,6};


        //System.out.println(arr[0]);

        int start=0;
        int end=arr.length-1;

        reverseAnArrayUsingRecursion(arr,start);
        reverseAnArrayUsingRecursionTwoPointers(arr,start,end);

        for(int i=0;i<=end;i++){
            System.out.println(arr[i]);
        }

    }
}
