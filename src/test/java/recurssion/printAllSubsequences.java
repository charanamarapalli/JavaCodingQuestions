package recurssion;

import java.util.ArrayList;

public class printAllSubsequences {

    public static void main(String[] args) throws IndexOutOfBoundsException{
        int arr[] = new int[]{3, 1, 2};
        int sum=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        printSubsequence(0, arr, list, sum);
    }

    static void printSubsequence (int n, int arr[], ArrayList<Integer> list, int sum) {
        if (n == arr.length) {
            if(list.size()>0) {        //Empty list wont be printed
                //System.out.println(sum);
                System.out.println(list);
            }
            return;
        }
        list.add(arr[n]);
        sum=sum+arr[n];
        printSubsequence(n + 1, arr, list, sum);
        list.remove(list.size()-1);
        sum=sum-arr[n];
        printSubsequence(n + 1, arr, list, sum);
    }
}
