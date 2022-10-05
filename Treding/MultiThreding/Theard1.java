package Treding.MultiThreding;

import sb1o1.Day04.Problem1.Problem1;

import java.util.concurrent.ThreadLocalRandom;

class ThreadOne implements Runnable {
    int num = 0;
    @Override
    public void run() {
Thread.currentThread().setPriority(10);
        for(int i = 0; i<10;i++){
            num += i;
           System.out.println("num i is " );
        }
    }
}
public class Theard1 {
    public static void main(String[] args) throws InterruptedException {
ThreadOne thread = new ThreadOne();
        Thread t1 = new Thread(thread);
        t1.start();
        t1.join();

        int result = thread.num;

        for(int i = 0;i<10;i++){
            System.out.println(result);
        }


    }
}
