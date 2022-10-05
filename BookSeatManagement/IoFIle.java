package BookSeatManagement;

import java.io.File;
import java.io.IOException;

public class IoFIle {
public static void main(String[] args) {
	
	File f = new File("abc.txt");
	System.out.println(f);
	
	try {
		f.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
	System.out.println(f.exists());
	
}
}
