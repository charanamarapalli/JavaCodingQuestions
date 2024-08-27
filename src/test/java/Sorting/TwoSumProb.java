/*
package Sorting.Sorting;

import java.util.HashMap;

public class TwoSumProb {

    public static void main(String[] args) {
        int arr[] = {4, 7, 8, 10, 2, 3, 6};

        method(arr, 5);
    }

    public static void method(int arr[], int sum) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int arr1[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(sum - arr[i])) {
                arr1[0] = hm.get(sum - arr[i]);
                arr[1] = i;
            }
            hm.put(arr[i], i);
        }
        System.out.println(arr1[0]+ " "+ arr[1]);
    }
}
*/
