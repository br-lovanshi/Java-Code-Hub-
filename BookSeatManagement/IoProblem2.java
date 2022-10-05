package BookSeatManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IoProblem2 {

	public static void main(String[] args) throws IOException {
		
//		File file = new File("abc.txt");
//		System.out.println(file.exists());
//		file.createNewFile();
//		FileReader fr = new FileReader(file);
		
		BufferedReader bf = new BufferedReader(new FileReader("abc.txt"));
		
		String f = bf.readLine();
		while(f != null ) {
			
			System.out.println(f);
			 f= bf.readLine();
		}
		
		bf.close();
	}
}
