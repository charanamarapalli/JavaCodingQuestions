package recurssion;

public class PowerSet {

    public static void main(String[] args) {
        print2PowerOfN("sai");


    }

    public static void print2PowerOfN(String sai){

        int n = sai.length();
        for(int i=0;i<(1<<n);i++)
        {
            String substir= "";
            for(int j=0;j<n;j++){
                if((i & (1<<j))>0){
                    substir =substir+sai.charAt(j);
                }
            }
            System.out.println(substir);

        }

    }
}
