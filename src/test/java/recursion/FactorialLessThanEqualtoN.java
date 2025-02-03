package recursion;

import java.util.ArrayList;

public class FactorialLessThanEqualtoN {

	public static void main(String[] args) {
		factorialNumbers(23).stream().forEach(i->System.out.println(i));
	}
	
	public static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> lst1 = new ArrayList<Long>();
        for(long i=1; i<=n ; i++){
            long sol= factorial(i);
            if(sol>n){
                break;
            }
            lst1.add(sol);
        }
        return lst1;
	}
	
	public static long factorial(long n) {
		if(n==1) {
			return 1;
		}
		
		return n*factorial(n-1);
	}
}
