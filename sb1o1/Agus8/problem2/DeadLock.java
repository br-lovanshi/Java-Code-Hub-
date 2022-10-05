package sb1o1.Agus8.problem2;

public class DeadLock extends Thread{
public void fun1(){
    synchronized (this){
        System.out.println(Thread.currentThread().getName());

    }
}
    public void fun2(){
        synchronized (this){
            System.out.println(Thread.currentThread().getName());

        }
    }
    @Override
    public void run(){

        for(int i = 0;i<10;i++){
            System.out.println(currentThread().getName());
            fun1();
            fun2();
        }
    }
}
class Main {
    public static void main(String[] args) {
        DeadLock dl = new DeadLock();
        dl.start();
        DeadLock dl1 = new DeadLock();
        dl1.start();
    }
}