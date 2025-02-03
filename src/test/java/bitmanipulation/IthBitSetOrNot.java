package bitmanipulation;

public class IthBitSetOrNot {

	public static void main(String[] args) {
		System.out.println(checkIfIthBitSetOrNotByLeftShift(13, 2));
		System.out.println(checkIfIthBitSetOrNotByRightShift(13, 2));
	}

	private static boolean checkIfIthBitSetOrNotByLeftShift(int num, int i) {
		//13 is num - its binary is 1101 . here 2nd bit from left indexing is 1. Hence it is set. return true.
		//We can solve this using left or right shift operator.
		//For integer 1 - binary equivalent is 0000..001. Doing left shift by index i returns 000..00100 (here i is 2)
		//do 'and operator' for the above 1<<i and num -- 1101 & 0100 - except at i th position, all other places value will be 0.
		//so value of left shift of 1 by k times if equal to (num & 1<<i) == (1<<i) return true
		// another way is num & 1<<i i not returns value as 0 then ith bit is set
		
		//return ((num & (1<<i))!=0);
		return ((num & (1<<i))==(1<<i));
	}
	
	private static boolean checkIfIthBitSetOrNotByRightShift(int num, int i) {
		//13 is num - its binary is 1101 . here 2nd bit from left indexing is 1. Hence it is set. return true.
		//We can solve this using left or right shift operator.
		//step1 - do right shift the num by i times. 1101 right shift by 2- 000..0011 (01 are removed)
		//Step2 - do &with num 1 - 0011 & 0001 -if returns 1  then true, if not returns 1-then false;
		
		return (((num>>i)&1)==1);	
	}
	
}
