
class Comman {
	
 
	 public static void fun1(String name) {
		 
		 synchronized (Comman.class) {
		System.out.println("Chill Bro");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println(name);
		
	 }
		
 
	
 }
	
	
}

class ThreadA1 implements Runnable {

	
	String s;
	Comman c;
	
	ThreadA1(Comman c,String s){
		this.c = c;
		this.s = s;
	}
	
	@Override
	 public  void run() {
		// TODO Auto-generated method stub
	
		c.fun1(s);

		
	}
	
	
}

class ThreadB implements Runnable {

	Comman c;
	String s;
	ThreadB(Comman c,String s){
		this.c = c;
		this.s = s;
	}
	@Override
	 public void run() {
		// TODO Auto-generated method stub
		
		c.fun1(s);
	}
	
	
}
public class SencronizedMain {
	
public static void main(String[] args) {
	
	Comman c = new Comman();
	Comman c1 = new Comman();
	Thread a = new Thread(new ThreadA1(c,"Brajesh"));
	a.start();
	
//	try {
//		a.join();
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	Thread b = new Thread(new ThreadB(c1,"Vicky"));
	b.start();
	
	
}

}
