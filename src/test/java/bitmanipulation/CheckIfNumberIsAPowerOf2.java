package bitmanipulation;

public class CheckIfNumberIsAPowerOf2 {

	public static void main(String[] args) {
		System.out.println(numberIsAPowerOf2(1026));
	}

	private static boolean numberIsAPowerOf2(int num) {
//		num 16- 10000
//		num 15- 01111 
//		for n-1 number, all right mst bits before first set number will be turned as 1.
//		num 8- 1000
//		num 7- 0111
//		
//		so we can observe that num & num-1 should return 0 for num to be pow of 2.
		
		return ((num &(num-1))==0);
	}
	
}
