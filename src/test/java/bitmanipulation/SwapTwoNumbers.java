package bitmanipulation;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		swapUsingBinaryOperator();
	}
 
	private static void swapUsingBinaryOperator() {
		//xor operator is used 
		//because - xor of two sam numbers is xor only
		//5 ^ 5 = 101 ^ 101 = at every position, even numbers so return as 0. o/p = 000
		//now for swapping lets take two numbers 5 and 7
		int a=5;
		int b=7;
		
		a=a^b;
		b=a^b;  //which is a^b^b - returns a since b^b is 0.
		a=a^b;  // which is equal to a^b^a - returns b since a^a is 0.
		
		System.out.println("Value of a is : "+a +" value of b is "+b);
	}
}
