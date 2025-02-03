package arrays;

public class MaximumConsecutiveOnes {

	public static void main(String[] args) {
		int arr[]= {1,2,4,1,1,0};
		System.out.println(maximumConsectiveOnes(arr));
	}

	//Using 2 variables
	//Variable 1 to track current consecutive 1's count
	//variable 2 to store so far max count
	public static int maximumConsectiveOnes(int[] arr) {
		int count=0;
		int max=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==1) {
				count++;
			}
			else {
				max=Math.max(max, count);
				count=0;
			}
			
		}
		return max;
	}

}
