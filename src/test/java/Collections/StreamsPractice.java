package Collections;/*
import java.util.*;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;

public class StreamsPractice {


    public static void main(String[] args) {

        int score = 0;
        int score_new = 0;
        String s = "hi john this is me";
        String arr1[] = s.split(" ");
        for (int i = 0; i < arr1.length-1; i++) {
            for (int j = 0; j < arr1[i].length()-1; i++) {
                score = score + arr1[i].charAt(j) - 'a' + 1;
                String str = arr1[i];
                if (score > score_new) {
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = str;
                }
            }
        }

        ArrayList<String> arr = new ArrayList<>();

        ArrayList<Integer> intarr = new ArrayList<Integer>();
        intarr.add(5);
        intarr.add(6);
        intarr.add(10);
        intarr.add(1);

        arr.add("cherry");
        arr.add("sai");
        arr.add("naidu");
        arr.add("amarapalli");
        */
/*List<Integer> arr2 = intarr.stream().filter(i -> (i == 10)).collect(Collectors.toList());
        List<String> arr3 = arr.stream().filter(i -> {
            int l = i.length();
            if (l > 4) ;
            return true;
        }).collect(Collectors.toList());
        System.out.println(arr3);
*//*



        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        //System.out.println(names.stream().filter(name->name.length()>3).collect(Collectors.toList()));

        //names.stream().peek(a-> System.out.println("Initial Values are" + a)).forEach(a-> System.out.println("Later values are" + a));

        method();

        // Create a new HashMap
        Map<String, Integer> myMap = new LinkedHashMap<>();

        // Add some key-value pairs to the map
        myMap.put("SAlice", 25);
        myMap.put("Bob", 30);
        myMap.put("Charlie", 35);

        // Retrieve a value by its key
        int age = myMap.get("SAlice");
        System.out.println("Alice's age is " + age);


        for(String key: myMap.keySet()){
            System.out.println(key + "=" + myMap.get(key));
        }

        for(Integer asd: myMap.values()){
            System.out.println(asd);
        }

        for(Map.Entry<String, Integer> asd: myMap.entrySet()){
            System.out.println(asd.getKey()+"="+ asd.getValue());
        }

        List<String> list1 = myMap.keySet().stream().map(set-> set+" Added").collect(Collectors.toList());
        System.out.println(list1);

        List<Integer> list2 = myMap.values().stream().map(set-> set*3 ).collect(Collectors.toList());
        System.out.println(list2);

        Map<String, Integer> filteredMap = myMap.entrySet().stream().map(entry -> new AbstractMap.SimpleEntry<>(entry.getKey(), entry.getValue()+10)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(filteredMap);

        Optional<Integer> value = myMap.values().stream().reduce((a,b)->(a+b));

        if(value.isPresent()){
            System.out.println(value);
        }

        boolean saiwe = myMap.entrySet().stream().allMatch(entry -> entry.getValue()>30);

        System.out.println(saiwe);

        int arr10[]=  {1, 3, 7, 5, 6, 2 };
        int n= arr10.length;

        findMissing(arr10, n);




    }


    public static void method() {


//        saiInterface sai = parameter -> {
//            System.out.println(parameter);
//            return parameter;
        };

        sai.saiMethod("charan");
    }

    @FunctionalInterface
    public interface saiInterface {
        String saiMethod(String string);
    }


    public static void findMissing(int arr[], int N)
    {
        int i;
        int temp[] = new int[N + 1];
        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }

        for (i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;
        }

        int ans = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.println(ans);

        Map<Integer, String> hm = new HashMap<>();

        for(Map.Entry<Integer, String> entry: hm.entrySet()){
            System.out.println(entry);
        }
        hm.entrySet().stream().map(entry -> new AbstractMap.SimpleEntry<Integer, String>(entry.getKey(), entry.getValue()+10)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

}
*/
