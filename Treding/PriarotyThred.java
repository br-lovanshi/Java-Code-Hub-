package Treding;

import com.sun.xml.internal.ws.message.stream.StreamHeader;

import javax.swing.plaf.TableHeaderUI;

public class PriarotyThred {

    public static void main(String[] args) {

        Thread firstThread = new Thread(

                () -> {
//                    System.out.println();
                Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
                Thread.currentThread().setName("focus bro");
                for(int i = 0;i<10;i++){
                        System.out.println("first thread is running");
                    }
                }

        );

        Thread secondThread = new Thread(

                () -> {

                    Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
                    Thread.currentThread().setName("Career is Important");
                    for(int i = 0;i<10;i++){
                        System.out.println("second thread" +
                                "+");
                    }
                }
        );

        firstThread.start();
        secondThread.start();

    }
}
