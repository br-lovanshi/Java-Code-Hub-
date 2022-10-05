package BookSeatManagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Serialization: Serialization is the conversion of an object into a byte stream.Witch we can transer in a network or save to a database.

Derealization : Deserialization is the conversion of byte stream into a object. It is the reverse opration of serialization.


Serialization and deserialization are platform independent we can serialize in another platform and deserialize in another platform.

Serializable Interface: we can't serialize java class objects, only that class can serialize of implement a serializable interface.

Serializable is a marker interface (in this interface has no field and method).


 */
class Demo1 implements Serializable {
	
	int x = 10;
	
	void fun1() {
		System.out.println("Hello, from demo fun1");
	}
}
public class IoProblem3 {

	
	public static void main(String[] args) throws IOException, Exception {
		
//		Serialization
		
		Demo1 d = new  Demo1();
		d.x = 30;
//		File f = new File("Demo.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Demo.txt"));
		
		oos.write(100);
		oos.writeObject(d);
		oos.flush();
		oos.close();
		System.out.println("Success");
		
		
//		Deserialization 
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Demo.txt"));
		
		Object obj = ois.readObject();
		
		Demo1 d1 =  (Demo1)obj;
		d1.fun1();
		
		String s = (String) obj;
		System.out.println(s);
		
		int n = (int)obj;
		System.out.println(n);
		
		ois.close();
		
		System.out.println("Task completed");
		
		
	}
}
