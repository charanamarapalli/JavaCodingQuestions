//import java.util.*;
//
//public class StringInIt {
//
//    public static void main(String[] args) {
//        //System.out.println(method("tamtexttamtext", "tam"));
//        //System.out.println(countSumOfIntegers("a1b2c3d4"));
//        //System.out.println(reverseWords("Java is a programming language"));
//        //System.out.println(nonRepeatingCharactersSum("comiccomedy"));
//        //spacePrblm("abc edf ghi \"Threads.sai def char\" charan");
//        hashingProblem("occurrences");
//
//    }
//
//    public static void spacePrblm(String s){
//        System.out.println(s);
//        List<String> list = new ArrayList<>();
//        boolean value = false;
//        StringBuilder sb = new StringBuilder();
//
//        for(char c:s.toCharArray()){
//            if(c=='"'){
//                sb.append(c);
//                value=!value;
//            }
//
//            else if(c==' ' && !value){
//                sb.append(c);
//                list.add(sb.toString());
//                sb.setLength(0);
//
//            }
//
//            else{
//                sb.append(c);
//            }
//        }
//
//        list.add(sb.toString());
//
//        for(String str:list){
//            System.out.println(str);
//        }
//
//    }
//
//    public static void hashingProblem(String s){
//        int arr[] = new int[26];
//        HashSet<Character> hs = new LinkedHashSet<>();
//
//        for(char c:s.toCharArray()) {
//            if(hs.contains(c)){
//                arr[c - 97] = arr[c - 97] + 1;
//            }
//            else{
//                hs.add(c);
//                arr[c-97]=1;
//                }
//
//        }
//        StringBuilder sb = new StringBuilder();
//        /*for(char c:hs){
//            System.out.println(c);
//        }*/
//        String oup="";
//
//
//            for(char c:hs){
//                oup=oup+c+arr[c-97];
//                sb.append(c).append(arr[c-97]);
//                //System.out.println("current value: "+sb + "element picked from set"+ c);
//            }
//        System.out.println("using string: "+oup);
//
//        System.out.println("final answer is: "+ sb.toString());
//
//    }
//
//    public static int method(String text, String name) {
//        int a = 0;
//        int b = 0;
//        String s = "";
//        int answer = 0;
//        if (name.length() == 0 || text.length() == 0) {
//            return 0;
//        }
//        while (b + name.length() < text.length()) {
//            if (s.length() < name.length()) {
//
//                s = s + text.charAt(a);
//                a++;
//            }
//            if (s.length() == name.length()) {
//                if (s.equals(name)) {
//                    answer++;
//                }
//                b++;
//                s = s.substring(1);
//            }
//        }
//
//        return answer;
//    }
//
//    public static int countSumOfIntegers(String s) {
//        int answer = 0;
//        int i = 0;
//        while (i < s.length()) {
//            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
//                int val = s.charAt(i) - '0';
//                answer += val;
//
//            }
//            i++;
//        }
//
//        return answer;
//    }
//
//    public static String reverseWords(String s) {
//        String[] arr = s.split(" ");
//        String output = "";
//        for (int i = arr.length - 1; i >= 0; i--) {
//            if (i == arr.length - 1) {
//                output = arr[i];
//                continue;
//            }
//            output = output + " " + arr[i];
//
//        }
//        return output;
//
//    }
//
//    public static int nonRepeatingCharactersSum(String s) {
//        int answer = 0;
//        HashMap<Character, Integer> hm = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (!hm.containsKey(s.charAt(i))) {
//                hm.put(s.charAt(i), 1);
//            } else if (hm.get(s.charAt(i)) > 0) {
//                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
//            }
//        }
//
//        for (Map.Entry<Character, Integer> ent : hm.entrySet()) {
//            if (ent.getValue() == 1) {
//                answer++;
//            }
//        }
//
//        return answer;
//    }
//
//
//}
