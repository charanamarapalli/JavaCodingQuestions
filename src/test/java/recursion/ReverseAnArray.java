package recursion;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] arr= {1,2,4,6, 5,7};
		reverse(0, arr.length-1, arr);
		for(int a:arr) {
			System.out.println(a);
		}
	}
	
	public static void reverse(int start, int end, int[] arr) {
		if(start>end) {
			return;
		}
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		reverse(start+1, end-1, arr);
	}

}
