//package api.SlidingWindow;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.HashSet;
//
//public class MinimizeTheMaximizeDiff {
//    int id;
//
//    public static void main(String[] args) {
//        /*int nums[]={3,4,2,3,2,1,2};
//        int p=3;
//        System.out.println(minimizeMax(nums,p));*/
//
//        /*int prices[]= {7,1,5,3,6,4};
//        System.out.println(maxProfit(prices));*/
//
//        /*int minArray[] = {3, 1, 2};
//        System.out.println(findMin(minArray));*/
//
//
//       /* int reverseArray[] ={3,1,1,4};
//        reverseAnArray(reverseArray);
//        for(int i=0;i<reverseArray.length;i++){
//            System.out.println(reverseArray[i]);
//        }*/
//
//       /* int arr[] = {1,2,3,4,2,3,1,2};
//        System.out.println(longestSubArray(arr));*/
//
//        /*int nums[]={1,1,1,7,8,9};
//        System.out.println(maximumSubArraySum(nums, 3));*/
//
//        /*int nums[]={1,2,3,4};
//        System.out.println(containsDuplicate(nums));*/
//
//        /*int nums1[] = {};
//        int m = 0;
//        int nums2[] = {1};
//        int n = 1;
//        merge(nums1, m, nums2, n);*/
//
//
//        MinimizeTheMaximizeDiff obj = new MinimizeTheMaximizeDiff();
//        obj.getMethod();
//        obj.setMethod(10);
//        System.out.println(obj.id);
//
//
//
//
//    }
//
//    public static int longestSubArray(int[] arr){
//        int left=0;
//        int right=0;
//        int max = Integer.MIN_VALUE;
//        HashMap<Integer,Integer> hm = new HashMap<>();
//        while(right<arr.length){
//            if(hm.containsKey(arr[right])){
//                hm.remove(arr[left]);
//                left++;
//                right++;
//            }
//            else{
//                hm.put(arr[right],right);
//                max = Math.max(hm.size(), max);
//                right++;
//            }
//        }
//        return max;
//    }
//
//    public static void sumOfEachSubArrayWithSize(int[] arr, int size){
//        int left=0;
//        int right=0;
//        HashMap<Integer, Integer> hm =new HashMap<>();
//        int sum=0;
//
//        while(right<arr.length){
//            if(left<size){
//                sum=sum+arr[right];
//                left++;
//
//
//            }
//
//        }
//
//
//
//    }
//
//    public static int minimizeMax(int[] nums, int p) {
//
//        int arr[] = new int[nums.length - 1];
//        Arrays.sort(nums);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = nums[i + 1] - nums[i];
//        }
//
//        Arrays.sort(arr);
//        int max = 0;
//
//        if (p == 1) {
//            return arr[0];
//        } else {
//
//        }
//        return max;
//    }
//
//
//    public static int maxProfit(int[] prices) {
//        int max = 0;
//
//        for (int i = 0; i < prices.length - 1; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                max = Math.max(prices[j] - prices[i], max);
//            }
//        }
//        return max;
//
//    }
//
//    public static int findMin(int[] arr) {
//        int low = 0;
//        int high = arr.length - 1;
//        int ans = Integer.MAX_VALUE;
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//            if (arr[low] <= arr[mid]) {
//                ans = Math.min(ans, arr[low]);
//                low = mid + 1;
//            } else {
//                ans = Math.min(ans, arr[high]);
//                high = mid - 1;
//            }
//        }
//        return ans;
//    }
//
//    public static int[] recurssion.RecursionMethodfs(int[] arr){
//        int i=0;
//        int j=arr.length-1;
//        while(i<j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }
//
//        return arr;
//    }
//
//    public static long maximumSubArraySum(int[] nums, int k){
//        int i=0;
//        int j=0;
//        int max=0;
//        int sum=0;
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        while(j<nums.length){
//            if(hm.containsKey(nums[j])){
//                sum=sum-nums[i];
//                hm.remove(nums[i]);
//                i=j;
//                /*i++;
//                j++;*/
//                continue;
//            }
//
//            hm.put(nums[j],j);
//            sum=sum+nums[j];
//            if((j-i+1)<k){
//                j++;
//            }
//            else if((j-i+1)==k){
//                max=Math.max(max, sum);
//                sum=sum-nums[i];
//                hm.remove(nums[i]);
//                i++;
//                j++;
//            }
//        }
//        return max;
//    }
//
//
//    public static boolean containsDuplicate(int[] nums) {
//        HashSet<Integer> hs = new HashSet<>();
//        int i=0;
//        while(i<nums.length){
//            if(!hs.add(nums[i])) {
//                return true;
//            }
//            hs.add(nums[i]);
//        }
//        return false;
//
//    }
//
//
//    public static void merge(int[] nums1, int m, int[] nums2, int n) throws ArrayIndexOutOfBoundsException{
//        /*int j=0;
//        int tot= nums1.length;
//        if(tot!=0 && n!=0 ){
//            for(int i=tot-n; i<tot; i++){
//                nums1[i] = nums2[j];
//                j++;
//
//            }
//        }
//
//        if(m==0){
//            for(int i=0;i<nums1.length;i++){
//                nums1[i]= nums2[i];
//            }
//        }
//        Arrays.sort(nums1);
//        for(int i=0;i<nums1.length;i++){
//            System.out.println(nums1[i]);
//        }*/
//
//        int i = m - 1;
//        int j = n - 1;
//        int k = m + n - 1;
//
//        while (j >= 0) {
//            if (i >= 0 && nums1[i] > nums2[j]) {
//                nums1[k--] = nums1[i--];
//            } else {
//                nums1[k--] = nums2[j--];
//            }
//        }
//
//
//        for(int s=0;i<nums1.length;i++){
//            System.out.println(nums1[s]);
//        }
//    }
//
//    public void setMethod(int id){
//        this.id=id;
//    }
//
//    public void getMethod(){
//        System.out.println(id);
//    }
//
//
//}
//
//
//
//
//
//
//
//
