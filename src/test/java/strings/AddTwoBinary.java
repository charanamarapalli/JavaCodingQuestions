package strings;


public class AddTwoBinary {
public static void main(String[] args) {
	//logic -- 1+1=10, 0+1=1, 0+0=0, 1+1+1=11
	//
	System.out.println(addBinary("1111","1111"));
	
	//takes stringbuilder to store value, 
	System.out.println(addBinaryOptimalSolution("1111","1111"));
}

public static String addBinary(String a, String b) {
    int i=a.length()-1;
    int j=b.length()-1;
    int extra=0;
    StringBuilder sb = new StringBuilder();
    String sai="";
    while(i>=0 ||j>=0 || extra==1){
        int current=0;
        if(i>=0){
            current+= a.charAt(i)-'0';
            //i--;
        }
        if(j>=0) {
        	current+=b.charAt(j)-'0';
        	//j--;
        }
        
        current=current+extra;
        extra=0;
        if(current==2) {
        	extra=1;
        	current=0;
        }
        else if(current==3) {
        	extra=1;
        	current=1;
        }
        sb=sb.append((char) (current + '0'));   
        sai=current+sai;
        i--;
        j--;
    }
    System.out.println(sai);
    return sb.reverse().toString();
}

public static String addBinaryOptimalSolution(String a, String b) {
    int i=a.length()-1;
int j=b.length()-1;
int extra=0;
StringBuilder sb = new StringBuilder();

while(i>=0 ||j>=0 || extra!=0){
    int current=extra;
    if(i>=0){
        current+= a.charAt(i)-'0';
        //i--;
    }
    if(j>=0) {
    	current+=b.charAt(j)-'0';
    	//j--;
    }
    sb=sb.append((char) current%2);   
    extra=current/2;
    i--;
    j--;
}
return sb.reverse().toString();
}

}
