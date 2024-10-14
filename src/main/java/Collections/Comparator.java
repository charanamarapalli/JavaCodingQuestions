//package Collections;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class Comparator {
//
//    public static void main(String[] args) {
//        Employee emp1 = new Employee(1, "Sai");
//
//        Employee emp2 = new Employee(2, "Charan");
//
//        Employee emp3 = new Employee(3, "Naidu");
//
//        List<Employee> list = new ArrayList<>();
//
//        list = Arrays.asList(emp1, emp2, emp3);
//
//
//        Student st1= new Student(10,"sai");
//
//        Student st2 = new Student(2, "Charan");
//
//        Student st3 = new Student(3, "Naidu");
//
//        List<Student> lis1 = Arrays.asList(st1, st2, st3);
//
//        java.util.Comparator<Student> comparator= (s1, s2)->s1.studentName.compareTo(s2.studentName)>0?1:(s1.studentName.compareTo(s2.studentName)<0)?-1:0;
//
//        java.util.Comparator<Student> comparator2= (s1, s2)->(s1.studentId-s2.studentId)>0?1:(s2.studentId-s1.studentId)<0?-1:0;
//
//        System.out.println(lis1);
//
//        Collections.sort(lis1, comparator2);
//        System.out.println(lis1);
//
//        /*for(Student st:lis1){
//            System.out.println(st.studentId +" "+  st.studentName);
//        }*/
//
//
//
//    }
//
//
//}
//
