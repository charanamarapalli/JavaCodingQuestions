package strings;

public class ReverseString2 {

	//logics
//	optimal solution -
//	start a for loop from i to string length
//	write another function to swap from i to minimum(k, string length)
	
	
//	big solution -
//check how  many such valid k length sub arrays exist
//then for remaining one, - divide them and do this. do  normal swapping

	public static void main(String[] args) {
		System.out.println(reverseString("abce", 5));
		System.out.println(reverseStrOptimalReferedToLeetCode("abce", 5));
	}
	
	public static String reverseStrOptimalReferedToLeetCode(String s, int k) {
		char[] st = s.toCharArray();
		for(int i=0; i<s.length();i+=2*k) {
			int end=Math.min(i+k-1, s.length()-1);
			swap(i,end,st);
		}
		return new String(st);
	}
	
	public static String reverseString(String s, int k) {
		int j=s.length()/(2*k);  //j=1;
		char[] st= s.toCharArray();
		int i=0;
		while(j!=0) {
			swap(i,i+k-1,st);
			i=i+2*k;
			System.out.println(i);
			j--;
		}
		
		
			if(i+k-1 < s.length()) {
				swap(i,i+k-1,st);
				
			}
			else {
				swap(i, s.length()-1, st);
				
			}

		
		return String.copyValueOf(st);
	}
	
	
	private static void swap(int i, int j, char[] st) {
		// TODO Auto-generated method stub
		while(i<j) {
			char temp = st[i];
			st[i]=st[j];
			st[j]=temp;
			i++;
			j--;
		}
		
	}
}
