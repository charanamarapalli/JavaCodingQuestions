package sortingalgo;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {4,3,2,1};
		insertionsort(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}

	//Selection - smallest element is placed in starting index
	//Bubble - Largest element is placed at last index
	//Insertion - Each element is picked at its correct position
	
	//Insertion only uses while loop within the outer loop
	//consider left portion is sorted
	//Initially, 
	//14 9 15 12 6 8 13
	
	//14 is assumed as sorted
	
	//Start with i=1 check in sorted part if ith element needs to be inserted or not
	// 14>9 - so swap 9 14 15 12 6 8 13
	
	//9 and 14 is sorted region
	//(i=2)Now pick 15 and check if it needs to inserted
	//14>15 false - no swap required - 9 14 15 12 6 8 13
	
	//9, 14,15 is sorted region
	//i=3 Now pick 12 and check if it needs to inserted or not
	//15>12 -> true -> swap 9 14 12 15 6 8 13
	//again check with in sorted part if further sort required ? - yes - 14>12 - 9 12 14 15 6 8 13
	
	// 9 12 14 15 is sorted region
	//do repeat
	
	//Pseudocode
	//so outer loop runs from 1 to n-1 assumes 0 as sorted part
	//pick i th index int k=arr[i] and assume j=i
	//Within inner loop -  while(j>0 && arr[j]<arr[j-1]) first check j is greater than zero -- thus compare 
	//for this postion - 9 14 15 12 6 8 13
	//i is 3
	//j=3
	//3>0 true && arr[3] <arr[2] -true - then swap arr[3] and arr[2] == 9 14 12 15 6 8 13 do j--
	//2>0 true && arr[2] < arr[1] - 12<14- true - swap arr[2] and arr[3] == 9 12 14 15 6 8 13 do j--
	//1>0 true && arr[1] < arr[0] false breaks out of inner loop
	
	
	
	public static void insertionsort(int[] arr) {
		for(int i=1; i<arr.length;i++) {
			int j=i;
			while(j>0 && arr[j]<arr[j-1]) {
				arr[j]=arr[j]^arr[j-1];
				arr[j-1]=arr[j]^arr[j-1];
				arr[j]=arr[j]^arr[j-1];
				j--;
			}
		}
	}
}
