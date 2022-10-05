package Treding;

public class Thread1 extends Thread{

    @Override
    public void run(){
for (int i = 0;i<4;i++){
    System.out.println(" thread1 is running ");

}
    }

}

class Thread2 extends Thread {
    @Override
    public void run() {
for(int i  = 0;i<5;i++ ){
    System.out.println("Therad2 is run ");

}
    }
}

class ThreadImplement1 implements Runnable {

    @Override
    public void run (){
        int i = 0;
        while(i <8){
            System.out.println("Thread implementing one ");
        i++;
        }

    }
}

class ThreadImplemtent2 implements Runnable {

    @Override
    public void run(){
        int i = 0;
        while(i<4){
            System.out.println("ThreadImplemetns two... ");
            i++;
        }
    }
}

class MainT {
    public static void main(String[] args) {
        Thread1 classExtends = new Thread1();
        classExtends.start();
        Thread2 classExtedns2 = new Thread2();
        classExtedns2.start();

        ThreadImplement1 thread1 = new ThreadImplement1();
        Thread th = new Thread(thread1);

        Thread th1 = new Thread(new ThreadImplemtent2());
        th.start();
        th1.start();




    }
}