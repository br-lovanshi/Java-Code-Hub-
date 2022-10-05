package Treding.MultiThreding;

class C {
    int c = 0;
  synchronized public void increment(){
        c++;
    }
   synchronized public void decrement(){
        c--;
    }
    public int print(){
        return c;
    }


}

public class Syncronised {
    public static void main(String[] args) {
        C c1 = new C();
       c1.decrement();
//        c1.increment();
      System.out.println(c1.print());
    }
}
