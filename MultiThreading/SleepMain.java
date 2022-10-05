package MultiThreading;


class T implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 0;i<10;i++) {
			System.out.println(" thsi is   "+ i);
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
		}
			
	}
	class Tt implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			for(int i = 11;i<20;i++) {
				System.out.println("cHill BrO " + i);
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
		}
		

	
}
	class Aaa implements Runnable {
			
	
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			for(int i = 0;i<10;i++) {
				System.out.println("Select Imployee....");

			}
		}
		
	}
	class Bbb implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i = 0;i<10;i++) {
				System.out.println("Train to the Imployee....");

			}
			
		}
		
	}
	class Ccc implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			for(int i = 0;i<10;i++) {
				
					System.out.println("Asing taks to the Imployee....");
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
				
			}
		}
		
		
	}
public class SleepMain {
	public static void main(String[] args) throws InterruptedException {
		
		Thread one = new Thread(new Aaa());
		Thread two= new Thread(new Bbb());
		Thread three = new Thread(new Ccc());
		one.start();
		one.join();
		two.start();
		two.join();
		three.start();
		three.join();
		
//		Aaa a1 = new Aaa();
//		Thread a = new Thread(a1);
//		a.start();
//		
//		try {
//			a.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		int res = a1.sum;
//		
//		for(int i = 0;i<10;i++) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("inside main thread....");
//
//			System.out.println(res);
//		}
//		
//		Thread t = new Thread(new T());
//		
//		
//		Thread t1 = new Thread(new Tt());
//		
//		
//		t.start();
//		
//		t1.start();
//		
//		System.out.println("Hello world");
	}
}
