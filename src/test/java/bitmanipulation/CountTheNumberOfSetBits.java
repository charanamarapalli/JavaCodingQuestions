package bitmanipulation;

public class CountTheNumberOfSetBits {

	public static void main(String[] args) {
		System.out.println(countNumberOfSetBits(84));
		System.out.println(countNumberOfSetBitsUsingOperators(84));
		System.out.println(countNumberOfSetBitsUsingAndOperators(84));
		
	}

//	2|13 =1
//	2| 6 =0
//	2| 3 =1
//	2| 1  o/p 1101
	
	
	public static int countNumberOfSetBits(int num) {
		int count=0;
		while(num!=1) {
			if(num%2==1) count++;
			num=num/2;
		}
		
		if(num==1) count++;
		return count;	
	}
	
	//if a number is odd - then last bit will be always 1. 13 - 1101 8+4+2+1
	//hence num & 1 - if  returns 1 - then it is even number, else odd number.
	
	public static int countNumberOfSetBitsUsingOperators(int num) {
		int count=0;
		while(num!=1) {
			//if((num&1)==1) count++;
			//even simpler techinque is 
			count+=(num&1);
			
			//num=num/2 similar one is 
			num=num>>1;
		}
		
		if(num==1) count++;
		
		return count;
	}
	
	//for 84
	//step 1 - 84 & 83 : 1010100 & 1010011 - 1010000 --doing this will eliminate the last set bit in 84 - 
	//because for n-1 the element, before the last set bit will have all 1's 84 last 3 bits are 100 83 - last 3 bits are 011- rest all indexes will be same
    //step 2 - o/p of step 1 & (o/p of step 1 minus 1) - 1010000 & 1001111 - 100000
	//step 3 - o/p of step 3 & (o/p of step 3 minus 1) - 100000 & 0000000 - 000000
	public static int countNumberOfSetBitsUsingAndOperators(int num) {
		int count=0;
		while(num!=0) {
			num=num & num-1;
			count++;
		}
		return count;
	}
	
	
	
}
