//package streams;
//
//import com.google.gson.Gson;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Consumer;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class JavaStreamCreation {
//    private static Employee[] arrayOfEmps = {
//            new Employee(1, "Jeff Bezos", 100000.0),
//            new Employee(2, "Bill Gates", 200000.0),
//            new Employee(3, "Mark Zuckerberg", 300000.0)
//    };
//
//    public static void main(String[] args) {
//
//       /* Stream.of(arrayOfEmps);    //Stream of arrays
//
//        Stream.of(arrayOfEmps[0], arrayOfEmps[1]);   //Stream created using adding few elements of array
//
//        List<Employee> list;
//        list = Arrays.asList(arrayOfEmps);
//        Stream.of(list);     //Stream of List*/
//
//        List<Integer> lis = Arrays.asList(1, 2, 3);
//        /*Consumer<Integer> con = JavaStreamCreation::method;
//        Consumer<Integer> con1 = s -> System.out.println(s + 100);
//        lis.stream().forEach(a -> con.accept(a));
//        lis.stream().forEach(a -> con1.accept(a));*/
//        /*lis.stream().forEach(a -> System.out.println(a));*/
//
//
//        List<Integer> lis3 = lis.stream().filter(a -> (a%2)==0).collect(Collectors.toList());
//
//         for(Integer int1: lis3){
//             System.out.println(int1);
//
//         }
//
//        // lis.stream().forEach(s -> System.out.println(s));
//        Gson gson = new Gson();
//
//
//    }
//
//    public static void method(int a) {
//        System.out.println(a + 10);
//    }
//
//}
