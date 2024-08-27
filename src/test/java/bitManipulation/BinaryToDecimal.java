package bitManipulation;

public class BinaryToDecimal {

    public static void main(String[] args) {
        System.out.println(binary2Decimal("1101"));
    }

    public static int binary2Decimal(String s){
        int num=0;
        int power=1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                num=num+power;
            }
            power=power*2;
        }
        return num;
    }
}
