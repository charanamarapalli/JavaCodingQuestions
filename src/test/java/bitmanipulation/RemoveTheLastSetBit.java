package bitmanipulation;

public class RemoveTheLastSetBit {

	public static void main(String[] args) {
		System.out.println(removeTheLastSetBit(84));
	}

	//1010100 - 84
	//1010000 - 83
	//doing and will turn off the right most bit
	private static int removeTheLastSetBit(int num) {
		
		return num & (num-1);
	}
}
