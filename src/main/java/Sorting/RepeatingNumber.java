//package Sorting.Sorting;
//
//import java.util.*;
//
//public class RepeatingNumber {
//
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 2, 4};
//
//        missingNumber(arr, arr.length);
//
//        //missingNumber2(arr, arr.length);
//
//        /*int arr1[]={1,3,5,7};
//        int arr2[]={2,4,6,8};
//
//        mergeSortedArrays(arr1, arr2);*/
//
//        /*int arr3[]={-1,-2,2,3,-1,-3,8};
//
//        subArrayWithMaxSum(arr3);*/
///*
//        char str[] = {'a', 'b', 'c', 'd'};
//
//
//        subString(str, str.length);
//
//        int arr1[]= {1,2,3};
//        subArrays(arr1, arr1.length);*/
//
//        //System.out.println(pascalTriangle(2));
//
//        //printStars(3);
//
//        //System.out.println(pascalTriangle2(4));
//
//    }
//
//    public static void missingNumber(int arr[], int n) {
//        int temp[] = new int[n];
//
//        int a = -1;
//        int b = -1;
//
//        for (int i = 0; i < n; i++) {
//            temp[arr[i] - 1]++;
//            if (temp[arr[i] - 1] > 1) {
//                a = arr[i];
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (temp[i] == 0) {
//                b = i + 1;
//                break;
//            }
//        }
//
//        System.out.println("rep is " + a + "and miss is " + b);
//    }
//
//
//    public static void missingNumber2(int arr[], int n) {
//        Arrays.sort(arr);
//        int a = -1;
//        int b = -1;
//        for (int i = 0; i < n - 1; i++) {
//            if (arr[i] == arr[i + 1]) {
//                System.out.println("rep num " + arr[i]);
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] != (i + 1)) {
//                System.out.println(i + 1 + "MIssing num ");
//            }
//        }
//    }
//
//    public static void mergeSortedArrays(int arr1[], int arr2[]) {
//        for (int i = 0; i < arr1.length; i++) {
//
//            for (int j = 0; j < arr2.length; j++) {
//                if (arr1[i] < arr2[j]) {
//                    break;
//                }
//
//                if (arr1[i] > arr2[j]) {
//                    int temp = arr1[i];
//                    arr1[i] = arr2[j];
//                    arr2[j] = temp;
//
//                    Arrays.sort(arr2);
//                }
//            }
//        }
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }
//
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
//        }
//
//    }
//
//    public static void subArrayWithMaxSum(int arr[]) {
//        int maxSum = arr[0];
//        int currSum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            currSum += arr[i];
//            if (currSum > maxSum) {
//                maxSum = currSum;
//            }
//            if (currSum < 0) {
//                currSum = 0;
//            }
//        }
//
//        System.out.println("maxsum is " + maxSum);
//
//    }
//
//
//    public static void reArrangeArray(int arr[]) {
//        Map<Integer, Integer> hm = new HashMap<>();
//        Set<Integer> has = new HashSet<>();
//
//    }
//
//    public static void subStrings(String s) {
//        for (int i = 0; i < s.length() - 1; i++) {
//            for (int j = i + 1; j < s.length(); j++) {
//                System.out.println(s.substring(i, j));
//            }
//        }
//    }
//
//    public static void subString(char str[], int n) {
//        // Pick starting point
//        for (int len = 1; len <= n; len++) {
//            // Pick ending point
//            for (int i = 0; i <= n - len; i++) {
//                //  Print characters from current
//                // starting point to current ending
//                // point.
//                int j = i + len - 1;
//                for (int k = i; k <= j; k++) {
//                    System.out.print(str[k]);
//                }
//
//                System.out.println();
//            }
//        }
//    }
//
//    public static void subArrays(int arr[], int n) {
//        n = arr.length;
//        for (int i = 0; i < n; i++) //This loop will select start element
//        {
//            for (int j = i; j < n; j++) // This loop will select end element
//            {
//                for (int k = i; k <= j; k++) //This loop will print element from start to end
//                {
//                    System.out.print(arr[k] + " ");
//                }
//                System.out.println();
//            }
//        }
//
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (Map.Entry<String, Integer> asd : hm.entrySet()) {
//
//        }
//
//        for (String id : hm.keySet()) {
//
//        }
//
//
//    }
//
//    public static ArrayList<ArrayList<Integer>> pascalTriangle(int numRows) {
//
//        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
//        if (numRows <= 0) return result;
//        ArrayList<Integer> first = new ArrayList<Integer>();
//        first.add(1);
//        result.add(first);
//        for (int i = 1; i < numRows; i++) {
//            ArrayList<Integer> before = result.get(i - 1);
//            ArrayList<Integer> now = new ArrayList<Integer>();
//            now.add(1);
//            for (int j = 1; j < i; j++) {
//                now.add(before.get(j - 1) + before.get(j));
//            }
//            now.add(1);
//            result.add(now);
//        }
//        return result;
//    }
//
//    public static ArrayList<ArrayList<Integer>> pascalTriangle2(int numRows) {
//        ArrayList<ArrayList<Integer>> parent = new ArrayList<ArrayList<Integer>>();
//
//        for(int i=0;i<numRows;i++){
//            ArrayList<Integer> list = new ArrayList<>();
//
//            for(int j=0;j<=i;j++){
//                list.add(factorial(i) / (factorial(i-j) * factorial(j)));
//            }
//            parent.add(list);
//        }
//        return parent;
//
//
//    }
//
//    public static int factorial(int n){
//        if(n==0){
//            return 1;
//        }
//
//        return n * factorial(n-1);
//    }
//}
//
