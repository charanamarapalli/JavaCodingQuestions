package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperLowerNoBoundWildcard {


    private static Double add(ArrayList<? extends Number> num) { //UpperBound

        double sum=0.0;

        for(Number n:num)
        {
            sum = sum+n.doubleValue();
        }

        return sum;
    }

    static void display(List<?> list){ //NoBound
        for(Object o:list){
            System.out.println(o);
        }
    }

    static void show(List<? super Integer> list){
        for(Object o: list){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {

        //Upper Bound

        ArrayList<Integer> l1=new ArrayList<Integer>();
        l1.add(10);
        l1.add(20);
        System.out.println("displaying the sum= "+add(l1));

        ArrayList<Double> l2=new ArrayList<Double>();
        l2.add(30.0);
        l2.add(40.0);
        System.out.println("displaying the sum= "+add(l2));

        //No Bound
        List<Integer> arr= Arrays.asList(1,2,3);
        display(arr);
        display(l2);

        //Lower Bound
        List<Number> num = Arrays.asList(1.0,2.5,1,3);
        show(num);

        List<Rectangle> num1 = Arrays.asList(new Rectangle(), new Rectangle());
        // show(num1);   -- Using it, it throws error.

    }

}
