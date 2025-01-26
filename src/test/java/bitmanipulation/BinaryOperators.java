package bitmanipulation;

public class BinaryOperators {

	public static void main(String[] args) {
		System.out.println(andOperator("1101", "101"));
		System.out.println(orOperator("1101", "101"));
		System.out.println(xorOperator("101","11101"));
		
		//And Operator
		System.out.println(5&6);
		
		//Or Operator
		System.out.println(5|6);
		
		//Xor Operator
		System.out.println(5^6);
		
		//Left shift Operator
		System.out.println(25<<5);
		
		//Simplest Way is 
		System.out.println("for left shift by k times (n*Math.pow(2,k)) "+ (25*(int)(Math.pow(2,5))));
		
		//Right shift Operator
		System.out.println(25>>5);
		
		//Simplest Way is 
		System.out.println("for right shift by k times (n/Math.pow(2,k)) "+ (25/(int)(Math.pow(2,5))));
	}
	
	public static String andOperator(String s1, String s2) {
		int i=s1.length()-1;
		int j=s2.length()-1;
		StringBuffer sb=new StringBuffer();
		
		while(i>=0 || j>=0) {
			if(i>=0 && j>=0 && s1.charAt(i)=='1' && s2.charAt(j)=='1') {
				sb.append('1');
			}
			else {
				sb.append('0');
			}
			i--;
			j--;
		}
		return sb.reverse().toString();
	}
	
	public static String orOperator(String s1, String s2) {
		int i=s1.length()-1;
		int j=s2.length()-1;
		StringBuffer sb=new StringBuffer();
		while(i>=0 || j>=0) {
			if(i>=0 && j>=0 && s1.charAt(i)=='0' && s2.charAt(j)=='0') {
				sb.append('0');
			}
			else {
				sb.append('1');
			}
			i--;
			j--;
		}
		return sb.reverse().toString();
	}
	
	//no of 1s odd - 1
	//no of 1s even - 0
	public static String xorOperator(String s1, String s2) {
		int i=s1.length()-1;
		int j=s2.length()-1;
		StringBuffer sb=new StringBuffer();
		while(i>=0 || j>=0) {
			char bit1 = i>=0 ? s1.charAt(i): '0';
			char bit2 = j>=0 ? s2.charAt(j): '0';
			
			if(((bit1-'0')+(bit2-'0'))%2 == 0) {
				sb.append('1');
			}
			else {
				sb.append('0');
			}
			i--;
			j--;
		}
		return sb.reverse().toString();
	}
	
}
