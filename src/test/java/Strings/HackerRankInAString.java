package Strings;

public class HackerRankInAString {

    public static void main(String[] args) {
        System.out.println(hackerRank("hereiamstackerrank"));
    }

    public static String hackerRank(String s){
        String str2 = "hackerrank";
        int j=0;
        if(str2.length() > s.length()) return "NO";
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) == str2.charAt(j)) {
                System.out.println(sb.append(str2.charAt(j)));
                j++;
            }

        }

        System.out.println(j);

        if(str2.length()==j){
            return "YES";
        }

        return "NO";


    }
}
