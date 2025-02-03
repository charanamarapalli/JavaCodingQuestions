package bitmanipulation;

public class DecimalToBinaryConversionViceversa {
public static void main(String[] args) {
	System.out.println(toBinary(13));
	System.out.println(toDecimal("1101"));
	
}

public static String toBinary(int n) {
	//Write your code here
	StringBuilder sb =new StringBuilder();
	while(n!=1){
		sb.append(n%2);
	    n=n/2;
	}
	sb.append(1);
	return sb.reverse().toString();
}

public static Integer toDecimal(String s) {
	int j=s.length()-1;
	int i=0;
	int sol=0;
	while(j>=0) {
		if(s.charAt(j)!='0') {
			sol=(int) (sol+Math.pow(2, i));
		}
		i++;
		j--;
	}
return sol;
}


}

