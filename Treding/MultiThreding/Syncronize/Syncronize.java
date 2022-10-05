package Treding.MultiThreding.Syncronize;

import jdk.nashorn.internal.runtime.ECMAException;

class Comman  {
    public void  fun1(String name) {

        System.out.println("helloo " );
        synchronized(this){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.fillInStackTrace();
            }
        }     System.out.println(name);
    }
}

class ThreadA extends Thread {

    Comman c;
    String name;

    public ThreadA(Comman c, String name) {
        this.c = c;
        this.name = name;
    }
    @Override
    public void run(){
        c.fun1(name);
    }
}
class ThreadB extends Thread {
    Comman c;
    String name;
    public ThreadB(Comman c, String name) {
        this.c = c;
        this.name = name;
    }
    @Override
    public void run(){
        c.fun1(name);
    }

}
public class  Syncronize {
    public static  void main(String[] args) {
Comman c = new Comman();
        ThreadA one = new ThreadA(c,"brajesh");
        ThreadB two = new ThreadB(c,"java");
        one.start();
        two.start();
    }
}
