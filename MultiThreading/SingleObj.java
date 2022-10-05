package MultiThreading;

class ThreadA implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 0;i<20;i++) {
			String s  = Thread.currentThread().getName();
			System.out.println(s);
			System.out.println(Thread.currentThread().getPriority());
		}
		System.out.println("end of Thead ");
	}
	 
	
}  
public class SingleObj {
public static void main(String[] args) {
	
	Thread a  = new Thread(new ThreadA());
	Thread b  = new Thread(new ThreadA());
	a.setName("Dhoni");
	b.setName("Kholi");
	a.setPriority(8);
	b.setPriority(10);
	a.start();
	b.start();
}
}
