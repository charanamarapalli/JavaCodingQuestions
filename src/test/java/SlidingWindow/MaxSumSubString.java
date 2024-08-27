package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MaxSumSubString {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        //System.out.println(maxSumOfSize3BruteForce(arr,3));
        /*String a = "abc abcbb";
        System.out.println(longestSubstringWithRepeatedCharacters(a));*/
        String s =" ";
        System.out.println(longestSubstringWithRepeatedCharacters(s));
        String j ="  abcda abcdef  aar";
        System.out.println(longestSubstringWithRepeatedCharacters(j));

    }

    public static int longestSubstringWithRepeatedCharacters(String a) throws IndexOutOfBoundsException{
        Map<Character, Integer> myMap = new HashMap<>();
        int right = 0;
        int left = 0;
        int maxs =0;
        int totalMax = 0;
        /*if(Character.isSpaceChar(a.charAt(right)) && a.length()==0) {
            totalMax = 0;
            return totalMax;
        }*/
        while(right<a.length()){
            /*if(Character.isSpaceChar(a.charAt(right))){
                right++;
                left = right++;
            }*/
            if(!myMap.containsKey(a.charAt(right))){
                myMap.put(a.charAt(right),right);
                maxs = myMap.size();
                totalMax = Math.max(totalMax, maxs);
                right++;
            }

            else{
                myMap.remove(a.charAt(left));
                left++;
            }
        }
        return totalMax;

    }

    public static int maxSumOfSize3BruteForce(int[] arr, int k) {

        int maxSum = Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i <= arr.length-k; i++) {
            for (int j = i; j < arr.length; j++) {
                sum=sum+arr[j];
                if(j-i+1 ==k){
                    maxSum = Math.max(sum,maxSum);
                    sum=0;
                    break;
                }
            }
        }

        return maxSum;

    }
}
