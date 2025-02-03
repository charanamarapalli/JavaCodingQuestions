package arrays;

public class LeftRotateArrayByKElements {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int arr1[]= {1,2,3,4,5,6,7};

		arr = leftRotateByKTimes(arr, 3);
		arr1=leftRotateByKTimesWithHelperFunction(arr,3);
		for(int x:arr1) {
			System.out.print(x+" ");
		}
	}
	
	private static int[] leftRotateByKTimesWithHelperFunction(int[] arr, int k) {
		k=k%arr.length;
		int n=arr.length-1;
		reverseArr(arr,0,n-k);
		reverseArr(arr, n-k+1,n);
		reverseArr(arr,0,n);
		return arr;
	}
	
	private static void reverseArr(int arr[], int i, int a) {
		while(i<a) {
			arr[i]=arr[i]^arr[a];
			arr[a]=arr[i]^arr[a];
			arr[i]=arr[i]^arr[a];
			i++;
			a--;
			}		
	}

	private static int[] leftRotateByKTimes(int[] arr, int k) {
		// TODO Auto-generated method stub
		int i=0;
		int a=arr.length-k-1;
		int j=arr.length-1;
		while(i<a) {
			arr[i]=arr[i]^arr[a];
			arr[a]=arr[i]^arr[a];
			arr[i]=arr[i]^arr[a];
			i++;
			a--;
			}
		
		a=arr.length-k;
		while(a<j) {
			arr[a]=arr[a]^arr[j];
			arr[j]=arr[a]^arr[j];
			arr[a]=arr[a]^arr[j];
			a++;
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
