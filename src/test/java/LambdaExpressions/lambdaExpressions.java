//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Consumer;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//interface lambda {
//    public void show();
//}
//
//
//public class lambdaExpressions {
//
//    public static void main(String[] args) {
//        //lambda d= () -> System.out.println("charan");
//
//        List<Integer> Threads.sai = new ArrayList<>();
//        Threads.sai.add(1);
//        Threads.sai.add(2);
//        Threads.sai.add(3);
///*        for (int charan: Threads.sai) {
//            System.out.println(charan);
//
//        }
//
//        Threads.sai.forEach(
//                (n)->System.out.println(n)
//        );
//        Threads.sai.forEach(
//                (n)->{System.out.println(n);
//                    System.out.println("charan");}
//        );*/
//
//        //Threads.sai.stream().forEach((a)->System.out.println(a*a));  //Void
//
//
//        System.out.println(Threads.sai);
//
//        //d.show();
//
//        List<String> cherry = new ArrayList<>();
//        cherry.add("Threads.sai");
//        cherry.add("saire");
//        cherry.add("punch");
//
//        //cherry.stream().forEach((a)->System.out.println(a+"added  ew"));   //void
//
//        //List<Integer> cherrynew = cherry.stream().filter()
//
//        MyConsumer cs= new MyConsumer();
//
//
//        cherry.stream().filter(a -> a.startsWith("s")).forEach(cs);
//        System.out.println(cs.getCount());
//
//
//        Stream<String> st = cherry.stream().peek(cs);
//        System.out.println(st.findFirst());
//        //String a= (String)st.findFirst();
//
//
//    }
//
//
//}
//
//class MyConsumer implements Consumer<String> {
//    private int count;
//
//    @Override
//    public void accept(String t) {
//        System.out.println(t);
//        count++;
//    }
//
//    public int getCount() {
//        return count;
//    }
//}
//
