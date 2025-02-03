package strings;


// to learn - we can't modify value of character within a string
public class ReverseVowels {
public static void main(String[] args) {
	System.out.println(reverseVowelsOfAString("IceCreAm"));
}

private static String reverseVowelsOfAString(String string) {
	int i=0;
	int j=string.length()-1;
	String tocheck="aeiouAEUIO";
	char[] charArray = string.toCharArray();
	while(i<j) {
		while(i<j && tocheck.indexOf(charArray[i])==-1) {
			i++;
		}
		
		while(i<j && tocheck.indexOf(charArray[j])==-1) {
			j--;
		}
		
		
		char temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		i++;
		j--;
		
	}
	return new String(charArray);	
}
}
