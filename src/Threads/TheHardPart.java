package Threads;
// Thread.sleep(), Thread.yield(), join()
public class TheHardPart {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World! " + Thread.currentThread().getName());

        MyThread myThread = new MyThread(); //new
        myThread.start(); //ready

        //    Thread.sleep(1000);
        myThread.join();

        MyThreadRunnable r1 = new MyThreadRunnable();
        Thread t2 = new Thread(r1);
        t2.start();

        System.out.println("Main thread is dead!");
    }
}
class MyThread extends Thread{


    @Override
    public void run(){ //Running
        for(int i = 0; i < 100; i++){
            System.out.println(i + " " + Thread.currentThread().getName());
            Thread.yield();
        }
    }
}


class MyThreadRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }

}