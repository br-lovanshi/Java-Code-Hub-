package MultiThreading;

class A extends Thread {
	@Override
	public void run() {
		
	
	for(int i = 0;i<10;i++) {
		System.out.println("class A  " + i);
	}
	
	System.out.println("end of A");
}
}

public class multitreadd {

	public static void main(String[] args) {
		
		A a = new A();
		a.start();
		for(int i = 11;i<20;i++) {
		System.out.println("start of main " + i);
		B b = new B();
		b.start();
	}
		
	}
}


class B implements Runnable {
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	
	
	for(int i = 20;i<30;i++) {
		System.out.println(i);
	}
	
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
}