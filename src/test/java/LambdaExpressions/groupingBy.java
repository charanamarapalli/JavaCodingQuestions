package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class groupingBy {




    private static List<Person> getPersons() {
        List<Person> results = new ArrayList<>();


        results.add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
        results.add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
        results.add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
        results.add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
        results.add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));
        results.add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
        results.add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));
        results.add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
        results.add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));
        results.add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));

        results.add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));
        results.add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));
        results.add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));
        results.add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));
        results.add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));
        results.add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));
        results.add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));
        results.add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));
        results.add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));
        results.add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));

        return results;
    }

    public static void main(String[] args) {
        getPersons().stream().forEach(Person -> System.out.println(Person.age));
    }


}
