package Treding;

public class thread6 extends Thread {
    @Override
    public void run(){
        for(int i  = 0;i<4;i++){
            System.out.println("thread 1st ");

        }

            }
}
class thread7 extends Thread {
    @Override
    public void run(){
for(int i = 0;i<4;i++){
    System.out.println("thread 2nd ");

}
    }
}

class main {
    public static void main(String[] args) {
        Thread thread1  = new thread6();
        Thread thread2  = new thread7();
        thread2.start();
        try {
//            thread1.join();
            thread2.join();
        }catch (InterruptedException e ){
            e.fillInStackTrace();
        }
        thread1.start();
    }
}
