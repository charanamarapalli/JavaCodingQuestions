package strings;

public class Removeouterparentheses {
	public static void main(String[] args) {
		String s = "(()())(())(()(()))";
		System.out.println(solution1(s)); //solution1 took 15 ms
		//storing solution in a string took 0(n2) as it creates string everytime - Hence changed to 5 ms
		System.out.println(solution2(s));
		//my code looks a bit clumsy - optimal sol involves checking each char and update/ decrease balance.
		//reduced to 2 ms
		System.out.println(solution3(s));
		
	}
	
	public static String solution1(String s) {
		int i = 0;
		int front = 0;
		String s1 = "";
		while (i < s.length()) {
			if (s.charAt(i) == '(') {
				front++;
			}
			if(front==1) {
				if(s.charAt(i)==')') {
					front--;
				}
				i++;
				continue;
			}
			else if(front>1 && s.charAt(i)==')') {
				front--;
			}
			
			s1 = s1 + s.charAt(i);
			i++;
		}
		return s1;
	}
	
	public static String solution2(String s) {
		int i = 0;
		int front = 0;
		StringBuilder sb = new StringBuilder();
		while (i < s.length()) {
			if (s.charAt(i) == '(') {
				front++;
			}
			if(front==1) {
				if(s.charAt(i)==')') {
					front--;
				}
				i++;
				continue;
			}
			else if(front>1 && s.charAt(i)==')') {
				front--;
			}
			
			sb.append(s.charAt(i));
			i++;
		}
		return sb.toString();
	}
	
	//if for ( and else  for )
	//check for balance - balance > 0 - add ( and increase balance
	//when char =( -> dcrease balance first, check balan`ce >0 - it true then add
	public static String solution3(String s) {
		int balance=0;
		StringBuilder sb = new StringBuilder();
		for(char ch:s.toCharArray()) {
			if(ch=='(') {     
				if(balance>0) {
					sb.append(ch);
				}
				balance++;
			}
			else if(ch==')') {
				balance--;
				if(balance>0) {
					sb.append(ch);
				}
				
			}
		}
		return sb.toString();
	}
}
