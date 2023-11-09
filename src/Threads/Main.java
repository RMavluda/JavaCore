package Threads;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World! " + Thread.currentThread().getName());

        MyThread myThread = new MyThread();
        myThread.start();

//        MyThread myThread2 = new MyThread();
//        myThread2.start();
    }
}
/*

class myThread extends Thread{
    int x = 0;
    @Override
    public synchronized void run(){ //Running
        for(int i = 0; i < 10000; i++){
            int temp = x;
            temp++;
            x = temp;
        }
    }

    public int getX(){
        return x;
    }
   */
/* @Override
    public void run(){
        System.out.println("Hello from myThread " + Thread.currentThread().getName());
    }*//*

}*/
