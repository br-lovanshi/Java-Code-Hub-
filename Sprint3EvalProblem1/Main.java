package Sprint3EvalProblem1;


/*
 * Q1/- Explain the meaning of the deadlock in multithreaded application, when it can occur in
multithreading applications.Write one example of deadlock.

 */
/*
 * DeadLock :- A lock without key is deadlock.
 * 
 * If two synchronized tread waiting for each other forever (infinite time ) this condition called deadlocak
 * the main resoan of deadlock is synchronized keyworkd.
 * 
 * We can't resolve deadlock because there is no any solution of deadlock but we can prevent deadlock :-
 *
 *Don't use synchronized keyword if it is not requriement
 *
 *
 *
 * In this example if we remove any one of them synchronized keyword so we can fix our application.
 * 
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
class ThreadA extends Thread {
	
	A a;
	B b;
	
	public ThreadA(A a, B b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public void run() {
		a.funA(b);
		
	};
}

class ThreadB extends Thread {
	
	A a;
	B b;
	
	public ThreadB(A a, B b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public void run() {
		b.funB(a);
	};
}

public class Main {
public static void main(String[] args) {
	
	A a = new A();
	B b = new B();
	
	ThreadA threadA = new ThreadA(a, b);
	ThreadB b2 = new ThreadB(a, b);
	
	threadA.start();
	b2.start();
	
}
}
