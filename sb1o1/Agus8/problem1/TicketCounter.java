package sb1o1.Agus8.problem1;

public class TicketCounter {
    int availableSeats = 3;
    void bookSeat(String name, int numberOfSeats) throws NoSeatAvailableException {
try {

    if(numberOfSeats <= availableSeats){
        availableSeats = availableSeats - numberOfSeats;
        System.out.println(name + " avalilabelSeats is " + availableSeats );
}

} catch (Exception e ) {
    String st = String.valueOf(new NoSeatAvailableException("not a valid seat"));
    System.out.println(st);
}

    }
}

class TicketBooking extends Thread {
    TicketCounter tc;
    String passengerName;
    int numberOfSeats;

    public TicketBooking(TicketCounter tc, String passengerName, int numberOfSeats) {
        this.tc = tc;
        this.passengerName = passengerName;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void run(){

        try{
            tc.bookSeat(passengerName,numberOfSeats);
//            System.out.println();
        } catch (NoSeatAvailableException e) {
            throw new RuntimeException(e);
        }
    }
}

class Main {
    public static void main(String[] args) {
        TicketCounter tc = new TicketCounter();
        TicketBooking t1 = new TicketBooking(tc,"Brajesh",2);
        TicketBooking t2 = new TicketBooking(tc,"vicky ",1);
        TicketBooking t3 = new TicketBooking(tc,"threee",5);

t1.start();
try {
    t1.join();

} catch (InterruptedException e) {
    throw new RuntimeException(e);
}
        t2.start();
try {
    t2.join();
} catch (InterruptedException e) {
    throw new RuntimeException(e);
}
        t3.start();
try
{
    t3.join();
} catch (InterruptedException e) {
    throw new RuntimeException(e);
}

    }
}