package arrays;

public class LeftRotateArrayByOnePlace {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		arr = leftRotate(arr);
		for(int x:arr) {
			System.out.println(x);
		}
	}

	private static int[] leftRotate(int[] arr) {
		// TODO Auto-generated method stub
		int i=0;
		int j=arr.length-2;
		while(i<j) {
			arr[i]=arr[i]^arr[j];
			arr[j]=arr[i]^arr[j];
			arr[i]=arr[i]^arr[j];
			i++;
			j--;
			}
		
		i=0;
		j=arr.length-1;
		while(i<j) {
			arr[i]=arr[i]^arr[j];
			arr[j]=arr[i]^arr[j];
			arr[i]=arr[i]^arr[j];
			i++;
			j--;
		}
		return arr;
	}
}
