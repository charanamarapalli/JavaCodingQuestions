package recurssion;

import java.util.ArrayList;

public class printOneSubSequence {

    public static void main(String[] args) throws IndexOutOfBoundsException{
        int arr[] = new int[]{3, 1, 2};
        ArrayList<Integer> list = new ArrayList<Integer>();
        printSubsequence(0, arr, list);
    }

    static boolean printSubsequence (int n, int arr[], ArrayList<Integer> list) {
        if (n == arr.length) {
            if(list.size()>0) {        //Empty list wont be printed
                System.out.println(list);
                return true;
            }
            return false;
        }
        list.add(arr[n]);

        if(printSubsequence(n + 1, arr, list)==true)
            return true;
        list.remove(list.size()-1);
        if(printSubsequence(n + 1, arr, list)==true)
            return true;

        else return false;
    }
}
