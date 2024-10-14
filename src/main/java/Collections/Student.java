package Collections;

import java.util.Comparator;

public class Student {

    int studentId;
    String studentName;

    Student(int studentId, String studentName){
        this.studentId= studentId;
        this.studentName=studentName;
    }

   /* public int compare(Student s1, Student s2){
        return s1.studentName.compareTo(s2.studentName)>1?1:(s1.studentName.compareTo(s2.studentName)<1)?-1:0;
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
