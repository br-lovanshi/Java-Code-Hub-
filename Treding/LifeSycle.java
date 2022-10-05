package Treding;
/*
Life Cyvle of Thread :-
* New
*Runnable
* Blocked
* Waiting
* Timed Waiting
* Terminated
*
*
* */

import org.w3c.dom.events.EventException;

import javax.swing.plaf.TableHeaderUI;
import java.util.Map;

class ThreadC implements Runnable {
    public void run(){
        try {
            Thread.sleep(1000);
        }catch ( InterruptedException e){
            e.fillInStackTrace();
        }
//        System.out.println;

        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e ){
            e.fillInStackTrace();
        }

    }
}
class Test implements Runnable {
    public void run(){
        try{
            Thread.sleep(100);
            Thread.currentThread().setName("hello");
            System.out.println(Thread.currentThread().getName());
            Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
            System.out.println(Thread.currentThread().getPriority());
            System.out.println(Thread.currentThread().getId());
        }catch (InterruptedException e ){
            e.fillInStackTrace();

        }
    }
}
public class LifeSycle {
    public static void main(String[] args) {
        Test t = new Test();
        Thread th = new Thread(t);
        th.start();
    }
}
