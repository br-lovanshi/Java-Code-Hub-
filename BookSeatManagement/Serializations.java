package BookSeatManagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Aseri implements Serializable {
	
	int num = 10;
	
	public void funA() {
		
		System.out.println("inside funA of class");
		System.out.println(num);
	}
}
public class Serializations {

	public static void main(String[] args) throws IOException {
		
		Aseri obj  = new Aseri();
		
		obj.num = 20;
		
		FileOutputStream fos = new FileOutputStream("c://Merifile//chillBro.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(obj);
		oos.writeObject("walcome");
		oos.writeObject(10);
		oos.writeObject("chill bro");
		oos.flush();
		oos.close();
		System.out.println("Success");
		
	}
}

