package recurssion;

import java.util.ArrayList;

public class CombinationOfSubsequences {

    static void sequensse(int arr[], int index, int target, ArrayList<Integer> list){
        //base condition
        if(index==arr.length) {
            if (target==0) {
                System.out.println(list);
            }
            return;
        }

        if(arr[index]<=target) {
            list.add(arr[index]);
            sequensse(arr, index, target - arr[index], list);
            list.remove(list.size()-1);
        }
        sequensse(arr,index+1, target, list);
    }

    public static void main(String[] args) {
        int arr[] = new int []{1,2};
        int index=0;
        int target=2;
        ArrayList<Integer> list = new ArrayList<Integer>();
        sequensse(arr, index, target, list);
    }
}
