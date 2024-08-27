package Strings;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println("s"+reverseWordsInaString("  hey this is ram  ")+"s");


    }

    public void removeParentheses(String str){

    }

    public static String reverseWordsInaString(String str){
        String[] str1 = str.replaceAll("\\s+"," ").trim().split(" ");
        for(String s:str1){
            System.out.println(s);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=str1.length-1;i>=0;i--) {
            sb.append(str1[i]+ " ");

        }
        return sb.toString();
    }
}
