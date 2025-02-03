package arrays;

import java.util.Arrays;

public class GetSecondLargestElementInAnArray {

	public static void main(String[] args) {
		System.out.println(getSecondLargestElementOptimal2(new int[] {10,10,10}));
	}
	
	//O(NLogN) time complexity - Works only if no duplicates in the array
	public static int getSecondLargestElementInArrayBruteForce(int[] arr) {
		Arrays.sort(arr);
		if(arr.length<2) {
			return -1;
		}
		
		return arr[arr.length-2];
	}
	
	//O(N) time complexity - Looping through 2 times 
	//Note - largest element should be initialized with Integer.MIN_VALUE at first. this is the main logic to understand.
	//first loop - find largest element
	//second loop - find largest element but not equals to largest1
		public static int getSecondLargestElementOptimal1(int[] arr) {
			int largest=Integer.MIN_VALUE;
			int second_largest=Integer.MIN_VALUE;
			for(int i=0; i<arr.length; i++) {
				if(arr[i]>largest) {
					second_largest=largest;
					largest=arr[i];
				}
				else if(arr[i]<largest && arr[i]>second_largest) {
					second_largest=arr[i];
				}
			}
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i]>second_largest && arr[i]!=largest) {
					second_largest=arr[i];
				}
			}
			return second_largest;
		}
		
		//o(N) approach with single loop
		public static int getSecondLargestElementOptimal2(int[] arr) {
			int largest=Integer.MIN_VALUE;
			int second_largest=Integer.MIN_VALUE;
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i]>largest) {
					second_largest=largest;
					largest=arr[i];
				}
				else if(arr[i]<largest && arr[i]>second_largest) {
					second_largest=arr[i];
				}
			}
			return second_largest!=Integer.MIN_VALUE?second_largest:-1;
		}
}
