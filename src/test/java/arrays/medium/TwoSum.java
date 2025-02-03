package arrays.medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int arr[]= {1,2,3,6,7};
		int[] out= twoSumHashing(arr, 2);
		System.out.println("value 1: "+out[0]+" Value 2: "+out[1]);
		System.out.println(twoSum(arr, 5));
	}
	
	//Brute force
	public static int[] twoSumBruteForce(int[] arr, int k) {
		int sol[]= {-1,-1};
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==k) {
					sol[0]=i;
					sol[1]=j;
					break;
				}
			}
		}
		return sol;
	}
	
	//Hashing - Will works for duplicate values which i confused earlier - beacuse we are adding only 1 duplicate into hash map
	//Before adding second once, we are already validating
	public static int[] twoSumHashing(int[] arr, int k) {
		int sol[]= {-1,-1};
		HashMap<Integer, Integer> hm=new HashMap<>();
		for(int i=0; i<arr.length-1; i++) {
			int diff=k-arr[i];
			if(hm.containsKey(diff)) {
				sol[0]=hm.get(diff);
				sol[1]=i;
			}
			hm.put(arr[i], i);
		}
		return sol;
	}
	
	//Two Pointers
	//Sort the array
	//We cannot return indexes using this. We can only return yes or no.
	public static boolean twoSum(int[] arr, int k) {
		
		int i=0;
		int j=arr.length-1;
		Arrays.sort(arr);
		while(j<arr.length) {
			if(arr[i]+arr[j]==k) {
				return true;
			}
			else if(arr[i]+arr[j]>k) {
				j--;
			}
			else{
				i++;
			}
		}
		return false;
	}
}
