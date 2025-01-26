package bitmanipulation;

public class TogglethBit {

	public static void main(String[] args) {
		System.out.println(toggleIthBit(13, 2));
	}

	private static int toggleIthBit(int num, int i) {
		//logic is to take a new num underneath num
		//that num is 1<<i
		//now doing xor at that position if it is 1 at num - then even count of 1- o/p is 0
		//it  is 0 at num - then odd count - o/p is 1.
		//thus value changes
		
		return num^(1<<i);
		
	}
	
	
}
