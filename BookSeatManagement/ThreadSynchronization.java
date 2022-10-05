

package BookSeatManagement;

class Thread1 implements Runnable {
	int sum;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			

			for(int i = 0;i<10;i++)
			{
				sum += i;
			}
			
			this.notify();
			
		}
	}
	
}




public class ThreadSynchronization {

	public static void main(String[] args) {
		Thread1 a = new Thread1();
		Thread t1 = new Thread(a);
		
		t1.start();
		
		
		synchronized (t1) {
	try {
			t1.wait(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	int result = a.sum;
	System.out.println(result);
			
		}
	}
}
