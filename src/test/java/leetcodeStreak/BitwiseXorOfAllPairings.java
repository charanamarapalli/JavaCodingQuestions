package leetcodeStreak;

public class BitwiseXorOfAllPairings {

	public static void main(String[] args) {
		int arr1[]= {2,1,3};
		int arr2[]= {10,2,5,0};
		System.out.println(bitwiseXorOfAllPairingsBruteForce(arr1, arr2));
		System.out.println(bitwiseXorOfAllPairings(arr1, arr2));
	}
	
	//2^10^2^2^2^5^2^0^1^10^1^2^1^5^1^0^3^10^3^2^3^5^3^0 -
	//2 appears 4 times
	//1 appears 4 times
	//3 appears 4 times
	//if arr2 is even and arr1 is odd then all arr1 elements will be appeared in even numbers(refer to above line) hence -just arr2 xor is the answer
	//if arr1 is even and arr2 is odd then all arr2 elements will be appeared in even numbers hence -just arr1 xor is the answer
	//if both are even - answer will be zero

	

	private static int bitwiseXorOfAllPairingsBruteForce(int[] nums1, int[] nums2) {
		int[] nums3=new int[nums1.length*nums2.length];
        int k=0;
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length;j++){
                nums3[k]=nums1[i]^nums2[j];
                k++;
            }
        }

        int sol=0;
        for(int i=0; i<nums3.length; i++){
            sol=sol^nums3[i];
        }

        return sol;
    }
	
	
	private static int bitwiseXorOfAllPairings(int[] nums1, int[] nums2) {
		int x=0;
		for(int i: nums1) {
			x=x^i;
		}
		
		int y=0;
		for(int i: nums2) {
			y=y^i;
		}
		
		return (nums1.length%2 * y) ^ (nums2.length%2 * x);
		
    }
	
}
