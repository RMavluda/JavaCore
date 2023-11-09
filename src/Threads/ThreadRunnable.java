package Threads;

public class ThreadRunnable {
    public static void main(String[] args) {
        System.out.println("Hello World! " + Thread.currentThread().getName());

        MyThread myThread = new MyThread();
        myThread.start();

        MyThreadRunnable r1 = new MyThreadRunnable();
        Thread t2 = new Thread(r1);
        t2.start();

        Thread t3 = new Thread(r1);
        t3.start();

    }
}/*
class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Hello from myThread " + Thread.currentThread().getName());
    }
}

class MyThreadRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from Runnable Thread " + Thread.currentThread().getName());

    }
}
*/