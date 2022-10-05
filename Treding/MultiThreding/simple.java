package Treding.MultiThreding;

import java.util.concurrent.ExecutionException;

class A implements Runnable {
    int num = 0;
String [] ar = {"one","Two ","three","four ","five"};
   synchronized   public  void run(){
        for(int i = 0; i<ar.length;i++ ){
//            num += i;
try{
    System.out.println(ar[i]);

    Thread.sleep(2000);
} catch (InterruptedException e) {
    throw new RuntimeException(e);
}
        }
        try{
            Thread.sleep(2000);
        }catch ( InterruptedException e){
            e.fillInStackTrace();
        }
        System.out.println("CHill bro ");
    }

}
public class simple {
    public static void main(String[] args) throws InterruptedException {
//        String str = "hhellllllooooo    woooooorldddddd      !!!!!!!!!";
//        System.out.println(str);
//        str = str.replaceAll("(.)\\1+","$1");
//        System.out.println(str);
        Thread t1 = new Thread(new A());
        t1.start();
//        t1.join();
        Thread t2 = new Thread(new A());
        t2.start();


//        int c = 0;
//
//        for (int i = 0;i<5;i++ ){
//            System.out.println("main t " +  c++);
//        }


    }
}
