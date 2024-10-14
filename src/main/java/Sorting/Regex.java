package Sorting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        String REGEX="sai";

        Pattern pattern = Pattern.compile(REGEX);

        Matcher matcher = pattern.matcher("sai");

        boolean x = matcher.matches();

        String string2="sai";
        boolean sai = Pattern.compile(REGEX).matcher(string2).matches();
        System.out.println(x);


        boolean y = string2.matches(REGEX);

        System.out.println(y);
    }
}
