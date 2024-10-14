package recurssion;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isaPalindrome("saiias", 0,5));
    }

    static boolean isaPalindrome(String sh, int start, int end){
        if(start<=end) {
            if (sh.charAt(start) != sh.charAt(end)) return false;
            if(isaPalindrome(sh, start + 1, end - 1));
            return true;
        }
        return true;


    }
}
