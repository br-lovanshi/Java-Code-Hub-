package BookSeatManagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IoProbem1 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("abc.txt");
	file.createNewFile();
		PrintWriter pw = new PrintWriter(file);
		
		
		pw.write(100);
		pw.println("Employee Details");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name");
		String name = sc.nextLine();
		System.out.println();
		pw.println(name);
		System.out.println("Enter address");
		String address = sc.nextLine();
		
		pw.println(address);
		
		pw.close();
		System.out.println("Success");
	}
}
