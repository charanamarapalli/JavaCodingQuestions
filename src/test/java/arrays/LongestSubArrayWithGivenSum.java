package arrays;

public class LongestSubArrayWithGivenSum {

	public static void main(String[] args) {
		int arr[]= {5,5,1,2,2,3,1,1};
		System.out.println(longestSubArrayBruteForceNPower3(arr, 10));
	}
	
	//Brute force 1 - finding out all sub arrays
	public static int longestSubArrayBruteForceNPower3(int arr[], int target) {
		int max=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					sum+=arr[k];
				}
				if(sum==target) {
					max=Math.max(max, j-i+1);
				}
			}
		}
		return max;
	}
	
	//Brute Force o(n2)-
	//for int i=0 - start inner loop from i to n ->add every element.
	//if current count same as target - update the max - break
	//if current count more than target - Break there by making current count to 0.
	public static int longestSubArrayBruteForce(int arr[], int target) {
		int currentCount=0;
		int max=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				currentCount+=arr[j];
				if(currentCount==target) {
					max=Math.max(max, j-i+1);
					break;
				}
				else if(currentCount>target) {
					currentCount=0;
					break;
				}	
			}
		}
		return max;
	}
	
	//Two Pointers
	public static int longestSubArray(int arr[], int target) {
		int max=0;
		
		
		return max;
	}
	
}
