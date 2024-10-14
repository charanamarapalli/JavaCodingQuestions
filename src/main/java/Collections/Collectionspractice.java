package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Collectionspractice {

    public static void main(String[] args) {
        ArrayList arl=new ArrayList();
        arl.add("String");
        arl.add(10);
        LinkedList ll=new LinkedList(arl);
        Iterator i=ll.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


        TreeSet tr=new TreeSet();
        tr.add(10);
        tr.add(0);
        tr.add(5);
        tr.add(15);
        System.out.println(tr);



    }


}
