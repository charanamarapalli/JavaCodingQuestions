package strings;

public class LicenseKeyFormatting {
 
	//k value set to 4
	//if string length less than k - return same
	//
	public static void main(String[] args) {
		System.out.println(keyFormatting("2-4A0r7-4k", 4));
	}
	
	public static String keyFormatting1(String s, int k) {
		StringBuilder sb=new StringBuilder();
		int i=0;
		while(i<s.length()) {
			if(s.charAt(i)!='-') {
				sb.append(s.charAt(i));
			}
			i++;
		}
		
		
		
		//String a= sb.toString();
		
	
		return sb.toString();
	}
	
	public static String keyFormatting(String s, int k) {
		StringBuilder sb=new StringBuilder();
		int j=0;
		int i=0;
		while(true && i<s.length()) {
			sb.append(s.charAt(i));
			i++;
			if(s.charAt(i)=='-') {
				sb.append(s.charAt(i));
				break;
			}
		}
		while(i<s.length() && i<s.length()){
				if(s.charAt(i)!='-') {
					sb.append(s.charAt(i));
					j++;
				}
				i++;
				if(i<s.length() && j==k) {
					sb.append("-");
					j=0;
				}

			
		}
		
		return sb.toString().toUpperCase();
		
		
	}
}
