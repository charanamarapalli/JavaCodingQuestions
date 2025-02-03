package strings;

public class IsSubsequence {

	public static void main(String[] args) {
		System.out.println(isStringSubsequence("abc","ahbgdc"));
		System.out.println(isStringSubsequenceOldWay("abc","ahbgdc"));
	}
	
	//runtime 2 ms
	public static boolean isStringSubsequence(String s, String t) {
		int i=0;
		int j=0;
		while(j<t.length()) {
			if(s.charAt(i)==t.charAt(j)) {
				i++;
			}
			if(i==s.length()) {
				return true;
			}
			j++;
		}
		return false;
	}
	
	//runtimem 6ms
	public static boolean isStringSubsequenceOldWay(String s, String t) {
		int j=0;
        if(s.length()>t.length() ) return false;
        if(s.length()==0 || t.length()==0) return true;
        for(int i=0; i< t.length();i++){
            if(s.charAt(j)==t.charAt(i)){
                j++;
                if(j==s.length()) break;
            }
        }

        if(j==s.length()) return true;
        else return false;
	}
	
	
}
