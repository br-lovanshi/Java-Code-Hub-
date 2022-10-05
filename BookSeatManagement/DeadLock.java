package BookSeatManagement;
/*
 * 
Dead Lock:- A lock without key is nothing but deadlock.
If two synchronized threads are waiting for each other forever(for infinite time).
The synchronized keyword is the only reason for deadlock.

We can't resolve the dead lock because there is no any solution for deadlock but there are several prention.


if we remove synchronized keyword from any one method from them then it will execute normaly and we can prevent our 
application.
*/
class A {
	
	public synchronized void funA(B b) {
		
		System.out.println("Inside fun A");
		
		b.fun2();
	}
	
	public synchronized void fun1() {
		System.out.println("Inside fun 1");
	}
	
}

class B {
	
	public synchronized  void  funB(A a) {
		
		System.out.println("start of funB");
		
		a.fun1();
		
		System.out.println("end of FunB");
	}
	
	public synchronized void fun2() {
		System.out.println("Inside fun2 of B class");
		
	}
}

class ThreadAA extends Thread {
	
	A a;
	B b;
	
	public ThreadAA ( A a , B b) {
		this.a = a;
		this.b = b;
	}
	
    @Override
    public void run() {
    	// TODO Auto-generated method stub
    	a.funA(b);
    }
}

class ThreadBB extends Thread {
	
	B b;
	A a;
	
	public ThreadBB (B b,A a) {
		this.b = b;
		this.a = a;
	}
	@Override
	public void run() {
		
		b.funB(a);
	}
}


public class DeadLock {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
		
		ThreadAA ta = new ThreadAA(a,b);
		
		ThreadBB tb = new ThreadBB(b,a);
		
		ta.start();
		tb.start();
	}
}
