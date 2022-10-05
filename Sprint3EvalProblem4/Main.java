package Sprint3EvalProblem4;

import javax.swing.ViewportLayout;

/*
 * Q4/- Write a multithreading application which should perform the following task:
● Start the 3 thread
● Give the name of those threads as Kohli, Dhoni, Rohit
● Set the max priority to the Dhoni thread.
● Kohli thread should print from 1 to 10 number
● Dhoni thread should print Addition of first 20 number.
● Rohit Thread should print the product of first 10 number.
Note: Make sure that first Dhoni thread should print then Rohit Thread and then Kohli
Thread.
 */

class Kohli implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 1;i<=10;i++) {
			System.out.println("Kohli Thread " +i);
		}
	}
	
	
}
class Dhoni implements Runnable {
int sum;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 1;i<21;i++) {
			sum += i;
			System.out.println( "Dhoni Thread " + sum);
		}
	}
	
	
}

class Rohit implements Runnable {
int pro =1;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 1;i<10;i++ ) {
			pro  *= i;
			System.out.println("Rohit thread " + pro);
		}
	}
	
	
}
public class Main {

	public static void main(String[] args) {
		
		
		Thread dhoni = new Thread(new Dhoni());
		dhoni.setPriority(10);
		
		dhoni.start();
		
		try {
			dhoni.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Thread virat = new Thread(new Kohli());
		
		virat.start();
		
		try {
			virat.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread rohit  = new Thread(new Rohit());
		
		rohit.start();
	}
}
