package random;

public class SwtichClass {

    public static void main(String[] args) {

        int[] arr=  {1,2,3,4,5};

        for (int count = 0; count < arr.length; count++) {
            switch (arr[count]) {
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(2);
                    break;
                case 3:
                    System.out.println(3);
                    break;
                case 4:
                    System.out.println(4);
                    break;
                case 5:
                    System.out.println(5);
                    break;
            }
        }

        strStr("hello", "ll");

    }
    public static int strStr(String haystack, String needle) {
        int len = needle.length();
        int i=0;
        int j=0;
        while(i<haystack.length()){
            String s = "";
            while(j<len){
                s=s+haystack.charAt(j);
                j++;
            }
            if(s==needle){
                return i;
            }
            else i++;
        }
        return -1;
    }

}
