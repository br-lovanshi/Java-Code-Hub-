package sb1o1.Day04.Problem1;


import java.util.concurrent.ThreadLocalRandom;

public class Problem1 implements Runnable {
    int num =1;
    @Override
    public void run(){
        System.out.println("FIrst thread");
        for(int i = 1;i<11;i++){
            num *= i;

        }    System.out.println(num);
    }
}
class Main {
    public static void main(String[] args) {
        Thread one = new Thread(new Problem1());
        Thread two = new Thread(one);
        two.start();

    }
}