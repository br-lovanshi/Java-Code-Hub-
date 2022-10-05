package Treding;

class ClassExtedingThred extends Thread {

    @Override
    public void run(){
        System.out.println("Hello from 1st way ");
    }
}
class ImplementsRunable implements Runnable  {

    @Override
    public void run(){

        System.out.println("Hello from 2nd way");
    }

}


public class Thred1 {
//    first way
    public static void main(String[] args) {
        ClassExtedingThred one = new ClassExtedingThred();
        one.start();
//        second way
        Thread secondway = new Thread(new ImplementsRunable() );
        secondway.start();

//        lemda way

        Thread lemdaWay = new Thread(() -> System.out.println("using lemda way "));
        lemdaWay.start();

        Thread anonymousWay = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("|AnonymousWay");
            }
        });
        anonymousWay.start();



    }

}
