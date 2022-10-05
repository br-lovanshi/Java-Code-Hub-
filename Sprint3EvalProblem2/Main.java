package Sprint3EvalProblem2;

class ThreadX extends Thread {
	
	int pro = 1;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			
			for(int i = 1;i<11;i++ ) {
				pro *= i;
			}
			this.notify();
		}
	}
}
public class Main {

	public static void main(String[] args) {
		
		ThreadX  threadX = new ThreadX();
		
		threadX.start();
		
		synchronized (threadX) {
			
			try {
				threadX.wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(threadX.pro);
		}
		
	}
}


