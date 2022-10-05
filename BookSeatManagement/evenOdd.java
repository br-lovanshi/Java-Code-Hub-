package BookSeatManagement;


class ThreadA extends Thread  {

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 1;i<=20;i++) {
			if(i%2 == 0) {
				System.out.println("Even num " + i);
			}
		}
		
	}
	
	
}

class ThreadB extends Thread {
	
	ThreadA tr;
	
	public ThreadB(ThreadA a ) {
		this.tr = a;
	}
	
	@Override
	public void run() {
		
		try {
			tr.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		for(int i = 1;i<=20;i++) {
			if(i %2 == 1) {
				System.out.println( "Odd Num " + i);
			}
		}
		
	}
	
}
public class evenOdd {

	public static void main(String[] args) {
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB(t1);
		
		t1.start();
		
		t2.start();
	}
}
