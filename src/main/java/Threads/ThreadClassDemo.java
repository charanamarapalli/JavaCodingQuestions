package Threads;

/*public class Threadtutorial{
    public static void main(String[] args) {
        System.out.println("CharanAmarapalli");
        for(int i=0;i<10;i++) {
            System.out.println("Print" + i);
        }
        Thread printer2=new werd();
        printer2.start();
        System.out.println("Logged off");
    }
}
class werd extends Thread{
    @Override
    public void method(){
        for(int i=0;i<10;i++) {
            System.out.println("Print peinter" + i);
        }

    }
}*/
class sai implements Runnable{

    public void run(){
        for(int i=0;i<10;i++) {
            System.out.println("Threads.sai implements Runnable");
        }
    }

}
class Worker extends Thread {


    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

}

public class ThreadClassDemo {
    public static void main(String[] args) {
        Thread t1 = new Worker(); //parent reference used to create child objects.
        Thread t2 = new Worker();
        Thread t3 = new Worker();
        sai s=new sai();
        Thread t=new Thread(s);
        t.start();
        t1.start();
        t2.start();
        t3.start();

    }
}
