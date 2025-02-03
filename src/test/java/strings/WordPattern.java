 package strings;

import java.util.HashMap;

//Same as isomorphic strings
public class WordPattern {
public static void main(String[] args) {
	System.out.println(wordPattern("abba","dog cat cat dog"));
}

public static boolean wordPattern(String pattern, String s) {
    String[] sarr=s.split(" ");
    if(pattern.length()!=sarr.length){
        return true;
    }
    HashMap<Character, String> hm= new HashMap<>();

    for(int i=0; i<sarr.length; i++){
        if(hm.containsKey(pattern.charAt(i))){
            if(!hm.get(pattern.charAt(i)).equals(sarr[i])){
            	return false;
            }
        }
        else if(hm.containsValue(sarr[i])) {
        	return false;
        }
        hm.put(pattern.charAt(i), sarr[i]);

    }
    return true;
}
}
