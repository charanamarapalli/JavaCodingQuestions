package arrays;

import java.util.HashMap;
import java.util.Map;

public class NumberThatAppearsOnceAndOthersTwice {
 
	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3};
		System.out.println(numberThatAppearsOnceAndOthersTwice(arr));
	}

	//method 1- Store every integer and its count in HashMap - Return integer with count 1
	public static int numberThatAppearsOnceAndOthersTwice(int[] arr) {
		HashMap<Integer, Integer> hm=new HashMap<>();
		for(int x:arr) {
			if(hm.containsKey(x)) {
				hm.put(x, hm.get(x)+1);	
			}
			else {
				hm.put(x, 1);				
			}
		}
		
		for(Map.Entry<Integer, Integer> se:hm.entrySet()) {
			if(se.getValue()==1) {
				return se.getKey();
			}
		}
		
		
		return 1;
	}
	
	//method 2- Xor of all elements in array returns the unique number
	public static int numberThatAppearsOnceAndOthersTwiceXor(int[] arr) {
		int val=0;
		for(int x:arr) {
			val^=x;
		}
		return val;
	}
	  
}
