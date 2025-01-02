package Generics;

public class BoundedType {

    public static void main(String[] args) {

        Integer st[] = {1,2,3};
        Stats<Integer> st1=new Stats<Integer>(st);
        double v = st1.average();


        Double dnums[] ={1.0,2.0,3.0};
        Stats<Double> st2=new Stats<Double>(dnums);
        double v1=st2.average();

        if(st1.sameAvg(st2)){
            System.out.println("i m here");
        }
        else{
            System.out.println("i m second");
        }




    }
}
//Bounded
class Stats<T extends Number>{
    T[] arrs;
    Stats(T[] arrs){
        this.arrs =arrs;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < arrs.length; i++) {
            sum = sum + arrs[i].doubleValue();
        }
        return sum / arrs.length;
    }

        void mehtod(){
            System.out.println( arrs.getClass().getName());
        }

        //Wild Card
        boolean sameAvg(Stats<?> arrs){
        if(average()==arrs.average()){
            return true;
        }
        return false;
        }

}
