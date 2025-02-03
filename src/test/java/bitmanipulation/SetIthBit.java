package bitmanipulation;

public class SetIthBit {

	public static void main(String[] args) {
		System.out.println(setIthBit(13,1));
	}

	public static int setIthBit(int num, int i) {
		//1101 
		//setting the first index to 1-- 1111 -- 
		//if i=2, then 1101 remains same. since ith index is already set
		
		//steps to achieve it-
		//brute force - convert num to decimal. check for ith index - if 0, replace it by 1 -> then convert back to decimal
		//do left shift integer 1 by i items then do or operator between num and 1<<i
		//logic - by doing 1<<i - we get 1 at only that position. in other positions, it is 0.
		// now doing or operator if for num at ith index, if it is 0, then 0& 1 returns 1 thus modifiying it
		//in all other positions it is 0 for 1<<i s0, by doing | for all other positions gives same bit as num.
		
		return num | (1<<i);
		
		
		
	}
}
