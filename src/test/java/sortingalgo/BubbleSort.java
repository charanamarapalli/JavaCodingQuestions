package sortingalgo;

public class BubbleSort {
	//at each itr - highest element is swapped
    // swap of two immediate elements continously. 
	//end part is considered as sorted - after first itr, last element will be in its correct position.
	//because, within inner loop  we will swap two elements and move the largest element to last index.
	//then reduce i to n-2.
	// within inner loop, again find largest element and put it in n-2position.
	public static void main(String[] args) {
		int arr[]= {4,3,2,1};
		Bubblesort(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}

	//Swapping elements does not have idea about ith index. just 
	public static void Bubblesort(int[] arr) {
		for(int i=arr.length-1; i>=0; i--) {
			for(int j=0; j<i; j++) {
				if(arr[j+1]<arr[j]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
//			System.out.println("after "+ i+"th iter");
//			for(int a:arr){
//				System.out.println(a);
//				};
		}
	}
}

//DryRun and PseudoCode
//find largest element and put it in last index
//done by adjacent swaps
// 13 46 24 52 20 9
//i=0 to i=n-2 0 to 4 only
//j starts from 0 to n-i-1  -- Reason is we know after each outer loop - last index is sorted
//so - inner loop will reduce the last index one by one 
//hence if in first itr if j range is from 0 to n-2, in second itr it becomes n-3
//i=0 - then j is from 0 to 6-0-1 = 5
//i=1 -then j 0 to 4
//i=2 then j=0 to 3
//i=3 then j=0 to 2
//i=4 then j=0 to 1


//lets do dry run --
//i=0 (itr1) - j=0 to 4
//check if arr[j] > arr[j+1] => arr[0] > arr[1] => 13 > 46 - false - ignore
// arr[1]> arr[2] -> 46>24 - true -  swap - 13 24 46 52 20 9
//arr[2] > arr[3] -> 46>52 - false -ignore
//arr[3] > arr[4] -> 52> 20 - true swap - 13 24 46 20 52 9
//arr[4] > arr[5] -> 52>9 - true swap - 13 24 46 20 9 52
 
//i=1(itr2) -j=0 to 3  // 13 24 46 20 9 52
//check if arr[j] > arr[j+1] => arr[0] > arr[1] => 13 > 24 - false - ignore
//arr[1]> arr[2] -> 24>46 -false -ignore
//arr[2] > arr[3] -> 46>20 - true - swap 13 24 20 46 9 52
//arr[3] > arr[4] -> 46> 9 - true swap - 13 24 20 9 46 52

// go on
