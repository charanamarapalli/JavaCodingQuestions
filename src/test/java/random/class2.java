package random;
//package api;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class class2 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<String> a = new ArrayList<>();
//        a.add("aabbcc");
//        a.add("wecp");
//
//        List<String> b = new ArrayList<>();
//        a.add("abccba");
//        a.add("pewc");
//
//        //String result = canGene(a, b) ? "YES" :"NO";
//        //System.out.println(result);
//        printAllDivisions(5);
//    }
//
//    public static void method(int n){
//        for(int i=0; i<n;i++){
//            for(int j=0;j<n-i+1;j++){
//
//            }
//        }
//    }
//
//    public static void printAllDivisons(int n){
//        for(int i =1; i<=(n/2); i++){
//            if((n/i)==0){
//                System.out.println(i);
//                System.out.print("/");
//            }
//        }
//    }
//
//    static boolean canGene(List<String> a, List<String> b){
//
//        /*int startIndex = -1;
//
//        for(int i=0; i<Math.min(a.size(), b.size()); i++){
//            if(!a.get(i).equals(b.get(i))){
//                startIndex=i;
//                break;
//            }
//        }
//
//        if(startIndex == -1){
//            return true;
//        }
//
//        for(int i= startIndex; i<a.size(); i++){
//            if(!a.get(i).equals(b.get(i))){
//                return false;
//            }
//        }
//
//        for(int i=0; i<startIndex; i++){
//            if(!a.get(i).equals(b.get(b.size()-startIndex+i))){
//                return false;
//            }
//        }
//
//        return true;*/
//
//        /*for (int i = 0; i < a.size(); i++) {
//            boolean foundMatch = true;
//
//            // Check if 'a' can be generated starting from the i-th string
//            for (int j = 0; j < a.size(); j++) {
//                int k = (i + j) % a.size();
//                if (!a.get(j).equals(b.get(k)) && !b.get(j).equals(a.get(k))) {
//                    foundMatch = false;
//                    break;
//                }
//            }
//            if (foundMatch) {
//                return true;
//            }
//        }
//        return false;*/
//
//        String concaA = String.join("", a);
//
//        for(int i=0; i<b.size(); i++){
//            String roateB = b.get(i) + String.join("", b.subList(i+1, b.size())) + String.join("", b.subList(0, i));
//
//            if(concaA.equals(roateB)){
//                return true;
//            }
//        }
//        return false;
//    }
//
//
//
//}
