package MultiThreading.RaceCondition;

public class Common {


    public void fun1(String name) {
        synchronized (this) {
            System.out.println("walcome");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(name);
        }
    }
}

class ThreadA extends Thread {
    Common c;
    String name;

    public ThreadA(Common c,String name){
        this.c = c;
        this.name = name;
    }
    @Override
    public void run(){
        c.fun1(name);
    }
}

class ThreadB extends Thread {
    Common c ;
    String name;
    public ThreadB(Common c, String name){
        this.c = c;
        this.name = name;
    }


        @Override
        public void run() {
        System.out.println("walcome");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name);
    }

}
class Main {
    public static void main(String[] args) {
        Common c = new Common();
        ThreadA a = new ThreadA(c,"brajesh");
        a.start();
        Thread b = new ThreadB(c,"vicky");
        b.start();
    }
}