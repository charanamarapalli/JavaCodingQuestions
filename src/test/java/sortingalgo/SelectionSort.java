package sortingalgo;

public class SelectionSort {
	//Smallest element is brought to front in each loop 
	//Find smallest element in every iteration and put it in starting position
	
	//entire array is unsorted -- but in insertion, assumes first element is already sorted
	//theory - select the smallest element and place it.
	//initially assume, all elements are unsorted - so loop from 0 to n-1.
	//now in inner loop - starts from i+1 to n-1. find the minimum element index. it is done by comparing the i element with each elemtn in j.
	//swap after inner loop ends.
	public static void main(String[] args) {
		int arr[]= {4,3,2,1};
		selectionSort(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}

	public static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int mini=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[mini]>arr[j]) {
					mini=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[mini];
			arr[mini]=temp;
		}
	}
}
