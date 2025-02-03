package strings;

import java.util.HashMap;

public class FirstUniqueCharacterInString {
public static void main(String[] args) {
	//takes 6ms 
	System.out.println(firstUniqCharArray("lloveleetcode"));
	//takes 40 ms
	System.out.println(firstUniqCharHashMap("lloveleetcode"));
	System.out.println(firstUniqCharBruteForce("aabb"));
}

private static int firstUniqCharArray(String string) {
	int arr[]=new int[26];
	for(int i=0; i<string.length();i++) {
		arr[string.charAt(i)-'a']++;
	}
	
	for(int i=0; i<string.length();i++) {
		if(arr[string.charAt(i)-'a']==1) {
			return i;
		}
	}
	return -1;
}


private static int firstUniqCharBruteForce(String string) {
	for(int i=0; i<string.length();i++) {
//		char c=string.charAt(i);
//		String dup="";
		for(int j=i+1; j<string.length();j++) {
			
		}
		
	}
	return -1;
}

public static int firstUniqCharHashMap(String s) {
	HashMap<Character, Integer> hm = new HashMap<>();
	for(int i=0;i<s.length();i++) {
		if(hm.get(s.charAt(i))!=null) {
		hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
		}
		else {
			hm.put(s.charAt(i), 1);
		}
	}
	
	for(int i=0; i<s.length();i++) {
		if(hm.get(s.charAt(i))==1) {
			return i;
		}
	}
	
	return -1;
}
}
