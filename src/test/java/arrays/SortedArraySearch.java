package arrays;

public class SortedArraySearch {

	public static void main(String[] args) {
		int arr[]= {1};
		System.out.println(sortedArraySearch(arr, 1));
	}

	private static boolean sortedArraySearch(int[] arr, int k) {
		// Your code here
        int i=0;
        int j=arr.length-1;
        while(i<=j){
        int mid=(i+j)>>1;
        System.out.println("Value of mid is: "+mid);
        if(arr[mid]==k){
            return true;
        }
        else if(arr[mid]>k){
            j=mid-1;
        }
        else{
            i=mid+1;
        }
        }
        
        return false;

	}
}
