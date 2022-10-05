package BookSeatManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.nio.Buffer;

public class FileIOn {

	public static void main(String[] args) throws IOException {
		
//		File f = new File("HelloBro.txt");
//		System.out.println(f);
//		 
//		try {
//			f.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
//		System.out.println(f.exists());
		
//		File f1  = new File("c://Merifile//chillBro.txt");
//		System.out.println(f1.exists());
//		
//		try {
//			f1.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
//		System.out.println(f1);
//		
//		System.out.println(f1.exists());
		
		File f2 = new File("c://Merifile//HelloWorld.txt");
		
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
//		System.out.println(f2);
//		System.out.println(f2.exists());
//		
		
		File fldr = new File("c://Merifile//Folder1.txt");
		
		fldr.mkdir();
//		System.out.println(fldr.exists());
//		System.out.println(fldr);
		
		
		
//		try{File newFile = new File("c://Merifile//abc.txt");
//		
//		if(newFile.createNewFile()) {
//			System.out.println("file is created");
//		}else {
//			System.out.println("File is not created");
//		}
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		
//		try {
//			FileWriter fw = new FileWriter("c://Merifile//abc.txt");
//			
//			fw.write("Brajesh\nLovanshi");
//			fw.write("focus\n");
//			char arr[] = {'o','n'};
//			fw.write(arr);
//			fw.write("\ncareer");
//			fw.flush();
//			fw.close();
//			
//			System.out.println(fw);
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		printWriter :- 
		/*
			PrintWriter pw = new PrintWriter("c://Merifile//abc.txt");
			
			pw.write(100);
			pw.println(100);
			pw.println("brajesh lovanshi");
			pw.println("chill bro");
			pw.print(true);
			
			pw.close();
		
		
		
		
//		BufferedReader:- 
		
		FileReader fr = new FileReader("c://Merifile//abc.txt");
		
		BufferedReader bf = new BufferedReader(fr);
		
		String line = bf.readLine();
		
		while(line != null  ) {
			
			System.out.println(line);
			line = bf.readLine();
			
		}
		
		bf.close();
		
		*/
		
		File newFileIo = new File("c://Merifile//computer.txt");
		
		newFileIo.createNewFile();
//		System.out.println(newFileIo);
//		System.out.println(newFileIo.exists());
		
		PrintWriter pw = new PrintWriter("c://Merifile//computer.txt");
		
		pw.write(100);
		pw.println(100);
		pw.println("RAM" + "ROM");
		pw.println("CPU");
		pw.println("PROCCESOR");
		pw.println("HIt");
		pw.println("Calculation");
		pw.print("SSD");
		pw.println("Graphic Card");
		pw.print(true);
		
		pw.close();
		
		FileReader fw = new FileReader("c://Merifile//computer.txt");
		
		BufferedReader bf = new BufferedReader(fw);
		
		String line = bf.readLine();
		
		while(line != null ) {
			
			System.out.println(line);
			
			line = bf.readLine();
			
			
			
		}
		
		bf.close();
		
		
		
		
		
		
	}
}

