package arrays;

public class ArrayIsSortedAndRotated {

	// logic is - check for a position where arr[i+1]<arr[i].
	// till that position, reverse the array
	//after that position, reverse the array
	// Now array will be sorted in descending order. check if it is true.
	public static void main(String[] args) {
		int[] nums= {3,4,5,1,2};
		check(nums);
	}
	public static boolean check(int[] nums) {
        int k=0;
        for(int i=0; i<nums.length-1 ; i++){
            if(nums[i]>nums[i+1]){
                k=i+1;
                break;
            }
        }
        if(k==0){
            return true;
        }
        int start=0;
        int end=k-1;
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

        end=nums.length-1;
        while(k<end){
            int temp=nums[k];
            nums[k]=nums[end];
            nums[end]=temp;
            k++;
            end--;
        }

        for(int i=nums.length-1; i>0;i--){
            if(nums[i]>nums[i-1]){
                return false;
            }
        }
        return true;
        
    }
}
