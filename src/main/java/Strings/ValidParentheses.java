package Strings;

public class ValidParentheses {
    public static void main(String[] args) {
        isValid("[]{}");
    }

    public static boolean isValid(String s) {
        int a=0;
        int i=0;
        if(s.length()%2!=0){
            return false;
        }
        while(i<s.length()){
            if(s.charAt(i)=='(' && s.charAt(i+1)==')' ||  s.charAt(i)=='{' && s.charAt(i+1)=='}' || s.charAt(i)=='[' && s.charAt(i+1)==']'){
                a++;
                i=i+2;
            }
        }
        return a==s.length()/2;

    }

}
