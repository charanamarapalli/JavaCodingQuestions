package Threads;

public class Thread2 {

    public static void main(String[] args) {
        Runs r = new Runs();
        Thread tr = new Thread(r);
        tr.start();

    }
}

class Runs implements Runnable{
    public void run(){
        System.out.println("hey");
    }
}
