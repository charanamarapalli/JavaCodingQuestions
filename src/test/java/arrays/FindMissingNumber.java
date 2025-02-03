package arrays;

public class FindMissingNumber
{

	public static void main(String[] args) {
		int arr[]= {1,2,4,0};
		System.out.println(missingNumber(arr));
	}

	//Array contains 0 as one mandatory number.
	//sum of first natural numbers is n*(n+1)/2 
	
	public static int missingNumber(int[] arr) {
		int sum=0;
		int len=arr.length;
		for(int i=0; i<len;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		System.out.println((len*(len+1))/2);
		return ((len*(len+1))>>1)-sum;
	}
	
	//Logic -
	//xor of 2 elements is zero
	//xor of 1^0 is always 1
	//do xor of all elements in array
	//do xor of all elements from 0 to n
	//do xor of both the above.
	public static int missingNumberUsingBitManipulation(int[] arr) {
		int xor1=0;
		int xor2=0;
		int len=arr.length;
		for(int i=0; i<len;i++) {
			xor1^=arr[i];
			xor2^=i; // Upto N-1 elements
		}
		xor2^=len;
		return xor2^xor1;
		
		
	}
}
