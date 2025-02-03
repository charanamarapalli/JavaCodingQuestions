package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class UnionOf2SortedWithDuplicates {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4};
		int arr2[]= {1,1,2,3,4};
		int arr3[]= unionOfTwoSortedArraysUsingHashMap(arr1, arr2);
		ArrayList<Integer> list= unionOfTwoSortedArraysUsingTwoPointers(arr1, arr2);

		System.out.println("Method 1: ");
		for(int x:list) {
			System.out.print(x+" ");
		}
		System.out.println("Method 2: ");
		for(int x:arr3) {
			System.out.print(x+ " ");
		}
	}
	
	
	
	public static ArrayList<Integer> unionOfTwoSortedArraysUsingTwoPointers(int[] arr1, int[] arr2) {
		int i=0;
		int j=0;
		ArrayList<Integer> list=new ArrayList<>();
		while(i<arr1.length && j<arr2.length) {
//			if(list.size()!=0) {
//					if(list.get(list.size()-1)==arr1[i]) {
//						i++;
//						continue;
//					}
//					if(j!=0 && list.get(list.size()-1)==arr1[j]) {
//						j++;
//						continue;
//					}
//			}
			if(arr1[i]==arr2[i]) {
				if(list.size()!=0 && list.get(list.size()-1)==arr1[i]) {
					i++;
					j++;
					continue;
				}
				list.add(arr1[i]);				
				i++;
				j++;
			}
			else if(arr1[i]<arr2[j]) {
				if(list.size()!=0 && list.get(list.size()-1)==arr1[i]) {
					i++;
					continue;
				}
				list.add(arr1[i]);
				i++;
			}
			else {
				if(list.size()!=0 && list.get(list.size()-1)==arr2[j]) {
					j++;
					continue;
				}
				list.add(arr2[j]);
				j++;
			}
		}
		
		while(i<arr1.length) {
			list.add(arr1[i]);
			i++;
		}
		while(j<arr2.length) {
			list.add(arr2[j]);
			j++;
		}
		return list;
	}
	
	public static int[] removeDuplicates(int[] arr) {
		int i=0;
		for(int j=1; j<arr.length; j++) {
			if(arr[j]!=arr[i]) {
				i++;
				arr[i]=arr[j];
			}
		}
		
		for(int x:arr) {
			System.out.print(x+ " ");
		}
		
		return arr;
	}
	
	
	
	//Logic involves - instead of sorting the array later on which takes nlogn time complexity -- its better to arrange the array earlier itself
	public static int[] unionOfTwoSortedArraysUsingHashMapWithLessTimeComplexity(int[] arr1, int[] arr2) {
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length) {
			
		}
		return arr1;
	}

	
	
	
	//Way 1- Take hash set - Store all unique values
	//Create another array - save all elements - Sort the array and return
	private static int[] unionOfTwoSortedArraysUsingHashMap(int[] arr1, int[] arr2) {
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0; i<arr1.length; i++) {
			hs.add(arr1[i]);
		}
		for(int i=0; i<arr2.length; i++) {
			hs.add(arr2[i]);
		}
		
		int arr3[]=new int[hs.size()];
		Iterator<Integer> itr=hs.iterator();
		int i=0;
		while(itr.hasNext()) {
		arr3[i++]=itr.next();
		}
	
		Arrays.sort(arr3);
		return arr3;
	}
}
