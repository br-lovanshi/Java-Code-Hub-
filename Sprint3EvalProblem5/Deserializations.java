package Sprint3EvalProblem5;

import java.util.stream.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Deserializations {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		File f = new File("Studentdata.txt");
		
		FileInputStream fis = new FileInputStream("Studentdata.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		List<Student> list = (List<Student>)ois.readObject();

				
				list.forEach(System.out::println);
		list.add( new Student(20, "ab", 200, "a@Gmail.com","1234", new Address("PB","K","39339")));		

		FileOutputStream os = new FileOutputStream("Studentdata.txt");
		ObjectOutputStream ous = new ObjectOutputStream(os);
		ous.writeObject(list);
		
		System.out.println("Success");
		
		
//		Object object = ois.readObject();
//		Student st1 = (Student)object;
		
		ois.close();
//		List<Student> st = (List<Student>)object;
//		
//		List<Student> st11 = new ArrayList<>();
		
//		st.forEach(System.out::println);
		
//		
//		st11.stream().forEach(i-> System.out.println(i));
		
		
		
		
	}
}
