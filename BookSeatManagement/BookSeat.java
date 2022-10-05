package BookSeatManagement;

public class BookSeat {

	int totalSeat = 10;
	
	public void bookSeats(int seats) {
	
	synchronized (BookSeat.class){if(totalSeat >= seats) {
		
		 totalSeat = totalSeat -= seats;
		
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Seat is Booked");
		System.out.println("Left seat is :- " + totalSeat);
		
		}else {
			System.out.println("Seat is full ");
			System.out.println("Left seat is := " + totalSeat);
		}}
	}
}

class MainBook extends Thread{
	
    static BookSeat b ;
	int seats;
	
	@Override
    public void run() {
		
    	b.bookSeats(seats);
    	
    	
	}

	
	public static void main(String[] args) {
		
		b = new BookSeat();
		
		
		
		
		
		MainBook customer2 = new MainBook();
		customer2.seats = 1;
		customer2.start();
		
//		try {
//			customer2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		MainBook customer1 = new  MainBook();
		customer1.seats = 7;
		customer1.start();
		
	}
}