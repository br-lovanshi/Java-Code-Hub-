package MultiThreading;


class A1 extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<10;i++) {
			System.out.println(" A! " + i);
		}
		System.out.println("end of A");
		
	}
//	System.out.println("end of B");
	
}
class B1 extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 11;i<20;i++) {
			System.out.println("B1 " + i);
		}
		System.out.println("end of B ");
	}
	
	
}

class C1 extends Thread {
	
	@Override
	
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i  = 21;i<30;i++) {
			System.out.println(i + " "+ "c" );
		}
	}
}
class test implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<10;i++) {
			System.out.println("test " + i);
		}
		System.out.println("end of test");
	}
}

class x implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 0;i<10;i++) {
			System.out.println("X " + i);
		}
		System.out.println("end of x");
	}
	
}

class y implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
	for(int i = 21;i<30;i++) {
		System.out.println(" Y " + i);
	}
	}
}
public class Mian1 {

	public static void main(String[] args) {
		
//		A1 a = new A1();
//		B1 b = new  B1();
//		C1 c = new C1();
//		
//		a.start();
//		b.start();
//		c.start();
		
//		test t1 = new test();
//		
//		Thread t = new Thread(t1);
//		t.start();
//		Thread t = new Thread(new x());
//		Thread tt = new Thread(new y());
//		t.start();
//		tt.start();
//		tt.setName("chill");
//		tt.setPriority(10);
//		
//		for(int i =40;i<50;i++) {
//			System.out.println("m ain " + i);
//		}
		
		Thread t = new Thread(new RunThread());
		Thread tt = new Thread(new RunThread());
		t.setName("chill");
		tt.setName("Bro");
//		t.start();
//		tt.start();
		
		String s = Thread.currentThread().getName();
		int p = Thread.currentThread().getPriority();
		
		System.out.println(s + " " + p);
	}
}

class RunThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<20;i++) {
			String str = Thread.currentThread().getName();
			System.out.println(str);
		}
	}
	
	
}







































