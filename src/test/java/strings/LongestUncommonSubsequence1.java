package strings;

public class LongestUncommonSubsequence1 {
//basic logic is - uncommon subsequence wit large size will be string with more size
	//if both are same, then there can't be uncommon subseq
	public static void main(String[] args) {
		System.out.println(longestUncommonSub("abaaa", "acda"));
	}
	
	public static int longestUncommonSub(String s,String t){
		if(s.equals(t)) {
			return -1;
		}
		int len=s.length()>=t.length()?s.length():t.length();
		
		return len;
	}
}
