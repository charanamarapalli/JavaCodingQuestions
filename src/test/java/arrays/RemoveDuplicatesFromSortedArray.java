package arrays;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int arr[]= {10,10,11,11};
		arr=removeDuplicatesFromSortArrayBruteForce(arr);
		int arr1[]=removeDuplicatesFromSortArrayOptimal(arr);
		for(int x:arr) {
			System.out.println(x);
		}
		
		for(int x:arr1) {
			System.out.println(x);
		}
	}

	//o(n) space complexity and o(n) time complexity
	
	//Store everything in hash set
	//Then read every element and put it back in array
	private static int[] removeDuplicatesFromSortArrayBruteForce(int[] arr) {
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0; i<arr.length; i++) {
			hs.add(arr[i]);
		}
		
		int i=0;
		for(int x:hs) {
			arr[i++]=x;
		}
		return arr;
	}
	
	
	//logic involves 
	//take two pointers - i will store unique elements - start from j=1 to n.
	//if value at i not equals to j - then move by 1 and set arr[i]=arr[j]
	//1,2,3,4 -for this array - lets do dry run
	//i=0, j=1 - not same 1!=2 -then increase i by 1 -> i=1, arr[1]=ar[j] which is 2 that meANS SETTING SAME VALUE THERE.
	//i=1, j=2 - not same 2!=3 -then increase i by 1 -> i=1, arr[1]=ar[j] which is 2 that meANS SETTING SAME VALUE THERE.
	//so nothing changes here
	
	//now consider this 0 0 1 1 1 2 2
	//i=0, j=1 - same 0==0 just move j++
	//i=0, j=2 - not same 1!=2 -then increase i by 1 -> i=1, arr[1]=ar[2] which is value 1 set at index 1. -- arr becomes 0 1 1 1 1 2 2
	//i=1, j=3 - same 1==1 just move j++
	//i=1, j=4 - same 1==1 just move j++
	//i=1, j=5 - not same -> increase i by 1-> i=2 set arr[2]=arr[5] -> arr becomes -- 0 1 2 1 1 2 2 
	//i=2, j=6 - same 
	//j=7 - out of index closed
	
	private static int[] removeDuplicatesFromSortArrayOptimal(int[] arr) {
		int i=0;
		int j=1;
		
		while(j<arr.length) {
			if(arr[i]!=arr[j]) {
				i++;
				arr[i]=arr[j];
			}
			j++;
		}
		
		return arr;
		//if asked to return unqiue elements then return i+1;
	}
}
