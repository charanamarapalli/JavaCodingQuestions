package Generics;

class Gen<T> {

    T ob;
    Gen(T ob){
        this.ob=ob;
    }

    T getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Type of t is" + ob.getClass().getName());
    }
}

public class genDemo{
    public static void main(String[] args) {
        Gen<Integer> iob =new Gen<Integer>(10);
        iob.showType();
    }
}


