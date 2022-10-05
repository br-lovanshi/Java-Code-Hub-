package sb1o1.Agus8.problem2;

import Treding.MultiThreding.Theard1;

import java.util.concurrent.ThreadLocalRandom;

/*
*
* The main work of ThreadPoolExecutor  is to seprate the task execution or creation.
* WIth the help of ThreadPoolExecutor we can implement one runnable object.
* it is very important to instantiating and running the task with important thead,
*
* when we send task to executor it is used pooled thread to execute the task for avoid the swaping of theads
 * */
public class TreadPoll implements Runnable {

String name;

    public TreadPoll(String name) {
        this.name = name;
    }

    @Override
    public void run(){
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

        System.out.println(name);

}
}
class main{
    public static void main(String[] args) {
        Thread t = new Thread(new TreadPoll("Brajesh"));

        t.start();
    }
}