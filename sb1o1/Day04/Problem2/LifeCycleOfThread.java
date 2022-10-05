package sb1o1.Day04.Problem2;

import java.util.concurrent.ThreadLocalRandom;

/*Q2) Explain the Thread Life Cycle in Java with your
own words.

A Thread in any point of time lie in any of these state :

1.New :-
        When a thread is created.It is a new state.
2. Runnable :- A thread that is ready to run move in runnable state.
3. Block :- A thread is temprorly inactive who comes in this state of waiting.
4. Time waitaing := when a thread calls sleep or a conditional wait, it is moved to a timed waiting state.
5. Terminated :- Thread come in this state for following reasone :-
1. When program runed completly without any error.
3. When any kind of exepection come and program terminated.



*/
public class LifeCycleOfThread {

    public static void main(String[] args) {
//        new thread
        Thread newTread = new Thread(() -> {
            System.out.println("new thread");
            Thread.currentThread().getName();
            Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
            System.out.println(Thread.currentThread().getPriority());
            System.out.println("runing");
            try
            {
//                sleeping / block state
                Thread.sleep(3000);
            }catch (InterruptedException e ){
                e.fillInStackTrace();
            }
            System.out.println("again running");
        });
//runnable
newTread.start();
    }


}
