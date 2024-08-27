package Collections;



public class Employee implements java.lang.Comparable<Employee> {


    Integer id;
    String name;

    Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public int compareTo(Employee o) {
        return this.name.length() > o.name.length() ? 1: this.name.length() < o.name.length() ? -1 :0;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

}
