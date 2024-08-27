//package recurssion;
//
//import java.util.*;
//public class printSubSequenceWithGivenSum {
//    public static void printSubsequence(int[] arr, int indx, ArrayList<Integer> ds, int sum, int s){
//        // base case
//        if(indx==arr.length){
//            if(ds.size()>0 && sum==s){
//                System.out.println(ds);
//            }
//            return ;
//        }
//        ds.add(arr[indx]);// add to array list
//        s+=arr[indx];
//        printSubsequence(arr, indx+1, ds, sum, s);  // pick an element
//        ds.remove(ds.size()-1);// remove from array list
//        s-=arr[indx];
//        printSubsequence(arr, indx+1, ds, sum, s);// not pick
//
//    }
//    public static void main(String[] args) {
//        int[] arr= {1,2,3};
//        int sum=3;
//        int s=0;
//        ArrayList<Integer> ds= new ArrayList<>();
//        printSubsequence(arr, 0, ds, sum, s);
//
//    }
//}
