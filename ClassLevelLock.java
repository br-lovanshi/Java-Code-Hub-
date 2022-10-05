
class Comman1 {
	
	
	void fun1(String s) {
		
		
		synchronized(Comman1.class){System.out.println("Hello ");
		

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s);
	}
	}
}

class Thread11 implements Runnable{

	String s;
	Comman1 c;
	
	Thread11(String s , Comman1 ca){
		this.s = s;
		this.c = ca;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		c.fun1(s);
		
	}
	
}

class Thread22 implements Runnable {
String s;
Comman1 c;
Thread22(String s, Comman1 ca){
	this.s = s;
	this.c = ca;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		c.fun1(s);
	}
	
	
}


public class ClassLevelLock {

	public static void main(String[] args) {
		Comman1 ca = new Comman1();
		Thread t = new Thread(new Thread11("Brajesh",ca));
		t.start();
		
		Comman1 c1 = new Comman1();
		Thread t1 = new Thread(new Thread22("VIcky",c1));
		
		t1.start();
	}
}
