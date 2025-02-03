package strings;

public class FindTheDifference {
 public static void main(String[] args) {
	System.out.println(findTheDifference("aaa", "baaa"));
}
 
 //3ms, 80mb
 public static char findTheDifference(String s, String t) {
	 int sum=0;
	 for(int i=0;i<s.length();i++) {
		 sum+=s.charAt(i)-'a'+1;
	 }
	 
	 for(int i=0;i<t.length();i++) {
		 sum-=t.charAt(i)-'a'+1;
	 }
	 System.out.println(sum);
	 
	 return (char)('a'+Math.abs(sum)-1);
 }


public static char findTheDifference2(String s, String t) {
	 int sum=0;
	 for(int i=0;i<t.length();i++) {
        if(i!=t.length()-1){
            sum+=s.charAt(i)-'a'+1;
        }
        sum-=t.charAt(i)-'a'+1; 
	 }
	 
	 return (char)('a'+Math.abs(sum)-1);
    
}
}
