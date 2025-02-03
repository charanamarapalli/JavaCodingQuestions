package strings;

public class IsPalindrome {
public static void main(String[] args) {
	//my method works only if str contains letters. does not store digits. also not using pointers
	System.out.println(verifyIsPalindromeByCharan("A man, a plan, a canal: Panama"));
	//This verifies for both digist and letters using character method - Character.isLetterOrDigit()
	System.out.println(verifyIsPalindromeCrctMethod("A man, a plan, a canal: Panama"));
}

private static boolean verifyIsPalindromeCrctMethod(String str) {
	str=str.toLowerCase();
	System.out.println("entered here hey");
	int i=0; int j=str.length()-1;
	System.out.println("va;ue of i is "+i+" value of j is "+j);
	while(i<j) {
		System.out.println("entered here hey 2");
		while(i<j && !Character.isLetterOrDigit(str.charAt(i))) {
			i++;
			System.out.println("entered here "+i);
		}
		while(i<j && !Character.isLetterOrDigit(str.charAt(j))) {
			j--;
			System.out.println("entered here "+j);
		}
		
		if(str.charAt(i)!=str.charAt(j)) {
			return false;
		}
		i++;
		j--;
	}
	return true;
	
}
private static boolean verifyIsPalindromeByCharan(String str) {
	str=str.toLowerCase();
	StringBuilder sb= new StringBuilder();
	for(int i=0; i<str.length(); i++) {
		if(str.charAt(i)>=97 && str.charAt(i)<=123) {
			sb.append(str.charAt(i));
		}
	}
	
	String ad = sb.toString();	
	int i=0; int j=ad.length()-1;
	System.out.println(ad+" is string");
	while(i<j) {
		char a= ad.charAt(i);
		char b=ad.charAt(j);
		System.out.println("value of i is "+i+" , value of j is "+j);
		System.out.println("value of a is "+a+" , value of b is "+b);
		if(a!=b) {
			return false;
		}
		i++;
		j--;
	}
	return true;
	
}
}
