package Day5;

class AnimalException extends Exception {
	public AnimalException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
	public AnimalException(){
		
	}
}
public abstract class Animals {
abstract void eat() throws AnimalException;
}

class Tiger extends Animals {

	@Override
	void eat() throws AnimalException {
		// TODO Auto-generated method stub
	System.out.println("tiger is eating");
	throw new AnimalException();
		
	}
	public static void main(String[] args) {
		Animals an = new Tiger();
		try {
			an.eat();
		} catch (AnimalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}