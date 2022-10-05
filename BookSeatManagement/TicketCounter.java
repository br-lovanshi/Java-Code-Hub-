package BookSeatManagement;

public class TicketCounter {

	
	int availableSeats = 3;
	void bookSeat(String name, int numberOfSeats)throws NoSeatAvailableException {
		
		synchronized (this) {
			
		
			if(availableSeats >= numberOfSeats) {
		
			System.out.println(name + " Seat is booked :- "+numberOfSeats );
			availableSeats -= numberOfSeats;
			System.out.println("avalible seat is " + availableSeats);
		}else {
			
				System.out.println("Seat is " + availableSeats);
			throw new NoSeatAvailableException("sorry seat is not availble");
		
			
		}
	}
		
	}
}


class TicketBooking implements Runnable {

	
	TicketCounter ticketCounter;
	String passangerName;
	int numOfSeatToBook;
	
	
	public TicketBooking(TicketCounter tc , String name,int seat) {
		
		this.ticketCounter = tc;
		this.passangerName = name;
		this.numOfSeatToBook = seat;
	}
	
	@Override
	public void run() {
		
		try {
			ticketCounter.bookSeat(passangerName, numOfSeatToBook);
		} catch (NoSeatAvailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}


class MainThreads {
	
	public static void main(String[] args) {
		
		TicketCounter tc = new TicketCounter();
		
		Thread t1 = new Thread(new TicketBooking(tc, "Brajesh", 1));
		Thread t2 = new Thread(new TicketBooking(tc, "Vicky", 2));
		Thread t3 = new Thread(new TicketBooking(tc, "Br", 3));
		
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
	}
}