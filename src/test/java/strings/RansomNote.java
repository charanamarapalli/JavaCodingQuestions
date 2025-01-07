package strings;

public class RansomNote {
	
	//possible ways -
	//Way1 -
	//take an array of size 26. loop through str1 - save the count.
	//now loop through str2 - decrease the count.
	//loop through array again - check everywhere it is zero.
	
	//Way2 -
	//instead of array, taking hashmap -- this takes more storage and more time
	
	
	public static void main(String[] args) {
		System.out.println(way1("aa","baa"));
		
	}
	
	private static boolean way1(String s, String t) {
		int arr[]= new int[26];
		
		for(int i=0;i<t.length();i++) {
			arr[t.charAt(i)-'a']++;
		}
		
		for(int i=0;i<s.length();i++) {
			int val=arr[s.charAt(i)-'a'];
			if(val==0) {
				return false;
			}
			arr[s.charAt(i)-'a']--;
			
		}
		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=0) {
//				return false;
//			}
//		}
		return true;	
	}
	
	

}
