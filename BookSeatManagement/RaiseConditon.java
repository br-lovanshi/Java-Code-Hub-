package BookSeatManagement;

class NoPackethere extends Exception {
	
	
		
	NoPackethere() {
		// TODO Auto-generated constructor stub
	}
	
	NoPackethere(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}

}

class Zometo {
	
	int foodPacket = 10;
	
	public void bookFood(int numOfPacket ) throws NoPackethere{
		
		
		synchronized (this) {
			
		if(foodPacket >= numOfPacket ) {
			
			System.out.println("Food is Booked");
			
			foodPacket -= numOfPacket;
			
			System.out.println(" available pacaket is " + foodPacket);
			
		}
		else {
			System.out.println("Food is Cooking pleas wait");
			throw  new NoPackethere();
		}
		}
	}
}

class ZometoApp implements Runnable {

	Zometo zometo;
	int packets;
	
	public ZometoApp(Zometo zometo,int p) {
		
		this.zometo = zometo;
		this.packets = p;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			zometo.bookFood(packets);
		} catch (NoPackethere e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
	
	
}
public class RaiseConditon {

	public static void main(String[] args) {
		
		Zometo zometo = new Zometo();
		
		
		
		Thread t1 = new Thread(new ZometoApp(zometo, 3));
		Thread t2 = new Thread(new ZometoApp(zometo, 8));
		
		t1.start();
		t2.start();
	}
}


/*
 * 

Raise condition :- 
					Java is a multithreaded language. if multiple thread execute on the same mathod so there
					might be a chance of data inconsistency and it will may occure the race condition.
					
					Raice Condition is a condition in java in witch multiple thread compete to each onter
					to get shered resource.
					
Exmple :- 	If thread A is reading a data on linkedlist and simultounsely thread b is deleting the data
from linkedlist it occurs the raice condition.


to solve this problem we use "synchronized" keyword in java.

the help of synchronized keyword we can resolve the race condition.

	*/ 				