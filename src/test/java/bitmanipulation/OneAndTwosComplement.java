package bitmanipulation;

import strings.AddTwoBinary;

public class OneAndTwosComplement {

	public static void main(String[] args) {
		System.out.println(OnesComplementOfNumber(13));
		System.out.println(TwosComplementOfNumber(25));
	}
	
	public static int OnesComplementOfNumber(int n) {
		String s=DecimalToBinaryConversionViceversa.toBinary(n);
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='0') {
			sb.append('1');
		}
		else {
			sb.append('0');
		}
		}
		return DecimalToBinaryConversionViceversa.toDecimal(sb.toString());
	}

	public static int TwosComplementOfNumber(int n) {
		String s=Integer.toBinaryString(n);
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='0') {
			sb.append('1');
		}
		else {
			sb.append('0');
		}
		}
		
	    return DecimalToBinaryConversionViceversa.toDecimal(AddTwoBinary.addBinaryOptimalSolution(sb.toString(), "1"));
	}
}
