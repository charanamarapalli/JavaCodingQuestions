package strings;

import java.util.HashMap;

public class IsomorphicStrings {
public static void main(String[] args) {
	String s = "egg", t = "add";
	System.out.println(isIsomorphic(s,t));
}


//logics --
//edge case - both string length should be same
//s character should have equivalent t character
//here s = "egg", t = "add" -- e have a, g have d.
//start loop from 0 to s.length()-1
//take a hashmap store i=0 e and a as key value pair
// then store i=1  g and d
// next time when i=2. check if g already exists as key, if it exists check the value  if both matches - then ok. if does not match, then return false

//ex-2:
//s="foo" t="bar"
//when i=1, stores hm(o,a)
//when i=2, check o exists in hm, true - then check its key - it is a , but s.charAt(2) is r- not matches hence false

//e-3
//s="bar" t="foo"
//when i=1 stores hm(a,o)
//when i=2, check if r is new, if yes then there should be no matching value for it - so check it as well - if it has, then its wrong.
//so after checking if r does not have a value, check t.charAt(2) is a value in the hm - if yes. then return false. since r needs value to be set as o, but its not possible
public static boolean isIsomorphic(String s, String t) {
    if(s.length()!=t.length()){
        return false;
    }
    HashMap<Character, Character> hm =new HashMap<>();

    for(int i=0; i<s.length(); i++){
        if(hm.containsKey(s.charAt(i))) {
        	if(hm.get(s.charAt(i))!=t.charAt(i)) {
        	return false;
        	}
        } 
        else if(hm.containsValue(t.charAt(i))) {
        	return false;
        }
        
        hm.put(s.charAt(i),t.charAt(i));

    }
    
    return true;
    
}
}
