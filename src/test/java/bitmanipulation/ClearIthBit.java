package bitmanipulation;

public class ClearIthBit {

	public static void main(String[] args) {
		System.out.println(clearingIthBit(13, 2));
	}

	//logic is to keep 0 at ith position and do and with it
	//so take num 1 left shift by i position and then do not 
	//then add num and ~(1<<i)
	public static int clearingIthBit(int num, int i) {
		return num & ~(1<<i);
	}
}
