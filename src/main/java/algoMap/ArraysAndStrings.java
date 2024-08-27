package algoMap;

public class ArraysAndStrings {

	public static void main(String[] args) {
		//findClosestNumber
		int arr[] = {-10,-12,-54,-12,-544,-10000,-4,-2,1,4,8};
		System.out.println(findClosestNumber(arr));
	}
	
	public static int findClosestNumber(int[] nums) {
        int least =nums[0];
        for(int i=1; i<nums.length; i++){
			/*
			 * if(nums[i]<0 && Math.abs(nums[i])<Math.abs(least)){
			 * System.out.println("enter: "+ least); least = nums[i]; } else
			 * if(nums[i]<=Math.abs(least)){ System.out.println("oops: "+ least);
			 * least=nums[i]; }
			 */
            
            if(Math.abs(nums[i])<Math.abs(least)) {
            	least=nums[i];
            }
            else if(Math.abs(nums[i])==Math.abs(least) && nums[i]>0) {
            	least = nums[i]; 
            }
        }
        return least;
    }
}
