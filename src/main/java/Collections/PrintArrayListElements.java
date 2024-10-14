package Collections;//import java.sql.SQLOutput;
//import java.util.*;
//
//public class PrintArrayListElements {
//    String Name;
//    int id;
//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String Name) {
//        this.Name= Name;
//    }
//
//    public Integer getid() {
//        return id;
//    }
//
//    public void setid(int id) {
//        this.id = id;
//    }
//
//    public String toString(){
//        return Name+":"+id;
//    }
//
//    public static void main(String[] args) {
//        PrintArrayListElements p= new PrintArrayListElements();
//        p.setName("charan");
//        p.setid(10);
//
//
//        //PrintArrayListElements p1=new PrintArrayListElements("sai",10);
//        //PrintArrayListElements p2=new PrintArrayListElements("sai2",28);
//        //PrintArrayListElements p3=new PrintArrayListElements("sai3",15);
//        System.out.println("boithisisawsm" + p);
//        ArrayList<PrintArrayListElements> arr=new ArrayList<>();
//        arr.add(p);
//        System.out.println("check" + p);
//        p.setid(50);
//        arr.add(p);
//        System.out.println("check1" + p);
//
//
//        System.out.println(arr);
//        Collections.sort(arr,(id1,id2)->(id1.id>id2.id)?-1:(id1.id<id1.id)?+1:0);
//        System.out.println(arr);
//        Collections.sort(arr,(id1,id2)->id1.Name.compareTo(id2.Name));
//        //Collections.sort(arr,(id1,id2)-> Comparator.comparing(PrintArrayListElements::Name);
//
//        System.out.println(arr);
//
//        //List<PrintArrayListElements> alphabets = new ArrayList<PrintArrayListElements>(Arrays.asList(new PrintArrayListElements("sai",10), new PrintArrayListElements("che", 20)));
//        //System.out.println("qwerty" + alphabets);
//        //alphabets.forEach(s -> System.out.println(s));
//        arr.forEach(s-> System.out.println(s));
//        PrintArrayListElementsMethod2 pr= new PrintArrayListElementsMethod2();
//        ArrayList<PrintArrayListElements> adhurs = pr.method2();
//        p.setName("saiboi");
//        adhurs.add(p);
//        System.out.println(adhurs);
//
//
//    }
//}
//
//
