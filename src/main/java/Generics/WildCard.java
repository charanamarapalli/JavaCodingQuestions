package Generics;

public class WildCard {

    TwoD td[]= {new TwoD(1,2), new TwoD(3,4)};
    ThreeD td1[] ={new ThreeD(1,2,3), new ThreeD(4,5,6)};

}

class TwoD {
    int x;
    int y;

    TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ThreeD extends TwoD {
    int z;

    ThreeD(int x, int y, int z) {
        super(x, y);
        this.z=z;
    }
}

class FourD extends ThreeD {
    int a;

    FourD(int x, int y, int z, int a){
        super(x,y,z);
        this.a=a;
    }
}

class coords<T extends TwoD>{
    T[] obj;
    coords(T[] obj){
        this.obj=obj;
    }

    static void showXY(coords<?> c){
        System.out.println("System coordinates are:");
        for(int i=0;i<c.obj.length; i++){
            System.out.println(c.obj[i].x + " " + c.obj[i].y);
            System.out.println();
        }
    }
}
