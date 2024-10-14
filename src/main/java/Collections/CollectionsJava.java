package Collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//import java.util.stream.Collectors;

public class CollectionsJava {


    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(new Employee(1, "sai"), new Employee(2, "Charan"), new Employee(3, "Naidu"));
/*
        List<Employee> sortedList = list.stream().sorted(Employee::compareTo).collect(Collectors.toList());

        for (Employee emp : sortedList) {
            System.out.println(emp.id + " " + emp.name);
        }

        List<Employee> sortedList1 = list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());*/

        /*for (Employee emp : sortedList1) {
            System.out.println(emp.id + " " + emp.name);
        }*/

    }
}
