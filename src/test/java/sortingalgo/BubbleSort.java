package sortingalgo;

public class BubbleSort {
// swap of two immediate elements continously. 
	//end part is considered as sorted - after first itr, last element will be in its correct position.
	//becayuse, within inner loop  we will swap two elements and move the largest element to last index.
	//then reduce i to n-2.
	// within inner loop, again find largest element and put it in n-2position.
	public static void main(String[] args) {
		int arr[]= {4,3,2,1};
		Bubblesort(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}

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
