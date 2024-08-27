package Strings;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));

    }

    public static int romanToInt(String s) {
        int i=0;
        int sol=0;
        while(i<s.length()){
            switch(s.charAt(i)){
                case 'I':
                    if(i<s.length()-1){
                        if(s.charAt(i+1)=='V'){
                            sol=sol+4;
                            i=i+2;
                            continue;
                        }
                        else if(s.charAt(i+1)=='X'){
                            sol=sol+9;
                            i=i+2;
                            continue;
                        }
                    }
                        sol=sol+1;
                        i++;
                        continue;

                case 'V':
                    sol=sol+5;
                    i++;
                    continue;

                case 'X':
                    if(i<s.length()-1){
                        if(s.charAt(i+1)=='L'){
                            sol=sol+40;
                            i=i+2;
                            continue;
                        }
                        else if(s.charAt(i+1)=='C'){
                            sol=sol+90;
                            i=i+2;
                            continue;
                        }
                    }
                    sol=sol+10;
                    i++;
                    continue;

                case 'L':
                    sol=sol+50;
                    i++;
                    continue;

                case 'C':
                    if(i<s.length()-1){
                        if(s.charAt(i+1)=='D'){
                            sol=sol+400;
                            i=i+2;
                            continue;
                        }
                        else if(s.charAt(i+1)=='M'){
                            sol=sol+900;
                            i=i+2;
                            continue;
                        }
                    }
                    sol=sol+100;
                    i++;
                    continue;

                case 'D':
                    sol=sol+500;
                    i++;
                    continue;

                case 'M':
                    sol=sol+1000;
                    i++;
                    continue;
            }
        }

        return sol;

    }
}
