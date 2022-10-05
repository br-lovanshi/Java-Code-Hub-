package BookSeatManagement;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainDeserializatons {
	
		public static void main(String[] args) throws IOException, ClassNotFoundException {
			
			
			FileInputStream fis = new FileInputStream("c://Merifile//chillBro.txt");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object obj = ois.readObject();
			
			Aseri a = (Aseri) obj;
			
			a.funA();
			
			String s = (String) ois.readObject();
			System.out.println(s);
			
			int n = (int) ois.readObject();
			System.out.println(n);
			
			
			
			
			ois.close();
		}
		
		
	
}
