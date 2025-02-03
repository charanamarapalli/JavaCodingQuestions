package arrays;

public class MoveZeros {
	
	public static void main(String[] args) {
		int arr[]= {1,0,3,0,5};
		int arr1[]= {1,0,3,0,5};

		arr = moveZeros(arr);
		arr1 = optimizedTimeComplexityToOOfN(arr1);
		for(int x:arr1) {
			System.out.println(x);
		}
	}
	
	//logic --
	//loop through out the entire array - j
	//start an index i which is used to store other than zero values
	//check if element is not zero - if not zero -move the i index by +1 and set the j th value.
	//after jth loop ends - remaining i positions till arr.length - add Zeroes.
	//It has more time complexity
	public static int[] moveZeros(int arr[]) {
		 int i=0;
			for(int j=0; j<arr.length;j++) {
				if(arr[j]!=0) {
				    arr[i]=arr[j];
					i++;
				}
			}
			while(i<arr.length) {
				arr[i]=0;
				i++;
			}
		return arr;
	}
	
	//- intially for zeroth index  it will swap with same number - if arr[0] is not equal to zero.
	// later on it will track indexes with 0.
	
	//Step 1-create variable j with 0;
	//step 2- loop through array with i -> 0 to n
	//step 3- if arr[i]!=0 - then swap the current index with jth index.
	//step 4- if arr[i]==0 - dont swap
	//wt happens is for ex:1 0 2 1 0 1
	//i=0, j=0, 1!=0 - then swap 1 with 1 - move j by +1.
	//i=1, j=1 arr[i] =0!=0 false mov ith pointer
	//i=2, j=1 arr[i] =2!=0 true - then swap 2 arr[i] with arr[j] - arr becomes 1 2 0 1 0 1
	//i=3, j=2 so on..
	public static int[] optimizedTimeComplexityToOOfN(int arr[]) {
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=0;
				arr[j]=temp;
				j++;
			}
		}
		return arr;
	}

}
