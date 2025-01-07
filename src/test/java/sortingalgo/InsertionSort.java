package sortingalgo;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {4,3,2,1};
		Insertionsort(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}

	//bubble -right side is sorted. i= n-1 to 0, j= 0 to i comparison between j+1 and j
	// insertion - left side is sorted. First index is assumed as sorted.
	// selection - left side only sorted, All left elements are sorted i=0 to n-1, j=i+1 to n-1, comparison between j  and i
	public static void Insertionsort(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<i; j++) {
				
			}
		}
		
	}
}
