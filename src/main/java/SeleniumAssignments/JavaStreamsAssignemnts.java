package SeleniumAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamsAssignemnts {

    public static void main(String[] args) {
        //find alphabets started with a
        List<String> list = new ArrayList<>();
        list.add("abhi");
        list.add("charan");
        list.add("aruna");

        list.stream().forEach(a -> System.out.println(a));

        List list1 = list.stream().filter(a -> a.charAt(0)=='a').collect(Collectors.toList());
        for(Object s:list1){
            System.out.println(s);
        }



        List<String> lst = list.stream().map(a-> a+" added text").collect(Collectors.toList());

        Iterator<String> it= lst.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        List<String> lst1 = list.stream().sorted().collect(Collectors.toList());

        List<Integer> intw= Arrays.asList(1,2,3,4,1,0);

         Object[] arr= intw.stream().sorted().toArray();
        System.out.println(arr[0]);
        List<Integer> lst123 = intw.stream().distinct().collect(Collectors.toList());


    }
}
