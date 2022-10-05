package Problem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Payment {

	public void doPayment();
}

class CashPayment implements Payment{
private int amount;

public CashPayment(int amnt) {
	this.amount = amnt;
	// TODO Auto-generated constructor stub
}
@Override
public void doPayment() {
	// TODO Auto-generated method stub
	
	System.out.println( " Payment done using Cash  " + amount );
}


}

class CardPayment implements Payment{
private int amount;

public CardPayment(int amt) {
	// TODO Auto-generated constructor stub
	this.amount = amt;
}
@Override
public void doPayment() {
	// TODO Auto-generated method stub
	System.out.println("Payment done using Card  " +amount );
}

}




class Demo {
	public  void doTransactions(List<? extends Payment > list){
		
		for(Payment i : list) {
			i.doPayment();
		}
	}
	
	public static void main(String[] args) {
		
		List<CardPayment> card= new ArrayList<>();
		card.add(new CardPayment(8000));
		card.add(new CardPayment(6000));
		List<CashPayment> cash =  Arrays.asList(new CashPayment(7000),new CashPayment(9900));
	}
}