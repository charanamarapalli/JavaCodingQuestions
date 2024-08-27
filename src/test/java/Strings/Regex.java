package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        String input = "a1bcd23df65d";

        method1(input);
        method2(input);

    }

    public static void method1(String input){
        Pattern p = Pattern.compile("[0-9]+");
        Matcher matcher = p.matcher(input);


        while(matcher.find()){
            System.out.println(matcher.group());
        }

        Pattern p1 = Pattern.compile("[a-z]+");
        Matcher matcher1 = p1.matcher(input);

        while(matcher1.find()){
            System.out.println(matcher1.group());
        }
    }

    public static void method2(String input){

    }
}
