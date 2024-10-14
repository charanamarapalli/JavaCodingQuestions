package recurssion;

import java.util.ArrayList;

public class RecursionMethodfs {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        /*int start=0;
        reverseArray(arr, start);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }

        printAllSubArrays(arr);
        */
        ArrayList<Integer> list= new ArrayList<>();

        int arr1[]={1,2,3};
        //printAllSubsequences(arr1, 0, list);
        System.out.println(countAllSubSequences(arr1, 0,list));

        subSequenceWithGivenSum(arr,0,list,6,0);



    }

    private static void printAllSubsequences(int[] arr, int i, ArrayList<Integer> list) {

        if(i>=arr.length) {
            if(list.isEmpty()){
                return;
            }
            System.out.println(list);
            return;

        }

        list.add(arr[i]);
        printAllSubsequences(arr,i+1, list);
        list.remove(list.size()-1);
        printAllSubsequences(arr,i+1, list);
    }

    private static Integer countAllSubSequences(int[] arr, int i, ArrayList<Integer> list) {

        if(i>=arr.length) {
            if(list.isEmpty()){
                return 0;
            }
            return 1;

        }

        list.add(arr[i]);
        int x=countAllSubSequences(arr,i+1, list);
        list.remove(list.size()-1);
        int y= countAllSubSequences(arr,i+1, list);
       return x+y;
    }

    private static void subSequenceWithGivenSum(int[] arr, int i, ArrayList<Integer> list, int sum, int presentSum) {

        if(i>=arr.length) {
            if(list.isEmpty()){
                return ;
            }

            if(presentSum==sum){
                System.out.println(list);
                return;
            }
        }

        list.add(arr[i]);
        presentSum+=arr[i];
        subSequenceWithGivenSum(arr,i+1, list, sum, presentSum);
        list.remove(list.size()-1);
        presentSum-=arr[i];
        subSequenceWithGivenSum(arr,i+1, list, sum, presentSum);
    }

    public static void reverseArray(int arr[], int start){

        if(start >= arr.length/2){
            return;
        }
        int temp=arr[start];
        arr[start]= arr[arr.length-1-start];
        arr[arr.length-1-start]= temp;

        reverseArray(arr,start+1);
    }

    public static void printAllSubArrays(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.println(arr[k]+ " ");
                }
                System.out.println();
            }
        }
    }


}
