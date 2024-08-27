package Oops;

public class Constructors {
    int a;
    String b;

    public Constructors(int a,String b){
        this.a=a;
        this.b=b;
    }



    public static void main(String[] args){
        Constructors axe = new Constructors(10, "spc");     //if there is no constructor, by default complier will create a default constructor.
        Constructors axe1= new Constructors(10, "spc");    //while creating a obj of that class, If we send values- Those will get saved in that.
        Constructors axe2=axe1;
        boolean a= (axe==axe1);
        boolean b= (axe2==axe1);
        boolean c= (axe.equals(axe1));
        boolean d=(axe2.equals(axe1));
        System.out.println(a+""+b+""+c+""+d);


        //equals method is used to
    }

}
