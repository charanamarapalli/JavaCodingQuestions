package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample1 {
    public static void main(String[] args) {
        Product p=new Product(10,"Sai",4000f);
        Product p1=new Product(100,"Sai1",4010f);
        Product p2=new Product(1010,"Sai2",4002f);
        Product p3=new Product(10101,"Sai3",4030f);
        List<Product> list = new ArrayList<Product>();
        list.add(p);
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //Lambda expression to filter a list

        Stream<Product> filtered_data = list.stream().filter(a->a.price>4002);
        filtered_data.forEach(product -> System.out.println(product.name + " " + product.id));



        List<Product> list1=new ArrayList<Product>();

        list1.add(new Product(1,"HP Laptop",25000f));
        list1.add(new Product(3,"Keyboard",300f));
        list1.add(new Product(2,"Dell Mouse",150f));

        //Lambda expression to sort a collection








    }
}
