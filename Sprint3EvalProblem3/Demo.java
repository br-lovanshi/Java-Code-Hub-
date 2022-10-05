package Sprint3EvalProblem3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Acallable implements Callable {
int num;

public Acallable(int n){
	this.num = n;
}
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
	int p =1;
	for(int i = 1;i<=num;i++) {
		p *= i;
	}
	return p;
	}
	
	
}

public class Demo {

	public static void main(String[] args) {
		Acallable a = new Acallable(5);
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		Future f = es.submit(a);
		
		try {
			System.out.println(f.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		es.shutdown();
		
	}
}
