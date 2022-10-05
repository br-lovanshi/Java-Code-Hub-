package Treding;

import java.util.TreeMap;

public class ThreadStateLifeCycle {

    public static void main(String[] args) {

        Thread thread = new Thread( () -> {
            System.out.println("thread is running");
            Thread.currentThread().setName("start..");
            System.out.println(Thread.currentThread().getName());
            Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
//            System.out.println(Thread.currentThread().getPriority());
            System.out.println("Sleeping");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
            e.fillInStackTrace();
            }
            System.out.println("waking up...");
        });

thread.start();;
    }

}
