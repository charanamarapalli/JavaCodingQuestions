//import org.testng.reporters.jq.INavigatorPanel;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Pascal {
//    public static void main(String[] args) {
//        /*List<List<Integer>> en = generate(10);
//        en.stream().forEach(e-> System.out.println(e));*/
//
//        //System.out.println(factorial(5));
//        //System.out.println(method(13,1));
//
//        List<Integer> list = generateRow(30);
//        list.stream().forEach(s-> System.out.println(s));
//
//
//
//    }
//        public static List<List<Integer>> generate(int numRows) {
//            List<List<Integer>> sol = new ArrayList<>();
//            List<Integer> current, prev = null;
//            for(int i=0; i<numRows; i++){
//                current = new ArrayList<>();
//                for(int j=0; j<=i; j++){
//                    if(j==0 || j==i){
//                        current.add(1);
//                    }
//                    else{
//                        current.add(prev.get(j-1) + prev.get(j));
//                    }
//
//                }
//                sol.add(new ArrayList<>(current));
//
//                prev= current;
//            }
//            return sol;
//        }
//
//        public static List<Integer> generateRow(int numRow){
//            List<Integer> list = new ArrayList<>();
//            list.add(1);
//            long ans=1;
//            for(int i=1;i<=numRow;i++){
//                ans=ans*(numRow+1-i);
//                ans = ans/i;
//                list.add((int)ans);
//            }
//            return list;
//        }
//
//        public static int methodLearn(int val){
//        return 1;
//
//        }
//
//       /* public static int factorial(int num){
//        if(num==1){
//            return num;
//        }
//        return num * factorial(num-1);
//        }
//
//        public static int method(int numRow, int i){
//        int a=factorial(numRow);
//        int b=factorial(i);
//        int c= factorial(numRow-i);
//            //System.out.println(a + "break " + b + " break"+ c);
//            return a/(b*c);
//
//            //return factorial(numRow) /(factorial(i) * factorial(numRow-i));
//
//        }*/
//    }
