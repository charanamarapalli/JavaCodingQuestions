package strings;

public class LongestPalindrome {
	public static void main(String[] args) {
		longestPalindrome("aasdfscajsh");
	}

	public static int longestPalindrome(String s) {
		int len = s.length();
		int arr[] = new int[26];
		int i = 0;
		while (i < len) {
			if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				arr[s.charAt(i) - 'a']++;
			}
			i++;
		}
		int sum = 0;
		for (int j = 0; j < arr.length; j++) {
			sum += (arr[j] % 2 == 0 ? arr[j] : arr[j] - 1);

			// if(arr[j]%2==0){
			// sum=sum+arr[j];
			// }
			// else if(arr[j]>2){
			// sum=sum+arr[j]-1;
			// }
			arr[j] = 0;
		}
		i = 0;

		while (i < len) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				arr[s.charAt(i) - 'A']++;
			}
			i++;
		}

		for (int j = 0; j < arr.length; j++) {
			sum += (arr[j] % 2 == 0 ? arr[j] : arr[j] - 1);

			// if(arr[j]%2==0){
			// sum=sum+arr[j];
			// }
			// else if(arr[j]>2){
			// sum=sum+arr[j]-1;
			// }
		}

		if (sum == len) {
			return sum;
		}
		return sum + 1;

	}
}
