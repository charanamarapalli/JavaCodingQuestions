package Threads;

public class Thread1 extends Thread{

    public static void main(String[] args) {

        Thread1 tr= new Thread1();
        Thread1 tr1= new Thread1();
        tr.start();
        tr1.start();

        try{
            tr.join();
            tr1.join();
        }
        catch (InterruptedException e){

        }

    }

    public void run(){
        //System.out.println("hey");
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
        System.out.println(Thread1.currentThread().getName() + " asd " + Thread1.class);
    }
}
